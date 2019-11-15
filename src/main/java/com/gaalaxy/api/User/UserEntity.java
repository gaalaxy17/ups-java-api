package com.gaalaxy.api.User;

import javax.persistence.*;


@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cdUser")
    private Integer cdUser;

    @Column(name="dsUser")
    private String dsUser;

    @Column(name="dsPass")
    private String dsPass;

    @Column(name="dsNome")
    private String dsNome;

    @Column(name="cdTipo")
    private Integer cdTipo;

    @Column(name="fgIsAtivo")
    private Integer fgIsAtivo;

    public Integer getCdUser() {
        return cdUser;
    }

    public String getDsUser() {
        return dsUser;
    }

    public void setDsUser(String dsUser) {
        this.dsUser = dsUser;
    }

    public String getDsPass() {
        return dsPass;
    }

    public void setDsPass(String dsPass) {
        this.dsPass = dsPass;
    }

    public String getDsNome() {
        return dsNome;
    }

    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }

    public Integer getCdTipo() {
        return cdTipo;
    }

    public void setCdTipo(Integer cdTipo) {
        this.cdTipo = cdTipo;
    }

    public Integer getFgIsAtivo() {
        return fgIsAtivo;
    }

    public void setFgIsAtivo(Integer fgIsAtivo) {
        this.fgIsAtivo = fgIsAtivo;
    }
}
