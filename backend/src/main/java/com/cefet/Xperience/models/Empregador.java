package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;


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
    private Long idEmpregador;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length =16 )
    private String cpf;

    public Empregador(String test, String dad) {
        setNome(test);
        setCpf(dad);
    }



   /* @Column(length = 60)
    private String cnpj;
    @Column(length = 60, nullable = false)
    private Instant data;
    @Column(length = 16, nullable = false)
    private String rg;*/

}