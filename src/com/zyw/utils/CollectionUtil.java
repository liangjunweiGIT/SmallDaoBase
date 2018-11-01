package com.zyw.utils;

import java.util.Collection;
import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 17:27
 */
public class CollectionUtil {
    /**
     * 判断集合是否为空
     */
    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /**
     * 根据指定字符串将List转换为String
     */
    public static <T> String list2String(List<T> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (T id : list) {
            sb.append(id).append(str);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /**
     * 过滤null值的字符串拼接
     */
    public static String filterStr(String cut, Object... arr) {
        StringBuilder sb = new StringBuilder();
        for (Object str : arr) {
            sb.append(str == null ? "" : str).append(cut);
        }
        return sb.toString();
    }
}
