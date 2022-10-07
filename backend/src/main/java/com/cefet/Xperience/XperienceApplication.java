package com.cefet.Xperience;

import com.cefet.Xperience.models.Candidato;
import com.cefet.Xperience.models.Empregador;
import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.service.CandidatoService;
import com.cefet.Xperience.service.EmpregadorService;
import com.cefet.Xperience.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XperienceApplication implements ApplicationRunner {

    @Autowired
    CandidatoService candidatoService;

    @Autowired
    EmpregadorService empregadorService;

    @Autowired
    OfertaService ofertaService;

	public static void main(String[] args) {
		SpringApplication.run(XperienceApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args){
        Empregador emp = new Empregador("test","dad");
        emp = empregadorService.save(emp);
        System.out.println(emp);

        Candidato cad = new Candidato("Pedro", "1033411111", "MG_12", "18212003", "RAul", "Janeiro", "Segunda rua", "12", "35323000");
        cad = candidatoService.save(cad);
        System.out.println(cad);

        Candidato cad2 = new Candidato();

        Oferta of = new Oferta("Estagio php", emp, "", "", cad, "", "");
        ofertaService.save(of);

        Oferta of2 = new Oferta("SEnior", emp, "", "", null, "", "");
        ofertaService.save(of2);

        System.out.println(of);


    }
}
