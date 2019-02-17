package com.huizhi.oa.entity;

/**
 * 会议室信息表
 */
public class Meethouse {
    /**
     *会议室编号
     */
    private Integer mhId;

    /**
     *会议室名称
     */
    private String mhName;

    /**
     *会议室地址
     */
    private String mhAddress;

    /**
     *状态0-已占用、1-空闲
     */
    private Integer mhState;

    public Integer getMhId() {
        return mhId;
    }

    public void setMhId(Integer mhId) {
        this.mhId = mhId;
    }

    public String getMhName() {
        return mhName;
    }

    public void setMhName(String mhName) {
        this.mhName = mhName == null ? null : mhName.trim();
    }

    public String getMhAddress() {
        return mhAddress;
    }

    public void setMhAddress(String mhAddress) {
        this.mhAddress = mhAddress == null ? null : mhAddress.trim();
    }

    public Integer getMhState() {
        return mhState;
    }

    public void setMhState(Integer mhState) {
        this.mhState = mhState;
    }
}