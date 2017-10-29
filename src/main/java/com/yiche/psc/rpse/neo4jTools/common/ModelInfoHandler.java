package com.yiche.psc.rpse.neo4jTools.common;

import com.yiche.psc.rpse.neo4jTools.common.domain.dao.CountryMapper;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.Country;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.CountryExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.util.PropertyPlaceholderHelper;

import java.util.ArrayList;
import java.util.List;
@Configuration
@PropertySource(value = "classpath:application.properties")
@ComponentScan(basePackages="com.yiche.psc.rpse" )
public class ModelInfoHandler {
    private Logger logger = LoggerFactory.getLogger(ModelInfoHandler.class);
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public void getModelInfo(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryMapper countryMapper=sqlSession.getMapper(CountryMapper.class);
        CountryExample countryExample=new CountryExample();
        List<Country> countryList=new ArrayList<Country>();
        countryList=countryMapper.selectByExample(countryExample);

    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ModelInfoHandler.class);

        ModelInfoHandler modelInfoHandler=new ModelInfoHandler();
        modelInfoHandler.getModelInfo();

        SqlSessionFactory sqlSessionFactory=(SqlSessionFactory)context.getBean(SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryMapper countryMapper=sqlSession.getMapper(CountryMapper.class);
        CountryExample countryExample=new CountryExample();
        List<Country> countryList=new ArrayList<Country>();
        countryList=countryMapper.selectByExample(countryExample);
        System.out.println(countryList.size());

    }
}
