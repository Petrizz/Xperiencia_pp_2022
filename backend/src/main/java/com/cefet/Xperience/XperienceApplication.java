package com.cefet.Xperience;

import com.cefet.Xperience.models.Candidato;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XperienceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XperienceApplication.class, args);
		Candidato c = new Candidato();
	}

}
