package com.ljj.test;

import org.springframework.stereotype.Repository;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
@Repository
public class TestDao {

    public void save(){
        System.out.println("save方法");
    }

    public void update(){
        System.out.println("update方法");
    }
    public void delete(){
        System.out.println("delete方法");
    }
}
