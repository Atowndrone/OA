package com.huizhi.oa.service;

import com.huizhi.oa.entity.Houseapplyinfo;

/**
 *会议申请表
 */
public interface HouseapplyinfoService {
    /**
     *删除单条
     * @param haId
     * @return
     */
    int deleteByPrimaryKey(Integer haId);

    /**
     *添加单条
     * @param record
     * @return
     */
    int insert(Houseapplyinfo record);

    /**
     *选择添加
     * @param record
     * @return
     */
    int insertSelective(Houseapplyinfo record);

    /**
     *查询
      * @param haId
     * @return
     */
    Houseapplyinfo selectByPrimaryKey(Integer haId);

    /**
     *选择更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Houseapplyinfo record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Houseapplyinfo record);
}