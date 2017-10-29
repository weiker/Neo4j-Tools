package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Masterbrand;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.MasterbrandExample;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.MasterbrandWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterbrandMapper {
    int countByExample(MasterbrandExample example);

    int deleteByExample(MasterbrandExample example);

    int insert(MasterbrandWithBLOBs record);

    int insertSelective(MasterbrandWithBLOBs record);

    List<MasterbrandWithBLOBs> selectByExampleWithBLOBs(MasterbrandExample example);

    List<Masterbrand> selectByExample(MasterbrandExample example);

    int updateByExampleSelective(@Param("record") MasterbrandWithBLOBs record, @Param("example") MasterbrandExample example);

    int updateByExampleWithBLOBs(@Param("record") MasterbrandWithBLOBs record, @Param("example") MasterbrandExample example);

    int updateByExample(@Param("record") Masterbrand record, @Param("example") MasterbrandExample example);
}