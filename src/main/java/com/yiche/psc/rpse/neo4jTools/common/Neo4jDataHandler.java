package com.yiche.psc.rpse.neo4jTools.common;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Styleproperty;
import com.yiche.psc.rpse.neo4jTools.core.Neo4jConnector;
import org.apache.commons.lang.StringUtils;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.Statement;
import org.neo4j.driver.v1.StatementResult;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.neo4j.driver.v1.Values.parameters;

public class Neo4jDataHandler {

    private Neo4jConnector neo4jConnector;

    public Session initConnector(){
        if(neo4jConnector==null){
            neo4jConnector=new Neo4jConnector();
        }
        return neo4jConnector.getSession();
    }

    public void updateNodeProperty(String type,Map<String,String> property,Map<String,String> condition){
        Session session=initConnector();
        String cypher=updateProperties(type,property,condition);
        StatementResult statementResult=session.run(cypher);
        session.close();

    }

    public String updateProperties(String type,Map<String,String> property,Map<String,String> condition){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("MERGE (a:"+type+" { ");
//        set conditions
        for(Map.Entry entry:condition.entrySet()){
            if(entry.getKey()!=null&&entry.getValue()!=null)
            stringBuilder.append("`").append(entry.getKey()).append("`:'").append(entry.getValue()).append("',");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("}) ON MATCH SET ");
//      set properties
        for(Map.Entry entry:condition.entrySet()){
            if(entry.getKey()!=null&&entry.getValue()!=null)
            stringBuilder.append("a.`").append(entry.getKey()).append("`='").append(entry.getValue()).append("',");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append(";");
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
