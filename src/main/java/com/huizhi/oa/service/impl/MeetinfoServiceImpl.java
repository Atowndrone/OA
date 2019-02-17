/**
 * System Name： SDN Platform
 * <p>
 * File Name： MeetinfoServiceImpl
 * <p>
 * Creating Time： 2019-02-17 17:36
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.huizhi.oa.service.impl;

import com.huizhi.oa.dao.MeetinfoMapper;
import com.huizhi.oa.entity.Meetinfo;
import com.huizhi.oa.service.MeetinfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Function Description:  <br>
 * Writer: Administrator . <br>
 * Creating Time: 2019-02-17 17:36 <br>
 * Version:  <br>
 */
public class MeetinfoServiceImpl implements MeetinfoService {

    @Autowired
    private MeetinfoMapper meetinfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer mId) {
        return 0;
    }

    @Override
    public int insert(Meetinfo record) {
        return 0;
    }

    @Override
    public int insertSelective(Meetinfo record) {
        return 0;
    }

    @Override
    public Meetinfo selectByPrimaryKey(Integer mId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Meetinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Meetinfo record) {
        return 0;
    }

    @Override
    public List<Meetinfo> getAllMeetinfo() {
        return meetinfoMapper.getAllMeetinfo();
    }
}