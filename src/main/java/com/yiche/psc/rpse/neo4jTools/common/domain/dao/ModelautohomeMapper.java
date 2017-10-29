package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Modelautohome;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ModelautohomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelautohomeMapper {
    int countByExample(ModelautohomeExample example);

    int deleteByExample(ModelautohomeExample example);

    int insert(Modelautohome record);

    int insertSelective(Modelautohome record);

    List<Modelautohome> selectByExample(ModelautohomeExample example);

    int updateByExampleSelective(@Param("record") Modelautohome record, @Param("example") ModelautohomeExample example);

    int updateByExample(@Param("record") Modelautohome record, @Param("example") ModelautohomeExample example);
}