package com.gaalaxy.api.User;

import javax.persistence.*;


@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cduser")
    private Integer cdUser;

    @Column(name="dsuser")
    private String dsUser;

    @Column(name="dspass")
    private String dsPass;

    @Column(name="dsnome")
    private String dsNome;

    @Column(name="dstipo")
    private Integer dsTipo;

    @Column(name="fgisativo")
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

    public Integer getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(Integer dsTipo) {
        this.dsTipo = dsTipo;
    }

    public Integer getFgIsAtivo() {
        return fgIsAtivo;
    }

    public void setFgIsAtivo(Integer fgIsAtivo) {
        this.fgIsAtivo = fgIsAtivo;
    }
}
