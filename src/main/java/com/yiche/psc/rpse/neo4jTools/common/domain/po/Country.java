package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.util.Date;

public class Country {
    private Integer id;

    private String name;

    private String nationalflag;

    private Date updatetime;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalflag() {
        return nationalflag;
    }

    public void setNationalflag(String nationalflag) {
        this.nationalflag = nationalflag;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}