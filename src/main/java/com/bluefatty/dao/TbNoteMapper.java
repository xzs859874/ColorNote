package com.bluefatty.dao;

import com.bluefatty.domain.TbNote;

import java.util.List;
import java.util.Map;

public interface TbNoteMapper {

    int deleteByPrimaryKey(String noteId);


    int insert(TbNote record);


    int insertSelective(TbNote record);


    TbNote selectByPrimaryKey(String noteId);


    int updateByPrimaryKeySelective(TbNote record);


    int updateByPrimaryKeyWithBLOBs(TbNote record);


    int updateByPrimaryKey(TbNote record);

    /**
     * 统计数量
     * @param map
     * @return
     */
    Integer statisticsNumberBySelective(Map map);

    /**
     * 根据条件查询笔记
     * @param map
     * @return
     */
    List<TbNote> selectBySelective(Map map);
}