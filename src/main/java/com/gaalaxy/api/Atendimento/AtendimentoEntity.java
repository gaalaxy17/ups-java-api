package com.gaalaxy.api.Atendimento;

import com.gaalaxy.api.Unidade.UnidadeEntity;
import com.gaalaxy.api.User.UserEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="atendimento")
public class AtendimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdatendimento")
    private Integer cdAtendimento;

    @Column(name="dstipoatendimento")
    private String dsTipoAtendimento;

    @Column(name="dsequipamento")
    private String dsEquipamento;

    @Column(name="dtatendimento")
    private Date dtAtendimento;

    @OneToOne
    private UnidadeEntity unidade;

    @Column(name="dsdescricao")
    private String dsDescricao;

    @Column(name="ststatus")
    private String stStatus;

    @Column(name="ststatusinterno")
    private String stStatusINterno;

    @OneToOne
    private UserEntity userChamado;

    @OneToOne
    private UserEntity userAtendimento;

    public Integer getCdAtendimento() {
        return cdAtendimento;
    }

    public void setCdAtendimento(Integer cdAtendimento) {
        this.cdAtendimento = cdAtendimento;
    }

    public String getDsTipoAtendimento() {
        return dsTipoAtendimento;
    }

    public void setDsTipoAtendimento(String dsTipoAtendimento) {
        this.dsTipoAtendimento = dsTipoAtendimento;
    }

    public String getDsEquipamento() {
        return dsEquipamento;
    }

    public void setDsEquipamento(String dsEquipamento) {
        this.dsEquipamento = dsEquipamento;
    }

    public Date getDtAtendimento() {
        return dtAtendimento;
    }

    public void setDtAtendimento(Date dtAtendimento) {
        this.dtAtendimento = dtAtendimento;
    }

    public UnidadeEntity getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeEntity unidade) {
        this.unidade = unidade;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public String getStStatus() {
        return stStatus;
    }

    public void setStStatus(String stStatus) {
        this.stStatus = stStatus;
    }

    public String getStStatusINterno() {
        return stStatusINterno;
    }

    public void setStStatusINterno(String stStatusINterno) {
        this.stStatusINterno = stStatusINterno;
    }

    public UserEntity getUserChamado() {
        return userChamado;
    }

    public void setUserChamado(UserEntity userChamado) {
        this.userChamado = userChamado;
    }

    public UserEntity getUserAtendimento() {
        return userAtendimento;
    }

    public void setUserAtendimento(UserEntity userAtendimento) {
        this.userAtendimento = userAtendimento;
    }
}
