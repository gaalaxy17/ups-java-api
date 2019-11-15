package com.gaalaxy.api.Equipamento;

import com.gaalaxy.api.Unidade.UnidadeEntity;

import javax.persistence.*;

@Entity
@Table(name = "equipamento")
public class EquipamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdEquipamento")
    private Integer cdEquipamento;

    @Column(name = "dsEquipamento")
    private String dsEquipamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cdUnidade")
    private UnidadeEntity unidade;

}
