package com.cefet.Xperience;

import com.cefet.Xperience.models.Candidato;
import com.cefet.Xperience.models.Empregador;
import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.repository.CandidatoRepository;
import com.cefet.Xperience.repository.EmpregadorRepository;
import com.cefet.Xperience.repository.OfertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XperienceApplication implements ApplicationRunner {

    @Autowired
    EmpregadorRepository empregadorRepository;

    @Autowired
    CandidatoRepository candidatoRepository;

    @Autowired
    OfertaRepository ofertaRepository;

	public static void main(String[] args) {
		SpringApplication.run(XperienceApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args){
        Empregador emp = new Empregador(1L, "test","dad");
        emp = empregadorRepository.save(emp);
        System.out.println(emp);
    }
}
