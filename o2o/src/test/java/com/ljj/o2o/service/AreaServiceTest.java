package com.ljj.o2o.service;

import com.ljj.o2o.BaseTest;
import com.ljj.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        areaService.getAreaList()
                .stream()
                .map(Area::getAreaName)
                .forEach(System.out::println);
    }
}
