package com.ljj.o2o.service.impl;

import com.ljj.o2o.dao.ShopDao;
import com.ljj.o2o.dto.ShopExecution;
import com.ljj.o2o.entity.Shop;
import com.ljj.o2o.enums.ShopStateEnum;
import com.ljj.o2o.exception.ShopOperationException;
import com.ljj.o2o.service.ShopService;
import com.ljj.o2o.util.ImageUtil;
import com.ljj.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.util.Date;

/**
 * @author bce1100
 * @date 2018/10/8.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) {
        //空值判断
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            //赋店铺信息初始值
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            //添加店铺信息
            int effectedNum = shopDao.insertShop(shop);
            if (effectedNum <= 0) {
                throw new ShopOperationException("店铺创建失败");
            } else {
                if (shopImg != null) {
                    //存储图片
                    try {
                        addShopImg(shop, shopImg);
                    } catch (Exception e) {
                        throw new ShopOperationException("addShopImg error:" + e.getMessage());
                    }
                    //更新店铺的图片地址
                    effectedNum = shopDao.updateShop(shop);
                    if(effectedNum <= 0){
                        throw new ShopOperationException("更新图片地址失败");
                    }
                }
            }
        } catch (Exception e) {
            throw new ShopOperationException("addShop error:" + e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK,shop);
    }

    private void addShopImg(Shop shop, CommonsMultipartFile shopImg) {
        //获取shop图片目录的相对值路径
        String dest = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgaddr = ImageUtil.generateThumbnail(shopImg,dest);
        shop.setShopAddr(shopImgaddr);
    }
}
