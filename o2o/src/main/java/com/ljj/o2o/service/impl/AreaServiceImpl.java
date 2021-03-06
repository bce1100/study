package com.ljj.o2o.service.impl;

import com.ljj.o2o.dao.AreaDao;
import com.ljj.o2o.entity.Area;
import com.ljj.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
