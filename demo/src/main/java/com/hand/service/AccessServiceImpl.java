package com.hand.service;

import com.hand.dao.AccessMapper;
import com.hand.entity.Access;
import com.hand.util.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bce1100
 * @date 2018/8/17.
 */
@Service
public class AccessServiceImpl implements IAccessService{
    /**
     * 不知道为什么在IDEA这会红，eclipse上就没事，虽然红了但是又没影响
     */
    @Autowired
    AccessMapper accessMapper;
    Access access;

    @Override
    public long getCount() {
        long count = getAPI().getCount();
        return count;
    }

    @Override
    public synchronized void plus() {
            accessMapper.plus();
    }


    @Override
    public void add() {
        Access a = new Access();
        a.setApiName("add");
        accessMapper.insert(a);
        accessMapper.plus();
    }

    @Override
    public boolean isExist() {
        access = accessMapper.getAPI();
        if(access==null|| !util.APINAME.equals(access.getApiName())){
            return false;
        }
        return true;
    }

    @Override
    public Access getAPI() {
        access = accessMapper.getAPI();
        return access;
    }

    @Override
    public Long plusTimes() {
        long count;
        if (this.isExist()) {
            this.plus();
            count = this.getCount();
        } else {
            this.add();
            count = this.getCount();
        }
        return count;
    }
}
