package com.hand.entity;

import javax.validation.constraints.NotEmpty;

/**
 * @author bce1100
 * @date 2018/8/17.
 */
public class Access {
    private int id;
    @NotEmpty
    private String apiName;
    private long count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
