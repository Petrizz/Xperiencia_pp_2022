package com.cefet.Xperience.service;

import com.cefet.Xperience.models.Empregador;
import com.cefet.Xperience.repository.EmpregadorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpregadorService {

    private final Logger log = LoggerFactory.getLogger(EmpregadorService.class);
    @Autowired
    EmpregadorRepository empregadorRepository;

    public Empregador save(Empregador empregador) {
        return empregadorRepository.save(empregador);
    }

    public Optional<Empregador> findOne(Long id) {
        log.info("Request to get Empregador : {}", id);
        return empregadorRepository.findById(id);
    }

    public List<Empregador> findAllList(){
        log.info("Request to get All Empregadores");
        List<Empregador> empregadorList = empregadorRepository.findAll();
        log.info("Return of getAllList " + empregadorList.size());
        return empregadorList;
    }

    public void delete(Long id) {
        log.info("Request to delete Empregador : {}", id);
        empregadorRepository.deleteById(id);
    }

    public List<Empregador> saveAll(List<Empregador> EmpregadorList) {
        log.info("Request to save Empregador : {}", EmpregadorList);
        EmpregadorList = empregadorRepository.saveAll(EmpregadorList);
        return EmpregadorList;
    }
}
