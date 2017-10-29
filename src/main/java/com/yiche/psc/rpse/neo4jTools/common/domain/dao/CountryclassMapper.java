package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Countryclass;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.CountryclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryclassMapper {
    int countByExample(CountryclassExample example);

    int deleteByExample(CountryclassExample example);

    int insert(Countryclass record);

    int insertSelective(Countryclass record);

    List<Countryclass> selectByExample(CountryclassExample example);

    int updateByExampleSelective(@Param("record") Countryclass record, @Param("example") CountryclassExample example);

    int updateByExample(@Param("record") Countryclass record, @Param("example") CountryclassExample example);
}