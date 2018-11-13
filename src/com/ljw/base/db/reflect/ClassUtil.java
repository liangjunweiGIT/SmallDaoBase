package com.ljw.base.db.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/31 19:05
 */
public class ClassUtil {
    /**
     * 根据类对象获取实体类所有属性名和属性类型
     */
    public static Map<String, Class> getFiledMapByClass(Class clazz) {
        Map<String, Class> map = new HashMap<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            map.put(field.getName(), field.getType());
        }
        while (true) {
            clazz = clazz.getSuperclass();
            if (clazz.equals(Object.class)) {
                return map;
            }
            fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                map.put(field.getName(), field.getType());
            }
        }
    }

    /**
     * 根据实例对象获取实体类所有属性名和属性类型
     */
    public static Map<String, Class> getFiledMapByObj(Object obj) {
        return getFiledMapByClass(obj.getClass());
    }

    /**
     * 根据属性名获取属性值
     */
    public static Object getFieldValueByName(String fieldName, Object obj) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = obj.getClass().getMethod(getter);
            return method.invoke(obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 根据属性名设置属性值
     */
    public static void setFieldValueByName(Object obj, Class clazz, String fieldName, Object value) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String setter = "set" + firstLetter + fieldName.substring(1);
            Method method = obj.getClass().getMethod(setter, clazz);
            if (int.class.equals(clazz) || Integer.class.equals(clazz)) {
                method.invoke(obj, Integer.valueOf(value.toString()));
            } else if (long.class.equals(clazz) || Long.class.equals(clazz)) {
                method.invoke(obj, Long.valueOf(value.toString()));
            } else if (float.class.equals(clazz) || Float.class.equals(clazz)) {
                method.invoke(obj, Float.valueOf(value.toString()));
            } else if (double.class.equals(clazz) || Double.class.equals(clazz)) {
                method.invoke(obj, Double.valueOf(value.toString()));
            } else if (boolean.class.equals(clazz) || Boolean.class.equals(clazz)) {
                method.invoke(obj, Boolean.valueOf(value.toString()));
            } else {
                method.invoke(obj, value);
            }
        } catch (Exception ignored) {
        }
    }

    /**
     * 判断一个对象是否是基本类型或基本类型的封装类型
     * 或者String||StringBuffer||StringBuilder
     */
    public static boolean isPrimitive(Object obj) {
        try {
            return ((Class<?>) obj.getClass().getField("TYPE").get(null)).isPrimitive();
        } catch (Exception e) {
            return String.class.equals(obj.getClass()) || StringBuffer.class.equals(obj.getClass()) || StringBuilder.class.equals(obj.getClass());
        }
    }

}
