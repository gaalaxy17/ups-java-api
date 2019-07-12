package com.gaalaxy.api.Equipamento;

import com.gaalaxy.api.Unidade.UnidadeEntity;

import javax.persistence.*;

@Entity
@Table(name = "equipamento")
public class EquipamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdequipamento")
    private Integer cdEquipamento;

    @Column(name = "dsequipamento")
    private String dsEquipamento;

    @ManyToOne
    @JoinColumn(name="cdunidade")
    private UnidadeEntity unidade;

}
