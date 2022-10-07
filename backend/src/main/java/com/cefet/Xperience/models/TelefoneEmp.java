package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "TelefoneEmp")
public class TelefoneEmp {

    @EmbeddedId
    private TelefoneId id = new TelefoneId();

    @ManyToOne
    @MapsId("idPessoa")
    private Candidato empregador;

    @Column(nullable = false)
    private String Numbero;
}
