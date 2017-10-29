package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Styleproperty;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.StylepropertyExample;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.StylepropertyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StylepropertyMapper {
    int countByExample(StylepropertyExample example);

    int deleteByExample(StylepropertyExample example);

    int deleteByPrimaryKey(StylepropertyKey key);

    int insert(Styleproperty record);

    int insertSelective(Styleproperty record);

    List<Styleproperty> selectByExample(StylepropertyExample example);

    Styleproperty selectByPrimaryKey(StylepropertyKey key);

    int updateByExampleSelective(@Param("record") Styleproperty record, @Param("example") StylepropertyExample example);

    int updateByExample(@Param("record") Styleproperty record, @Param("example") StylepropertyExample example);

    int updateByPrimaryKeySelective(Styleproperty record);

    int updateByPrimaryKey(Styleproperty record);
}