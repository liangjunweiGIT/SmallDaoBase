package com.ljw.test.dao.impl;

import com.ljw.test.dao.LjwTypeDao;
import com.ljw.base.db.BaseDao;
import com.ljw.test.pojo.LjwType;

import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 18:22
 */
public class LjwTypeDaoImpl extends BaseDao implements LjwTypeDao {

    @Override
    public List<LjwType> getTypeList() {
        return queryForList("SELECT * FROM t_type", LjwType.class);
    }
}
