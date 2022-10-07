package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity (name = "Candidato")
public class Candidato {

    //@ID Diz que a proximo atributo vai ser o id e o generated diz que vai ser auto incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCandidato;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 16, nullable = false)
    private String cpf;

    @Column(length = 16, nullable = false)
    private String RG;

    @Column(nullable = false)
    private String dtNascimento;
   // private Instant dtNascimento; instant esta no video antes de api min 10:58

    @Column(length = 60, nullable = false)
    private String cidade;

    @Column(length = 60, nullable = false)
    private String bairro;

    @Column(length = 60, nullable = false)
    private String rua;

    @Column(length = 60, nullable = false)
    private String numero;

    @Column(length = 60, nullable = false)
    private String cep;

    public Candidato(String nome, String cpf, String rg, String dtNascimento, String cidade, String bairro, String rua, String numero, String cep) {
        this.nome = nome;
        this.bairro = bairro;
        this.cep = cep;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.cidade = cidade;
        this.RG = rg;
        this.numero = numero;
        this.rua = rua;
    }
}
