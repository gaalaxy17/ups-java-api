package com.gaalaxy.api.Atendimento;

import com.gaalaxy.api.Empresa.EmpresaEntity;
import com.gaalaxy.api.Unidade.UnidadeEntity;
import com.gaalaxy.api.User.UserEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="atendimento")
public class AtendimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdAtendimento")
    private Integer cdAtendimento;

    @Column(name="dsTipoAtendimento")
    private String dsTipoAtendimento;

    @Column(name="dsEquipamento")
    private String dsEquipamento;

    @Column(name="dtAtendimento")
    private Date dtAtendimento;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cd_empresa")
    private EmpresaEntity empresa;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cd_unidade")
    private UnidadeEntity unidade;

    @Column(name="dsDescricao")
    private String dsDescricao;

    @Column(name="stStatus")
    private String stStatus;

    @Column(name="stStatusInterno")
    private String stStatusInterno;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cd_user_chamado")
    private UserEntity userChamado;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cd_user_atendimento")
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

    public String getStStatusInterno() {
        return stStatusInterno;
    }

    public void setStStatusInterno(String stStatusInterno) {
        this.stStatusInterno = stStatusInterno;
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
