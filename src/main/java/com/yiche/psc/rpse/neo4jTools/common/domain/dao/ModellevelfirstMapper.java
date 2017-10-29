package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Modellevelfirst;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ModellevelfirstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModellevelfirstMapper {
    int countByExample(ModellevelfirstExample example);

    int deleteByExample(ModellevelfirstExample example);

    int insert(Modellevelfirst record);

    int insertSelective(Modellevelfirst record);

    List<Modellevelfirst> selectByExample(ModellevelfirstExample example);

    int updateByExampleSelective(@Param("record") Modellevelfirst record, @Param("example") ModellevelfirstExample example);

    int updateByExample(@Param("record") Modellevelfirst record, @Param("example") ModellevelfirstExample example);
}