package com.yuewen.web.entity;

import java.io.Serializable;

/**
 * Created by liangchen on 2018/6/8.
 */
public class IOSCloudSettingEntity implements Serializable {


    private boolean enVisitor = false;

    public IOSCloudSettingEntity() {};
    public IOSCloudSettingEntity(boolean enVisitor) {
        this.enVisitor = enVisitor;
    }

    public boolean isEnVisitor() {
        return enVisitor;
    }

    public void setEnVisitor(boolean enVisitor) {
        this.enVisitor = enVisitor;
    }


}
