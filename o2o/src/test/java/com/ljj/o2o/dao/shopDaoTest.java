package com.ljj.o2o.dao;

import com.ljj.o2o.BaseTest;
import com.ljj.o2o.entity.Area;
import com.ljj.o2o.entity.PersonInfo;
import com.ljj.o2o.entity.Shop;
import com.ljj.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author bce1100
 * @date 2018/9/29.
 */
public class shopDaoTest extends BaseTest{
    @Autowired
    private ShopDao shopDao;

    @Test
    public void testInsertShop(){
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
        shop.setShopName("测试店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("14点18分");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectNum = shopDao.insertShop(shop);
        assertEquals(1,effectNum);
    }

    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(30L);
        shop.setShopDesc("测试描述");
        shop.setShopAddr("测试地址");
        shop.setLastEditTime(new Date());
        int effectNum = shopDao.updateShop(shop);
        assertEquals(1,effectNum);
    }
}
