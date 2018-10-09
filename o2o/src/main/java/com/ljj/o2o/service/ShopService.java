package com.ljj.o2o.service;

import com.ljj.o2o.dto.ShopExecution;
import com.ljj.o2o.entity.Shop;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author bce1100
 * @date 2018/10/8.
 */
public interface ShopService {
    ShopExecution addShop(Shop shop,CommonsMultipartFile shopImg);
}
