package com.ljj.o2o.entity;

import java.util.Date;

/**
 * @author bce1100
 * @date 2018/9/15.
 */
public class PersonInfo {
    private Long id;
    private String name;
    private String profileImg;
    private String mail;
    /**
     * 1.顾客 2.商家 3.超级管理员
     */
    private String gender;
    private Integer enableStatus;
    private Integer userType;
    private Date createTime;
    private Date lastEditTem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTem() {
        return lastEditTem;
    }

    public void setLastEditTem(Date lastEditTem) {
        this.lastEditTem = lastEditTem;
    }
}
