package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Modelcolor;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ModelcolorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelcolorMapper {
    int countByExample(ModelcolorExample example);

    int deleteByExample(ModelcolorExample example);

    int insert(Modelcolor record);

    int insertSelective(Modelcolor record);

    List<Modelcolor> selectByExample(ModelcolorExample example);

    int updateByExampleSelective(@Param("record") Modelcolor record, @Param("example") ModelcolorExample example);

    int updateByExample(@Param("record") Modelcolor record, @Param("example") ModelcolorExample example);
}