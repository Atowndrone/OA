/**
 * System Name： SDN Platform
 * <p>
 * File Name： MeetinfoController
 * <p>
 * Creating Time： 2019-02-17 18:09
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.huizhi.oa.controller;

import com.huizhi.oa.entity.Meetinfo;
import com.huizhi.oa.service.MeetinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Function Description:  <br>
 * Writer: Administrator . <br>
 * Creating Time: 2019-02-17 18:09 <br>
 * Version:  <br>
 */
@Controller
@RequestMapping("/")
public class MeetinfoController {

    @Autowired
    private MeetinfoService meetinfoService;

    @ResponseBody
    @RequestMapping("getMeetinfo")
    public List<Meetinfo> getAllMeetinfo(){
        List<Meetinfo> list = meetinfoService.getAllMeetinfo();
        return list;
    }
}