package com.zyw.db.reflect;

import com.zyw.utils.DBhelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * @Description: dao层代理
 * @Author Created by junwei.liang on 2018/10/31 12:59
 */
public class DaoClassInterceptor implements InvocationHandler {
    private Object target;

    public DaoClassInterceptor(Object target) {
        this.target = target;
    }

    /**
     * 生成的代理对象 所实现目标类接口中定义的相关方法的具体实现
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Connection con = DBhelper.getConnection();
        try {
            return method.invoke(target, args);
        } finally {
            DBhelper.close(con);
        }
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}