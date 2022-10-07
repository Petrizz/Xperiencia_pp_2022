package com.cefet.Xperience.service;

import com.cefet.Xperience.models.Candidato;
import com.cefet.Xperience.repository.CandidatoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService {

    private final Logger log = LoggerFactory.getLogger(CandidatoService.class);
    @Autowired
    CandidatoRepository candidatoRepository;

    public Candidato save(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    public Optional<Candidato> findOne(Long id) {
        log.info("Request to get Candidato : {}", id);
        return candidatoRepository.findById(id);
    }

    public List<Candidato> findAllList(){
        log.info("Request to get All Candidatoes");
        List<Candidato> empregadorList = candidatoRepository.findAll();
        log.info("Return of getAllList " + empregadorList.size());
        return empregadorList;
    }

    public void delete(Long id) {
        log.info("Request to delete Candidato : {}", id);
        candidatoRepository.deleteById(id);
    }

    public List<Candidato> saveAll(List<Candidato> CandidatoList) {
        log.info("Request to save Candidato : {}", CandidatoList);
        CandidatoList = candidatoRepository.saveAll(CandidatoList);
        return CandidatoList;
    }
}
