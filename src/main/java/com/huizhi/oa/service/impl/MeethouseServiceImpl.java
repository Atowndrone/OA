/**
 * System Name： SDN Platform
 * <p>
 * File Name： MeethouseServiceImpl
 * <p>
 * Creating Time： 2019-02-17 17:34
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.huizhi.oa.service.impl;

import com.huizhi.oa.entity.Meethouse;
import com.huizhi.oa.service.MeethouseService;
import org.springframework.stereotype.Service;

/**
 * Function Description:  <br>
 * Writer: Administrator . <br>
 * Creating Time: 2019-02-17 17:34 <br>
 * Version:  <br>
 */
@Service
public class MeethouseServiceImpl implements MeethouseService {
    @Override
    public int deleteByPrimaryKey(Integer mhId) {
        return 0;
    }

    @Override
    public int insert(Meethouse record) {
        return 0;
    }

    @Override
    public int insertSelective(Meethouse record) {
        return 0;
    }

    @Override
    public Meethouse selectByPrimaryKey(Integer mhId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Meethouse record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Meethouse record) {
        return 0;
    }
}