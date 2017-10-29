package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Styled;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.StyledExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StyledMapper {
    int countByExample(StyledExample example);

    int deleteByExample(StyledExample example);

    int insert(Styled record);

    int insertSelective(Styled record);

    List<Styled> selectByExample(StyledExample example);

    int updateByExampleSelective(@Param("record") Styled record, @Param("example") StyledExample example);

    int updateByExample(@Param("record") Styled record, @Param("example") StyledExample example);
}