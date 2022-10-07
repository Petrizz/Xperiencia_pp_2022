package com.cefet.Xperience.controller.api.v1;

import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.service.OfertaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/v1/oferta")
public class OfertaController {
    private static OfertaService ofertaService;

    public OfertaController(OfertaService ofertaService){
        this.ofertaService = ofertaService;
    }

    //REsponseEntity ele pega a classe e transforma no tipo json para retornar no id
    @GetMapping("/{id}")
    public ResponseEntity<Oferta> getOferta(@PathVariable Long id){
        //@PAthVariable com com que o id da uri case com o id do metodo
        Optional<Oferta> ServOp = ofertaService.findOne(id);
        if(ServOp.isPresent()){//verifica se é igual ou nn a null
            //responseentity.ok é o codico 200 hhtp
            return ResponseEntity.ok().body(ServOp.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Oferta>> getOferta(){
        List<Oferta> servList = ofertaService.findAllList();
        if(servList.size() > 0){
            return ResponseEntity.ok().body(servList);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/")
    public ResponseEntity<Oferta> update(@RequestBody Oferta oferta){
        //Utiliza a msm barra pois o verbo é outro,@RequestBody ele recebe um json oferta json e converte para um objeto oferta
        if (oferta.getIdOferta() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Oferta id == null");
        }
        oferta = ofertaService.save(oferta);
        return ResponseEntity.ok().body(oferta);

    }

    @PostMapping
    public ResponseEntity<Oferta> create(@RequestBody Oferta oferta){
        if(oferta.getIdOferta() != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "New ca can't exists id.");
        }
        Oferta result = ofertaService.save(oferta);
        return ResponseEntity.ok().body(oferta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOferta(@PathVariable Long id){
        ofertaService.delete(id);
        return ResponseEntity.noContent().build();

    }
}
