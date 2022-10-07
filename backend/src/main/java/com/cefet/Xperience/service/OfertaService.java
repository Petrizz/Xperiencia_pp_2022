package com.cefet.Xperience.service;

import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.repository.OfertaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaService {


    private final Logger log = LoggerFactory.getLogger(EmpregadorService.class);

    @Autowired
    OfertaRepository ofertaRepository;

    public Oferta save(Oferta oferta){
        return ofertaRepository.save(oferta);
    }


    public Optional<Oferta> findOne(Long id) {
        log.info("Request to get Oferta : {}", id);
        return ofertaRepository.findById(id);
    }

    public List<Oferta> findAllList(){
        log.info("Request to get All Ofertas");
        List<Oferta> empregadorList = ofertaRepository.findAll();
        log.info("Return of getAllList " + empregadorList.size());
        return empregadorList;
    }

    public void delete(Long id) {
        log.info("Request to delete Oferta : {}", id);
        ofertaRepository.deleteById(id);
    }

    public List<Oferta> saveAll(List<Oferta> OfertaList) {
        log.info("Request to save Oferta : {}", OfertaList);
        OfertaList = ofertaRepository.saveAll(OfertaList);
        return OfertaList;
    }

}
