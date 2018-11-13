package com.ljw.base.db.client;

import java.util.List;

/**
 * @Description: sql执行器
 * @Author Created by junwei.liang on 2018/11/9 14:42
 */
public interface SqlExecutor {

    /**
     * 插入
     *
     * @param sql sql语句
     * @param obj 查询条件
     * @return 插入条数
     */
    int insert(String sql, Object obj);

    /**
     * 修改
     *
     * @param sql sql语句
     * @param obj 查询条件
     * @return 修改条数
     */
    int update(String sql, Object obj);

    /**
     * 删除
     *
     * @param sql sql语句
     * @param obj 查询条件
     * @return 删除条数
     */
    int delete(String sql, Object obj);

    /**
     * 查列表
     *
     * @param sql   sql语句
     * @param clazz 结果对象类
     * @param <T>   结果对象类型
     * @return 结果对象列表
     */
    <T> List<T> queryForList(String sql, Class<T> clazz);

    /**
     * 查列表
     *
     * @param sql   sql语句
     * @param clazz 结果对象类
     * @param obj   查询条件
     * @param <T>   结果对象类型
     * @return 结果对象列表
     */
    <T> List<T> queryForList(String sql, Class<T> clazz, Object obj);

    /**
     * 查单个对象
     *
     * @param sql   sql语句
     * @param clazz 结果对象类
     * @param <T>   结果对象类型
     * @return 返回结果对象
     */
    <T> T queryForObject(String sql, Class<T> clazz);

    /**
     * 查单个对象
     *
     * @param sql   sql语句
     * @param clazz 结果对象类
     * @param obj   结果对象类型
     * @param <T>   结果对象类型
     * @return 返回结果对象
     */
    <T> T queryForObject(String sql, Class<T> clazz, Object obj);
}
