package com.yiche.psc.rpse.neo4jTools.core;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Configuration
public class MysqlConnector {


    @Value("${datasource.jdbcUrl.mysql}")
    public   String url;
    @Value("${datasource.driverClass.mysql}")
    public   String name;
    @Value("${datasource.user.mysql}")
    public   String user;
    @Value("${datasource.password.mysql}")
    public   String password;

    private  DruidDataSource dsMysql;

    public DruidPooledConnection conn = null;


    @Bean(name = "dsMysql" )
//    @Scope("prototype")
    public DruidDataSource dataSourceMysql() {
        try {
            dsMysql = new DruidDataSource();
            dsMysql.setDriverClassName(name);
            dsMysql.setUsername(user);
            dsMysql.setPassword(password);
            dsMysql.setUrl(url);
            dsMysql.setTestWhileIdle(false);
            dsMysql.setMaxActive(2);
            dsMysql.setInitialSize(2);
            dsMysql.setMaxWait(60000);
        } catch (Exception e) {
            e.printStackTrace();
        }
            return dsMysql;
        }

    public DruidPooledConnection getConnection() {
        try {
            conn=dsMysql.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void close() {
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
