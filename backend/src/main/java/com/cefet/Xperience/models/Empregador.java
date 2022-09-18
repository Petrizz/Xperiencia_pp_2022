package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Empregador") // Diz que essa classe vai criar a entidade Empregador no bd
public class Empregador {
    //@ID Diz que a proximo atributo vai ser o id e o generated diz que vai ser auto incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpregador;

   // @OneToMany
  //  private List<Oferta> ofertas = new ArrayList<Oferta>();

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 16, nullable = false)
    private String cpf;

    @Column(length = 24, nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private Instant data;
}
