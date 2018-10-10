package com.lin.test.common.entity;

import java.io.Serializable;

public class UserVidBind implements Serializable {

    private static final long serialVersionUID = -8439650614093189787L;

    /**
     * 用户 id
     */
    private Long userId;

    /**
     * 唯一 VidStatus id
     */
    private String vidId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVidId() {
        return vidId;
    }

    public void setVidId(String vidId) {
        this.vidId = vidId;
    }

    @Override
    public String toString() {
        return "UserVidBind{" +
                "userId=" + userId +
                ", vidId='" + vidId + '\'' +
                '}';
    }
}
