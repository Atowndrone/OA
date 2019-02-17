package com.huizhi.oa.entity;

import java.util.Date;

/**
 *会议申请表
 */
public class Houseapplyinfo {
    /**
     *会议室申请编号
     */
    private Integer haId;

    /**
     *员工编号（申请人员）
     */
    private Integer userid;

    /**
     *申请日期
     */
    private Date haStarttime;

    /**
     *申请原因（用途）
     */
    private String haReason;

    /**
     *审核人员
     */
    private Integer haUserid;

    /**
     *会议室编号
     */
    private Integer haMhId;

    /**
     *状态0-未审核、1-审核通过、2-审核未通过
     */
    private Integer haState;

    /**
     *审核建议
     */
    private String haCheckad;

    /**
     *会议记录编号
     */
    private Integer haMId;

    public Integer getHaId() {
        return haId;
    }

    public void setHaId(Integer haId) {
        this.haId = haId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getHaStarttime() {
        return haStarttime;
    }

    public void setHaStarttime(Date haStarttime) {
        this.haStarttime = haStarttime;
    }

    public String getHaReason() {
        return haReason;
    }

    public void setHaReason(String haReason) {
        this.haReason = haReason == null ? null : haReason.trim();
    }

    public Integer getHaUserid() {
        return haUserid;
    }

    public void setHaUserid(Integer haUserid) {
        this.haUserid = haUserid;
    }

    public Integer getHaMhId() {
        return haMhId;
    }

    public void setHaMhId(Integer haMhId) {
        this.haMhId = haMhId;
    }

    public Integer getHaState() {
        return haState;
    }

    public void setHaState(Integer haState) {
        this.haState = haState;
    }

    public String getHaCheckad() {
        return haCheckad;
    }

    public void setHaCheckad(String haCheckad) {
        this.haCheckad = haCheckad == null ? null : haCheckad.trim();
    }

    public Integer getHaMId() {
        return haMId;
    }

    public void setHaMId(Integer haMId) {
        this.haMId = haMId;
    }
}