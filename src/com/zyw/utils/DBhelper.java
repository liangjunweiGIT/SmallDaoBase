package com.zyw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class DBhelper {

    private static final int CORE_SIZE = Integer.parseInt(PropertiesUtils.getString("CORE_SIZE"));//核心连接数
    private static final int MAX_SIZE = Integer.parseInt(PropertiesUtils.getString("MAX_SIZE"));//最大连接数
    private static final List<Connection> POOL = Collections.synchronizedList(new ArrayList<>()); //线程安全的（同步）
    private static AtomicInteger CURRENT_POOL_SIZE = new AtomicInteger(0);//当前总连接数(原子性int)

    static {
        try {
            for (int i = 0; i < CORE_SIZE; i++) {
                POOL.add(DBhelper.createConnection());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class.forName(PropertiesUtils.getString("DRIVER"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection createConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(PropertiesUtils.getString("URL"),
                    PropertiesUtils.getString("USER"),
                    PropertiesUtils.getString("PASSWORD"));
            CURRENT_POOL_SIZE.getAndIncrement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    @Deprecated
    private static void realClose(Connection con) {
        try {
            con.close();
            CURRENT_POOL_SIZE.getAndDecrement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从连接池获取一个连接
     */
    public static synchronized Connection getConnection() {
        if (POOL.size() > 0) {
            return POOL.remove(0);
        } else if (CURRENT_POOL_SIZE.intValue() < MAX_SIZE) {
            return createConnection();
        } else {
            throw new RuntimeException("池中无连接");
        }
    }

    /**
     * 还回一个连接到池中
     */
    public static void close(Connection con) {
        POOL.add(con);
    }

}
