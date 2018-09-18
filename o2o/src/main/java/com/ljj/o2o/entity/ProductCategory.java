package com.ljj.o2o.entity;

import java.util.Date;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
public class ProductCategory {
    private Long productCatgoryId;
    private Long shopId;
    private String productCategoryByName;
    private Integer priority;
    private Date createTime;

    public Long getProductCatgoryId() {
        return productCatgoryId;
    }

    public void setProductCatgoryId(Long productCatgoryId) {
        this.productCatgoryId = productCatgoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryByName() {
        return productCategoryByName;
    }

    public void setProductCategoryByName(String productCategoryByName) {
        this.productCategoryByName = productCategoryByName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
