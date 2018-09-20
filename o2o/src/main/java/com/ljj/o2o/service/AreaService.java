package com.ljj.o2o.service;

import com.ljj.o2o.entity.Area;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/9/18.
 */
public interface AreaService {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> getAreaList();
}
