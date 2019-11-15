package com.gaalaxy.api.Tecnico;

import javax.persistence.*;

@Entity
@Table(name = "tecnico")
public class TecnicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdTecnico")
    private Integer cdTecnico;

    @Column(name="nmTecnico")
    private String nmTecnico;

    @Column(name="cdTipoTecnico")
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
