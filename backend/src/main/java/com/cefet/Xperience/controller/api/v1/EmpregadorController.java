package com.cefet.Xperience.controller.api.v1;

import com.cefet.Xperience.models.Empregador;
import com.cefet.Xperience.service.EmpregadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/v1/empregador")
public class EmpregadorController {


    private static EmpregadorService empregadorService;

    public EmpregadorController(EmpregadorService empregadorService){
        this.empregadorService = empregadorService;
    }

    //REsponseEntity ele pega a classe e transforma no tipo json para retornar no id
    @GetMapping("/{id}")
    public ResponseEntity<Empregador> getEmpregador(@PathVariable Long id){
        //@PAthVariable com com que o id da uri case com o id do metodo
        Optional<Empregador> ServOp = empregadorService.findOne(id);
        if(ServOp.isPresent()){//verifica se é igual ou nn a null
            //responseentity.ok é o codico 200 hhtp
            return ResponseEntity.ok().body(ServOp.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Empregador>> getEmpregador(){
        List<Empregador> servList = empregadorService.findAllList();
        if(servList.size() > 0){
            return ResponseEntity.ok().body(servList);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/")
    public ResponseEntity<Empregador> update(@RequestBody Empregador empregador){
        //Utiliza a msm barra pois o verbo é outro,@RequestBody ele recebe um json empregador json e converte para um objeto empregador
        if (empregador.getIdEmpregador() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Pet id == null");
        }
        empregador = empregadorService.save(empregador);
        return ResponseEntity.ok().body(empregador);

    }

    @PostMapping
    public ResponseEntity<Empregador> create(@RequestBody Empregador empregador){
        if(empregador.getIdEmpregador() != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "New ca can't exists id.");
        }
        Empregador result = empregadorService.save(empregador);
        return ResponseEntity.ok().body(empregador);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePet(@PathVariable Long id){
        empregadorService.delete(id);
        return ResponseEntity.noContent().build();

    }
}
