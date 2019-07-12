package com.gaalaxy.api.Tecnico;

import javax.persistence.*;

@Entity
@Table(name = "tecnico")
public class TecnicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdtecnico")
    private Integer cdTecnico;

    @Column(name="nmtecnico")
    private String nmTecnico;

    @Column(name="cdtipotecnico")
    private Integer cdTipoTecnico;

    public Integer getCdTecnico() {
        return cdTecnico;
    }

    public void setCdTecnico(Integer cdTecnico) {
        this.cdTecnico = cdTecnico;
    }

    public String getNmTecnico() {
        return nmTecnico;
    }

    public void setNmTecnico(String nmTecnico) {
        this.nmTecnico = nmTecnico;
    }

    public Integer getCdTipoTecnico() {
        return cdTipoTecnico;
    }

    public void setCdTipoTecnico(Integer cdTipoTecnico) {
        this.cdTipoTecnico = cdTipoTecnico;
    }
}
