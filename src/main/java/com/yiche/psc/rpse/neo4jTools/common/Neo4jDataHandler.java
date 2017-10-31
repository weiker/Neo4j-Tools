package com.yiche.psc.rpse.neo4jTools.common;

import com.yiche.psc.rpse.neo4jTools.core.Neo4jConnector;
import org.neo4j.driver.v1.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

@Service("Neo4jDataHandler")
public class Neo4jDataHandler {

    @Autowired
    private Neo4jConnector neo4jConnector;

    public ResultSet excuteCypher(String cypher){
        ResultSet resultSet=null;
        try {
            neo4jConnector.conn=neo4jConnector.getConnection();
            PreparedStatement preparedStatement=neo4jConnector.conn.prepareStatement(cypher);
            resultSet=preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void closeConnection(){
        try {
            neo4jConnector.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateNodeProperty(String type, Map<String,String> property, Map<String,String> condition){
        String cypher=updateProperties(type,property,condition);
        excuteCypher(cypher);
        closeConnection();
    }

    public String updateProperties(String type,Map<String,String> property,Map<String,String> condition){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("MERGE (a:"+type+" { ");
//        set conditions
        for(Map.Entry entry:condition.entrySet()){
            if(entry.getKey()!=null&&entry.getValue()!=null)
            stringBuilder.append("`").append(entry.getKey()).append("`:").append(entry.getValue()).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("}) ON MATCH SET ");
//      set properties
        for(Map.Entry entry:property.entrySet()){
            if(entry.getKey()!=null&&entry.getValue()!=null)
            stringBuilder.append("a.`").append(entry.getKey()).append("`='").append(entry.getValue()).append("',");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append(";");
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }


    public  void test(String[] args) {
        String a="match(a:Brand) return count(a)";
        Neo4jDataHandler neo4jDataHandler=new Neo4jDataHandler();
        ResultSet resultSet=neo4jDataHandler.excuteCypher(a);
        try {
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        neo4jDataHandler.closeConnection();
    }
}
