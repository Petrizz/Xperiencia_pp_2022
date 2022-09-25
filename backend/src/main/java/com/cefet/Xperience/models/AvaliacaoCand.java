package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "AvaliacaoCand")
public class AvaliacaoCand {

    @EmbeddedId
    private AvaliacaoId id = new AvaliacaoId();

    @ManyToOne
    @MapsId("idOferta")
    private Oferta oferta;

    @ManyToOne
    @MapsId("idCandidato")
    private Candidato candidato;

    @Column
    private String Descricao;

    @Column(nullable = false)
    private String Nota;


}