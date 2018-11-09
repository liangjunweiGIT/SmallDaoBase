package com.zyw.db.client;

import com.zyw.db.pojo.SqlModel;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/31 13:38
 */
class SqlClient {
    /**
     * 解析sql
     */
    SqlModel analyticalSql(String sql, String str) {
        final Pattern p = Pattern.compile(str + "(\\w+)" + str);
        StringBuilder sb = new StringBuilder(sql);
        Matcher m = p.matcher(sb);
        Map<Integer, String> map = new HashMap<>();
        int i = 1;
        while (m.find()) {
            map.put(i++, m.group(1));
            sql = sql.replace("#" + m.group(1) + "#", "?");
        }
        SqlModel sqlModel = new SqlModel();
        sqlModel.setSql(sql);
        sqlModel.setProperties(map);
        return sqlModel;
    }

    /**
     * 判断一个字符在字符串中出现多少次
     */
    int getSubCount(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            index = index + key.length();
            count++;
        }
        return count;
    }

    String column2Property(String columnName) {
        columnName = columnName.toLowerCase();
        while (columnName.contains("_")) {
            int index = columnName.indexOf("_");
            String oldStr = columnName.substring(index + 1, index + 2);
            String upperStr = oldStr.toUpperCase();
            columnName = columnName.replace("_" + oldStr, upperStr);
        }
        return columnName;
    }

}
