package com.hand.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
public class demoDAO {
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = RuntimeException.class)
    public void query(){
//        jdbcTemplate.queryForObject("select userName from user",new  RowMapper<>(){
//
//            @Override
//            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//                resultSet.getString(0);
//                return null;
//            }
//        });
    }
}
