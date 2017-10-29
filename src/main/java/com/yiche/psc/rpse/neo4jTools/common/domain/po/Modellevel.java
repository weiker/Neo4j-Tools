package com.yiche.psc.rpse.neo4jTools.common.domain.po;

public class Modellevel {
    private Integer id;

    private String name;

    private Integer parent;

    private Integer isgroup;

    private Integer sort;

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

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(Integer isgroup) {
        this.isgroup = isgroup;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}