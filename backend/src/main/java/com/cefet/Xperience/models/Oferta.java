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
   // @EmbeddedId
    //private OfertaId idOferta = new OfertaId();

 //   @ManyToOne
  //  @JoinColumn(name = "id_empregador", nullable = false)
   // private Empregador idEmpregador;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String funcao;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String cargaHoraria;

    @Column(nullable = false)
    private String palavrasChaves;

    private String remuneracao;


}
