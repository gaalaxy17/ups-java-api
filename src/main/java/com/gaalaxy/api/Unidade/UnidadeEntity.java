package com.gaalaxy.api.Unidade;

import com.gaalaxy.api.Empresa.EmpresaEntity;

import javax.persistence.*;

@Entity
@Table(name="unidade")
public class UnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdUnidade")
    private Integer cdUnidade;

    @Column(name="nmUnidade")
    private String nmUnidade;

    @Column(name="nrCep")
    private String nrCep;

    @Column(name="nmRua")
    private String nmRua;

    @Column(name="nrNumero")
    private Integer nrNumero;

    @Column(name="dsComplemento")
    private String dsComplemento;

    @Column(name="nmBairro")
    private String nmBairro;

    @Column(name="nmCidade")
    private String nmCidade;

    @Column(name="sgEstado")
    private String sgEstado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cd_empresa")
    private EmpresaEntity empresa;

    @Column(name="dsContato")
    private String dsContato;

    @Column(name="nrTelefone")
    private String nrTelefone;

    @Column(name="dsEmailContato")
    private String dsEmailContato;


    public Integer getCdUnidade() {
        return cdUnidade;
    }

    public void setCdUnidade(Integer cdUnidade) {
        this.cdUnidade = cdUnidade;
    }

    public String getNmUnidade() {
        return nmUnidade;
    }

    public void setNmUnidade(String nmUnidade) {
        this.nmUnidade = nmUnidade;
    }

    public String getNrCep() {
        return nrCep;
    }

    public void setNrCep(String nrCep) {
        this.nrCep = nrCep;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public Integer getNrNumero() {
        return nrNumero;
    }

    public void setNrNumero(Integer nrNumero) {
        this.nrNumero = nrNumero;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getSgEstado() {
        return sgEstado;
    }

    public void setSgEstado(String sgEstado) {
        this.sgEstado = sgEstado;
    }

    public EmpresaEntity getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaEntity empresa) {
        this.empresa = empresa;
    }

    public String getDsContato() {
        return dsContato;
    }

    public void setDsContato(String dsContato) {
        this.dsContato = dsContato;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public String getDsEmailContato() {
        return dsEmailContato;
    }

    public void setDsEmailContato(String dsEmailContato) {
        this.dsEmailContato = dsEmailContato;
    }
}
