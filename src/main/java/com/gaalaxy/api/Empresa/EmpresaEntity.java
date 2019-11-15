package com.gaalaxy.api.Empresa;

import javax.persistence.*;

@Entity
@Table(name="empresa")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdEmpresa")
    private Integer cdEmpresa;

    @Column(name="nmEmpresa")
    private String nmEmpresa;

    @Column(name="nrCnpj")
    private String nrCnpj;

    @Column(name="nrIe")
    private String nrIe;
    
    @Column(name="fg_ativo")
    private Integer fgAtivo;

    public Integer getFgAtivo() {
		return fgAtivo;
	}

	public void setFgAtivo(Integer fgAtivo) {
		this.fgAtivo = fgAtivo;
	}

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
