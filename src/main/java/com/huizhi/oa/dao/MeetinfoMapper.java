package com.huizhi.oa.dao;

import com.huizhi.oa.entity.Meetinfo;

import java.util.List;

/**
 * 会议记录表
 */
public interface MeetinfoMapper {
    /**
     *删除单条
     * @param mId
     * @return
     */
    int deleteByPrimaryKey(Integer mId);

    /**
     *添加单条
     * @param record
     * @return
     */
    int insert(Meetinfo record);

    /**
     *选择添加单条
     * @param record
     * @return
     */
    int insertSelective(Meetinfo record);

    /**
     *查询单条
     * @param mId
     * @return
     */
    Meetinfo selectByPrimaryKey(Integer mId);

    /**
     *选择更新单条
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Meetinfo record);

    /**
     *更新单条
     * @param record
     * @return
     */
    int updateByPrimaryKey(Meetinfo record);

    /**
     * 查询所有会议记录
     * @return
     */
    List<Meetinfo> getAllMeetinfo();
}