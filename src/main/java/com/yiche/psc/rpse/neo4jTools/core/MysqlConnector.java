package com.yiche.psc.rpse.neo4jTools.core;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlConnector {


    public static final String url = "jdbc:mysql://172.21.0.70/cigdc_yiche";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "carapiread";
    public static final String password = "xwGEXVKzDEJGDSsX";

    private static DruidDataSource ds;
    public DruidPooledConnection conn = null;

    public DruidPooledConnection getConn() {
        return conn;
    }

    public void setConn(DruidPooledConnection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public PreparedStatement pst = null;
    static {
        try {
            ds = new DruidDataSource();
            ds.setDriverClassName(name);
            ds.setUsername(user);
            ds.setPassword(password);
            ds.setUrl(url);
            ds.setTestWhileIdle(false);
            ds.setMaxActive(2);
            ds.setInitialSize(2);
            ds.setMaxWait(60000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public MysqlConnector() {
        try {
//            Class.forName(name);//指定连接类型
//            conn = DriverManager.getConnection(url, user, password);//获取连接
            conn=ds.getConnection();
//            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(this.name);
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setUrl(url);
        return ds;
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
