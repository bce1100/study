package com.ljj.o2o.service;

import com.ljj.o2o.BaseTest;
import com.ljj.o2o.entity.Area;
import com.ljj.o2o.entity.PersonInfo;
import com.ljj.o2o.entity.Shop;
import com.ljj.o2o.entity.ShopCategory;
import com.ljj.o2o.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author bce1100
 * @date 2018/10/8.
 */
public class ShopServiceTest extends BaseTest{
    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop(){
        Shop shop = new Shop();
        PersonInfo personInfo = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        personInfo.setId(8L);
        area.setAreaId(3);
        shopCategory.setShopCategoryId(25L);
        shop.setOwner(personInfo);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试店铺108");
        shop.setShopDesc("test108");
        shop.setShopAddr("test108");
        shop.setPhone("108");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStateEnum.SUCCESS.getState());
        shop.setAdvice("审核中");
        File shopImg = new File("D:\\1.jpg");
        // shopService.addShop(shop,shopImg);
    }
}
