package com.ljj.o2o.dao;

import com.ljj.o2o.BaseTest;
import com.ljj.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryDao(){
        List<Area> areaList = areaDao.queryArea();
        areaList.stream()
                .forEach(System.out::println);
    }
}
