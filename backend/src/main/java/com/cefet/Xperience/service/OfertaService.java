package com.cefet.Xperience.service;

import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.repository.OfertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfertaService {

    @Autowired
    OfertaRepository ofertaRepository;

    public Oferta save(Oferta oferta){
        return ofertaRepository.save(oferta);
    }

}
