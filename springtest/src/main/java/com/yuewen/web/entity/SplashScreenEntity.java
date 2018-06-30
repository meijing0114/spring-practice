package com.yuewen.web.entity;

import java.io.Serializable;

/**
 * Created by liangchen on 2018/6/8.
 */
public class SplashScreenEntity implements Serializable {
    private String actionUrl;
    private long startTime=0;
    private long endTime=0;
    private String imgUrl;

    public SplashScreenEntity() {}

    public SplashScreenEntity(String actionUrl, long startTime, long endTime, String imgUrl) {
        this.actionUrl = actionUrl;
        this.startTime = startTime;
        this.endTime = endTime;
        this.imgUrl = imgUrl;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
