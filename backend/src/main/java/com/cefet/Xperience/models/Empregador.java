package com.cefet.Xperience.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Empregador") // Diz que essa classe vai criar a entidade Empregador no bd
public class Empregador {
    //@ID Diz que a proximo atributo vai ser o id e o generated diz que vai ser auto incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 16, nullable = false)
    private String cpf;

    @Column(length = 24, nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private Date data;
}
