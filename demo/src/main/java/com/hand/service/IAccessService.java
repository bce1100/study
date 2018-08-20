package com.hand.service;

import com.hand.entity.Access;

/**
 * @author bce1100
 * @date 2018/8/17.
 */
public interface IAccessService {
    /**
     * 返回访问次数
     * @return api访问次数
     */
    public long getCount();

    /**
     * 访问次数+1
     */
    public void plus();

    /**
     * 第一次访问时添加api并访问次数+1
     */
    public void add();

    /**
     * 检查api是否存在
     * @return boolean
     */
    public boolean isExist();

    /**
     * 获取api
     * @return Access
     */
    public Access getAPI();

    public Long plusTimes();
}
