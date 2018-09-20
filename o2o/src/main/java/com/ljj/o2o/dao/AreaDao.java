package com.ljj.o2o.dao;

import com.ljj.o2o.entity.Area;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();
}
