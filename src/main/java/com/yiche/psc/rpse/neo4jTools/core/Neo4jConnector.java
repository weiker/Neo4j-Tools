package com.yiche.psc.rpse.neo4jTools.core;

import org.neo4j.driver.v1.*;


public class Neo4jConnector {

    private String boltUrl="bolt://192.168.55.91:7687/";
    private String username="weiqiang";
    private String password="12345678";
    private Session session;
    private Driver driver;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Neo4jConnector() {
        try {
            AuthToken authToken=AuthTokens.basic( username, password );
            driver = GraphDatabase.driver( boltUrl, authToken );//指定连接类型
            session = driver.session();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
            this.session.close();
            this.driver.close();
    }
}
