/**
 * System Name： SDN Platform
 * <p>
 * File Name： HouseapplyinfoImpl
 * <p>
 * Creating Time： 2019-02-17 17:24
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.huizhi.oa.service.impl;

import com.huizhi.oa.entity.Houseapplyinfo;
import com.huizhi.oa.service.HouseapplyinfoService;
import org.springframework.stereotype.Service;

/**
 * Function Description:  <br>
 * Writer: Administrator . <br>
 * Creating Time: 2019-02-17 17:24 <br>
 * Version:  <br>
 */
@Service
public class HouseapplyinfoImpl implements HouseapplyinfoService {
    @Override
    public int deleteByPrimaryKey(Integer haId) {
        return 0;
    }

    @Override
    public int insert(Houseapplyinfo record) {
        return 0;
    }

    @Override
    public int insertSelective(Houseapplyinfo record) {
        return 0;
    }

    @Override
    public Houseapplyinfo selectByPrimaryKey(Integer haId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Houseapplyinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Houseapplyinfo record) {
        return 0;
    }
}