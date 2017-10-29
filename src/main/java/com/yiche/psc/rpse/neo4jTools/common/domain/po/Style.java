package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Style {
    private Integer id;

    private Integer modelid;

    private Integer year;

    private String name;

    private Short stylebodytype;

    private Short productionstatus;

    private Short salestatus;

    private String timetomarket;

    private BigDecimal nowmsrp;

    private String spellfirst;

    private String spell;

    private String allspell;

    private Boolean isremoved;

    private Boolean isenabled;

    private String updatetime;

    private String createtime;

    private Date updatetime2;

    private Date createtime2;

    private Boolean iswagon;

    private String bodycolor;

    private String neishicolor;

    private Date dotime;

    private Date shougai;

    public Set<Styleproperty> getStylepropertySet() {
        return stylepropertySet;
    }

    public void setStylepropertySet(Set<Styleproperty> stylepropertySet) {
        this.stylepropertySet = stylepropertySet;
    }

    private Set<Styleproperty> stylepropertySet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getStylebodytype() {
        return stylebodytype;
    }

    public void setStylebodytype(Short stylebodytype) {
        this.stylebodytype = stylebodytype;
    }

    public Short getProductionstatus() {
        return productionstatus;
    }

    public void setProductionstatus(Short productionstatus) {
        this.productionstatus = productionstatus;
    }

    public Short getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(Short salestatus) {
        this.salestatus = salestatus;
    }

    public String getTimetomarket() {
        return timetomarket;
    }

    public void setTimetomarket(String timetomarket) {
        this.timetomarket = timetomarket;
    }

    public BigDecimal getNowmsrp() {
        return nowmsrp;
    }

    public void setNowmsrp(BigDecimal nowmsrp) {
        this.nowmsrp = nowmsrp;
    }

    public String getSpellfirst() {
        return spellfirst;
    }

    public void setSpellfirst(String spellfirst) {
        this.spellfirst = spellfirst;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getAllspell() {
        return allspell;
    }

    public void setAllspell(String allspell) {
        this.allspell = allspell;
    }

    public Boolean getIsremoved() {
        return isremoved;
    }

    public void setIsremoved(Boolean isremoved) {
        this.isremoved = isremoved;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime2() {
        return updatetime2;
    }

    public void setUpdatetime2(Date updatetime2) {
        this.updatetime2 = updatetime2;
    }

    public Date getCreatetime2() {
        return createtime2;
    }

    public void setCreatetime2(Date createtime2) {
        this.createtime2 = createtime2;
    }

    public Boolean getIswagon() {
        return iswagon;
    }

    public void setIswagon(Boolean iswagon) {
        this.iswagon = iswagon;
    }

    public String getBodycolor() {
        return bodycolor;
    }

    public void setBodycolor(String bodycolor) {
        this.bodycolor = bodycolor;
    }

    public String getNeishicolor() {
        return neishicolor;
    }

    public void setNeishicolor(String neishicolor) {
        this.neishicolor = neishicolor;
    }

    public Date getDotime() {
        return dotime;
    }

    public void setDotime(Date dotime) {
        this.dotime = dotime;
    }

    public Date getShougai() {
        return shougai;
    }

    public void setShougai(Date shougai) {
        this.shougai = shougai;
    }
}