package com.gaalaxy.api.Unidade;

import com.gaalaxy.api.Empresa.EmpresaEntity;

import javax.persistence.*;

@Entity
@Table(name="unidade")
public class UnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdunidade")
    private Integer cdUnidade;

    @Column(name="nmunidade")
    private String nmUnidade;

    @Column(name="nrcep")
    private String nrCep;

    @Column(name="nmrua")
    private String nmRua;

    @Column(name="nrnumero")
    private Integer nrNumero;

    @Column(name="dscomplemento")
    private String dsComplemento;

    @Column(name="nmbairro")
    private String nmBairro;

    @Column(name="nmcidade")
    private String nmCidade;

    @Column(name="sgestado")
    private String sgEstado;

    @ManyToOne
    private EmpresaEntity empresa;

    @Column(name="dscontato")
    private String dsContato;

    @Column(name="nrtelefone")
    private String nrTelefone;

    @Column(name="dsemailcontato")
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
