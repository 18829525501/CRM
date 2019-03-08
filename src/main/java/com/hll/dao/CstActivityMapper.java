package com.hll.dao;

import com.hll.pojo.CstActivity;
import com.hll.pojo.CstActivityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CstActivityMapper {
    long countByExample(CstActivityExample example);

    int deleteByExample(CstActivityExample example);

    int deleteByPrimaryKey(Integer atvId);

    int insert(CstActivity record);

    int insertSelective(CstActivity record);

    List<CstActivity> selectByExample(CstActivityExample example);

    CstActivity selectByPrimaryKey(Integer atvId);

    int updateByExampleSelective(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    int updateByExample(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    int updateByPrimaryKeySelective(CstActivity record);

    int updateByPrimaryKey(CstActivity record);

    List<CstActivity> select(String id);
}