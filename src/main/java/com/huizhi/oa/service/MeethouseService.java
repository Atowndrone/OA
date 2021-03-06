package com.huizhi.oa.service;

import com.huizhi.oa.entity.Meethouse;

/**
 * 会议室信息表
 */
public interface MeethouseService {
    /**
     *删除单条
     * @param mhId
     * @return
     */
    int deleteByPrimaryKey(Integer mhId);

    /**
     *添加单条
     * @param record
     * @return
     */
    int insert(Meethouse record);

    /**
     *选择添加
     * @param record
     * @return
     */
    int insertSelective(Meethouse record);

    /**
     *查询单条
     * @param mhId
     * @return
     */
    Meethouse selectByPrimaryKey(Integer mhId);

    /**
     *选择更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Meethouse record);

    /**
     *更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Meethouse record);
}