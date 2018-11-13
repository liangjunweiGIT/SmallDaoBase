package com.ljw.base.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 17:12
 */
public class PropertiesUtils {
    private static Properties prop;

    static {
        prop = new Properties();
        try {
            prop.load(DbHelper.class.getClassLoader().getResourceAsStream("DVD.ut"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getString(String key) {
        return prop.getProperty(key);
    }

    public static Object getObject(String key) {
        try {
            return Class.forName(prop.getProperty(key)).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
