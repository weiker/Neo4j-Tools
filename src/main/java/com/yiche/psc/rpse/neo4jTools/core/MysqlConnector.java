package com.yiche.psc.rpse.neo4jTools.core;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlConnector {


    public static final String url = "jdbc:mysql://192.168.56.97/cigdc_yiche";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "xyj2016";

    private DruidDataSource ds;
    public Connection conn = null;

    public static String getUrl() {
        return url;
    }

    public static String getName() {
        return name;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public PreparedStatement pst = null;

    public MysqlConnector(String sql) {
        try {
//            Class.forName(name);//指定连接类型
//            conn = DriverManager.getConnection(url, user, password);//获取连接
            ds = new DruidDataSource();
            ds.setDriverClassName(this.name);
            ds.setUsername(user);
            ds.setPassword(password);
            ds.setUrl(url);
            conn=ds.getConnection();
            pst = conn.prepareStatement(sql);//准备执行语句
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
