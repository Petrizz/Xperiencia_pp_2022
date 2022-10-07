package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity (name = "Oferta")
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOferta;

    @Column
    private String titulo;
/*
    @Column(nullable = false)
    private String funcao;

    @Column
    private String descricao;

    @Column
    private String cargaHoraria;

    @Column
    private String palavrasChaves;

    @Column
    private String remuneraca;
*/
    @ManyToOne
    @JoinColumn(name = "id_empregador", nullable = false)
    private Empregador idEmpregador;

    @Column
    private String descricaoEmpregador;

    @Column
    private String notaEmpregador;

    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato idCandidato;

    @Column
    private String descricaoCandidato;

    @Column
    private String notaCandidato;


    public Oferta(String titulo, Empregador emp, String descricaoEmpregador, String notaEmp, Candidato cad, String descricaoCandidato, String notaCandidato) {
        this.titulo = titulo;
        this.idEmpregador = emp;
        this.descricaoEmpregador = descricaoEmpregador;
        this.notaEmpregador = notaEmp;
        this.idCandidato = cad;
        this.descricaoCandidato = descricaoCandidato;
        this.notaCandidato = notaCandidato;
    }

    public Long getId() {
        return this.idOferta;
    }
}
