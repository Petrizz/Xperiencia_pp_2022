package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "TelefoneCand")
public class TelefoneCand {

    @EmbeddedId
    private TelefoneId id = new TelefoneId();

    @ManyToOne
    @MapsId("idPessoa")
    private Candidato candidato;

    @Column(nullable = false)
    private String Numbero;
}
