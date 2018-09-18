package com.ljj.o2o.entity;

import java.util.Date;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
public class Shop {
    private Long shopId;
    private String shopName;
    private String shopDesc;
    private String shopAddr;
    private String phone;
    private String shopImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    /**
     * -1不可用；0审核中；1可用
     */
    private Integer enableStatus;
    /**
     * 超级管理员给店家的提醒
     */
    private String advice;
    private Area area;
    private PersonInfo owner;
    private ShopCategory shopCategory;
}
