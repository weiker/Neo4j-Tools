package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Modelbodyform;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ModelbodyformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelbodyformMapper {
    int countByExample(ModelbodyformExample example);

    int deleteByExample(ModelbodyformExample example);

    int insert(Modelbodyform record);

    int insertSelective(Modelbodyform record);

    List<Modelbodyform> selectByExample(ModelbodyformExample example);

    int updateByExampleSelective(@Param("record") Modelbodyform record, @Param("example") ModelbodyformExample example);

    int updateByExample(@Param("record") Modelbodyform record, @Param("example") ModelbodyformExample example);
}