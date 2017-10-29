package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Style;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.StyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StyleMapper {
    int countByExample(StyleExample example);

    int deleteByExample(StyleExample example);

    int insert(Style record);

    int insertSelective(Style record);

    List<Style> selectByExample(StyleExample example);

    int updateByExampleSelective(@Param("record") Style record, @Param("example") StyleExample example);

    int updateByExample(@Param("record") Style record, @Param("example") StyleExample example);
}