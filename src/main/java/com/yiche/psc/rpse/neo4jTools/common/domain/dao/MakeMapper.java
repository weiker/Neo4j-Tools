package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Make;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.MakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MakeMapper {
    int countByExample(MakeExample example);

    int deleteByExample(MakeExample example);

    int insert(Make record);

    int insertSelective(Make record);

    List<Make> selectByExampleWithBLOBs(MakeExample example);

    List<Make> selectByExample(MakeExample example);

    int updateByExampleSelective(@Param("record") Make record, @Param("example") MakeExample example);

    int updateByExampleWithBLOBs(@Param("record") Make record, @Param("example") MakeExample example);

    int updateByExample(@Param("record") Make record, @Param("example") MakeExample example);
}