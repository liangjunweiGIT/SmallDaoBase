package com.ljw.base.util;

import com.ljw.base.db.reflect.DaoClassInterceptor;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/31 12:58
 */
public class ProxyUtil {
    /**
     * 获取dao层的代理对象
     */
    public static Object getDao(Object target) {
        return new DaoClassInterceptor(target).getProxyInstance();
    }
}
