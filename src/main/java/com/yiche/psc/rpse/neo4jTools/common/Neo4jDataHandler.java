package com.yiche.psc.rpse.neo4jTools.common;

import com.yiche.psc.rpse.neo4jTools.core.Neo4jConnector;
import org.neo4j.driver.v1.Session;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class Neo4jDataHandler {

    private Neo4jConnector neo4jConnector;

    public Session initSession(){
        if(neo4jConnector==null){
            neo4jConnector=new Neo4jConnector();
        }
        return neo4jConnector.getSession();
    }

    public ResultSet excuteCypher(String cypher){
        if(neo4jConnector==null){
            neo4jConnector=new Neo4jConnector();
        }
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
//        Session session=initSession();
        String cypher=updateProperties(type,property,condition);
//        StatementResult statementResult=session.run(cypher);
//        session.close();

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

    public String unwindProperty(String type,Map<String,String> property,Map<String,String> condition){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{ {id:"+type+" , ");
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

    public static void main(String[] args) {
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
