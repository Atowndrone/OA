package com.huizhi.oa.entity;

import java.util.Date;

/**
 * 会议记录表
 */
public class Meetinfo {
    /**
     *会议编号
     */
    private Integer mId;

    /**
     *会议标题
     */
    private String mTitle;

    /**
     *会议内容
     */
    private String mContent;

    /**
     *会议室编号
     */
    private Integer mhId;

    /**
     *会议人员
     */
    private String mPeople;

    /**
     *开会时间
     */
    private Date mStarttime;

    /**
     *会议状态0-已开、1-未开
     */
    private Integer mState;

    /**
     *开会结束时间
     */
    private Date mOvertime;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
    }

    public Integer getMhId() {
        return mhId;
    }

    public void setMhId(Integer mhId) {
        this.mhId = mhId;
    }

    public String getmPeople() {
        return mPeople;
    }

    public void setmPeople(String mPeople) {
        this.mPeople = mPeople == null ? null : mPeople.trim();
    }

    public Date getmStarttime() {
        return mStarttime;
    }

    public void setmStarttime(Date mStarttime) {
        this.mStarttime = mStarttime;
    }

    public Integer getmState() {
        return mState;
    }

    public void setmState(Integer mState) {
        this.mState = mState;
    }

    public Date getmOvertime() {
        return mOvertime;
    }

    public void setmOvertime(Date mOvertime) {
        this.mOvertime = mOvertime;
    }
}