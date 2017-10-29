package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Modellevel;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ModellevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModellevelMapper {
    int countByExample(ModellevelExample example);

    int deleteByExample(ModellevelExample example);

    int insert(Modellevel record);

    int insertSelective(Modellevel record);

    List<Modellevel> selectByExample(ModellevelExample example);

    int updateByExampleSelective(@Param("record") Modellevel record, @Param("example") ModellevelExample example);

    int updateByExample(@Param("record") Modellevel record, @Param("example") ModellevelExample example);
}