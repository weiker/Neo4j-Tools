package com.yiche.psc.rpse.neo4jTools.common.domain.po;

public class MasterbrandWithBLOBs extends Masterbrand {
    private String logomeaning;

    private String introduction;

    public String getLogomeaning() {
        return logomeaning;
    }

    public void setLogomeaning(String logomeaning) {
        this.logomeaning = logomeaning;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}