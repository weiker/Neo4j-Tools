package com.yiche.psc.rpse.neo4jTools.common.domain.po;

public class Styleproperty extends StylepropertyKey {
    private String propertyname;

    private Integer valueid;

    private String valuename;

    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public Integer getValueid() {
        return valueid;
    }

    public void setValueid(Integer valueid) {
        this.valueid = valueid;
    }

    public String getValuename() {
        return valuename;
    }

    public void setValuename(String valuename) {
        this.valuename = valuename;
    }
}