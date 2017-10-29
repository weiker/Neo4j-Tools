package com.yiche.psc.rpse.neo4jTools.core;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.neo4j.driver.v1.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;


public class Neo4jConnector {

    private static String boltUrl="jdbc:neo4j:bolt://192.168.56.162:7687";
    private String jdbcURL="jdbc:neo4j:http://192.168.56.162:7474/";
    private static String username="weiqiang";
    private static String password="12345678";
    private static String driverName="org.neo4j.jdbc.Driver";
    private Session session;
    private Driver driver;
    private static DruidDataSource ds;
    public DruidPooledConnection conn = null;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    static {
        try {
            ds = new DruidDataSource();
            ds.setDriverClassName(driverName);
            ds.setUsername(username);
            ds.setPassword(password);
            ds.setUrl(boltUrl);
            ds.setTestWhileIdle(false);
            ds.setMaxActive(2);
            ds.setInitialSize(2);
            ds.setMaxWait(60000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public DruidPooledConnection getConnection() {
        try {
            conn=ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public void close() {
            this.session.close();
            this.driver.close();
    }
}
