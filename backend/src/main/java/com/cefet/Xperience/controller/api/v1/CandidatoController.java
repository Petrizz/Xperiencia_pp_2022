package com.cefet.Xperience.controller.api.v1;

import com.cefet.Xperience.models.Candidato;
import com.cefet.Xperience.service.CandidatoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/v1/candidato")
public class CandidatoController {


    private static CandidatoService candidatoService;

    public CandidatoController(CandidatoService candidatoService){
        this.candidatoService = candidatoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidato> getCandidato(@PathVariable Long id){
        Optional<Candidato> ServOp = candidatoService.findOne(id);
        if(ServOp.isPresent()){//verifica se é igual ou nn a null
            return ResponseEntity.ok().body(ServOp.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Candidato>> getCandidato(){
        List<Candidato> servList = candidatoService.findAllList();
        if(servList.size() > 0){
            return ResponseEntity.ok().body(servList);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/")
    public ResponseEntity<Candidato> update(@RequestBody Candidato candidato){
        if (candidato.getId() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Pet id == null");
        }
        candidato = candidatoService.save(candidato);
        return ResponseEntity.ok().body(candidato);

    }

    @PostMapping
    public ResponseEntity<Candidato> create(@RequestBody Candidato candidato){
        if(candidato.getId() != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "New ca can't exists id.");
        }
        Candidato result = candidatoService.save(candidato);
        return ResponseEntity.ok().body(candidato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePet(@PathVariable Long id){
        candidatoService.delete(id);
        return ResponseEntity.noContent().build();

    }
}
