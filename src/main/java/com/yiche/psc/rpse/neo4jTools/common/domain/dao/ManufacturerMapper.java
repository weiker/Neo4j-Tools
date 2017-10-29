package com.yiche.psc.rpse.neo4jTools.common.domain.dao;

import com.yiche.psc.rpse.neo4jTools.common.domain.po.Manufacturer;
import com.yiche.psc.rpse.neo4jTools.common.domain.po.ManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper {
    int countByExample(ManufacturerExample example);

    int deleteByExample(ManufacturerExample example);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);

    List<Manufacturer> selectByExampleWithBLOBs(ManufacturerExample example);

    List<Manufacturer> selectByExample(ManufacturerExample example);

    int updateByExampleSelective(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExampleWithBLOBs(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExample(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);
}