package com.ljw.test.dao;

import com.ljw.test.pojo.LjwType;

import java.util.List;

/**
 * @Description: t_type表dao层接口
 * @Author Created by junwei.liang on 2018/10/30 17:01
 */
public interface LjwTypeDao {

    /**
     * 获取所有类型
     * @return 类型列表
     */
    List<LjwType> getTypeList();
}
