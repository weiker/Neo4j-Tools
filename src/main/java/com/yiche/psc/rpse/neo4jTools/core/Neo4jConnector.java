package com.yiche.psc.rpse.neo4jTools.core;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
public class Neo4jConnector {

    @Value("${datasource.jdbcUrl.neo4j}")
    private  String boltUrl;
//    private String jdbcURL="jdbc:neo4j:http://192.168.56.162:7474/";
    @Value("${datasource.user.neo4j}")
    private  String username;
    @Value("${datasource.password.neo4j}")
    private  String password;
    @Value("${datasource.driverClass.neo4j}")
    private  String driverName;
//    @Autowired
    private static DruidDataSource dsNeo4j;

    public DruidPooledConnection conn = null;


    @Bean(name = "dsNeo4j")
//    @Scope("prototype")
    public DruidDataSource dataSourceNeo4j() {
        try {
            dsNeo4j = new DruidDataSource();
            dsNeo4j.setDriverClassName(driverName);
            dsNeo4j.setUsername(username);
            dsNeo4j.setPassword(password);
            dsNeo4j.setUrl(boltUrl);
            dsNeo4j.setTestWhileIdle(false);
            dsNeo4j.setMaxActive(2);
            dsNeo4j.setInitialSize(2);
            dsNeo4j.setMaxWait(60000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsNeo4j;
    }

//    static {
//        try {
//            dsNeo4j = new DruidDataSource();
//            dsNeo4j.setDriverClassName(driverName);
//            dsNeo4j.setUsername(username);
//            dsNeo4j.setPassword(password);
//            dsNeo4j.setUrl(boltUrl);
//            dsNeo4j.setTestWhileIdle(false);
//            dsNeo4j.setMaxActive(2);
//            dsNeo4j.setInitialSize(2);
//            dsNeo4j.setMaxWait(60000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public DruidPooledConnection getConnection() {
        try {
            conn=dsNeo4j.getConnection();
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
