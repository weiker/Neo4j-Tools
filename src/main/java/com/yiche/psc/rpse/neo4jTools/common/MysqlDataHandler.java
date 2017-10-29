package com.yiche.psc.rpse.neo4jTools.common;

import com.yiche.psc.rpse.neo4jTools.common.domain.ES.StyleInfo;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.Style;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.Styleproperty;
import com.yiche.psc.rpse.neo4jTools.core.MysqlConnector;
import com.yiche.psc.rpse.neo4jTools.core.SearchStyleInfoService;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class MysqlDataHandler {

    private MysqlConnector mysqlConnector;

    public ResultSet getResult(String sql){
        ResultSet resultSet=null;
        mysqlConnector=new MysqlConnector(sql);
        PreparedStatement preparedStatement=mysqlConnector.getPst();
        try {
            resultSet=preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void closeConn(){
        mysqlConnector.close();
    }

    public Map<String,String> handleStyleinfo(int styleID){
        String sql="SELECT *   FROM `StyleProperty` where styleID="+styleID;
        ResultSet resultSet=getResult(sql);
        Map<String,String> propertyMap=new HashMap<>();
        try {
            while(resultSet.next()){
                propertyMap.put(String.valueOf(resultSet.getInt(2)),String.valueOf(resultSet.getInt(4)));
                propertyMap.put(resultSet.getString(3),resultSet.getString(5));
//                Styleproperty styleproperty=new Styleproperty();
//                styleproperty.setStyleid(resultSet.getInt(1));
//                styleproperty.setPropertyid(resultSet.getInt(2));
//                styleproperty.setPropertyname(resultSet.getString(3));
//                styleproperty.setValueid(resultSet.getInt(4));
//                styleproperty.setValuename(resultSet.getString(5));
//                stylepropertyHashSet.add(styleproperty);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return propertyMap;
    }

    public Set<Style> getStyleInfo(){
        String sql="SELECT *   FROM Style";
        ResultSet resultSet=getResult(sql);
        HashSet<Style> styleHashSet=new HashSet<Style>();
        try {

            while(resultSet.next()){
                Style style=new Style();
                style.setId(resultSet.getInt(1));
                style.setModelid(resultSet.getInt(2));
                style.setYear(resultSet.getInt(3));
                style.setName(resultSet.getString(4));
                style.setStylebodytype(resultSet.getShort(5));
                style.setProductionstatus(resultSet.getShort(6));
                style.setSalestatus(resultSet.getShort(7));
                style.setTimetomarket(resultSet.getString(8));
                style.setNowmsrp(resultSet.getBigDecimal(9));
                style.setSpellfirst(resultSet.getString(10));
                style.setSpell(resultSet.getString(11));
                style.setAllspell(resultSet.getString(12));
                style.setIsremoved(resultSet.getBoolean(13));
                style.setIsenabled(resultSet.getBoolean(14));
                style.setUpdatetime(resultSet.getString(15));
                style.setCreatetime(resultSet.getString(16));
                style.setUpdatetime2(resultSet.getDate(17));
                style.setCreatetime2(resultSet.getDate(18));
                style.setIswagon(resultSet.getBoolean(19));
                style.setBodycolor(resultSet.getString(20));
                style.setNeishicolor(resultSet.getString(21));
                style.setDotime(resultSet.getDate(22));
                style.setShougai(resultSet.getDate(23));
                styleHashSet.add(style);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return styleHashSet;

    }

    public Map<String,String> putAutoHomeData(Map<String,String> property, int styleID){
        SearchStyleInfoService searchStyleInfoService=new SearchStyleInfoService();
        StyleInfo styleInfo=searchStyleInfoService.getStyleInfo("test",styleID);
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        property.put("comfortable_long_comment",styleInfo.getComfortable().getZhiJia_description());
        return property;
    }

    public static void main(String[] args) {
        MysqlDataHandler mysqlDataHandler=new MysqlDataHandler();
        Set<Style> styleSet=mysqlDataHandler.getStyleInfo();
        for(Style style:styleSet){
            if(style.getId()==122264){
                System.out.println("pause");
            }
//            Set<Styleproperty> stylepropertySet=mysqlDataHandler.handleStyleinfo(style.getId());
//            System.out.println("styleID:"+style.getId()+"  size:"+stylepropertySet.size());
//            if(stylepropertySet.size()>0) {
//                Neo4jDataHandler neo4jDataHandler = new Neo4jDataHandler();
//
//
//                neo4jDataHandler.updateNodeProperty("Style", stylepropertySet, style.getId());
            }
        }
//        mysqlDataHandler.closeConn();
    }

