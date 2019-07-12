package com.gaalaxy.api.Empresa;

import javax.persistence.*;

@Entity
@Table(name="empresa")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdempresa")
    private Integer cdEmpresa;

    @Column(name="nmEmpresa")
    private String nmEmpresa;

    @Column(name="nrcnpj")
    private String nrCnpj;

    @Column(name="nrIe")
    private String nrIe;

    public Integer getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(Integer cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public String getNrCnpj() {
        return nrCnpj;
    }

    public void setNrCnpj(String nrCnpj) {
        this.nrCnpj = nrCnpj;
    }

    public String getNrIe() {
        return nrIe;
    }

    public void setNrIe(String nrIe) {
        this.nrIe = nrIe;
    }
}
