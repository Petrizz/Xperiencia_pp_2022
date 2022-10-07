package com.cefet.Xperience.models;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class OfertaId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idOferta;
    private Long idEmpregador;

}
