package com.ljj.o2o.dao;

import com.ljj.o2o.entity.Shop;

/**
 * @author bce1100
 * @date 2018/9/29.
 */
public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
