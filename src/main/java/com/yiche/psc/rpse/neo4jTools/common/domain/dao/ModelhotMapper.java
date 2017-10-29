package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Modelhot;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ModelhotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelhotMapper {
    int countByExample(ModelhotExample example);

    int deleteByExample(ModelhotExample example);

    int insert(Modelhot record);

    int insertSelective(Modelhot record);

    List<Modelhot> selectByExample(ModelhotExample example);

    int updateByExampleSelective(@Param("record") Modelhot record, @Param("example") ModelhotExample example);

    int updateByExample(@Param("record") Modelhot record, @Param("example") ModelhotExample example);
}