package com.zyw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 18:04
 */
public class DateUtil {
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 判断Date类型相差天数
     */
    public static int differentDaysByDate(Date date1, Date date2) {
        return (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24)) + 1;
    }

    /**
     * 判断String类型相差天数
     * @return 如果有异常则返回null
     */
    public static Integer differentDaysByString(String dateStr1, String dateStr2) {
        try {
            Date date1 = format.parse(dateStr1);
            Date date2 = format.parse(dateStr2);
            return differentDaysByDate(date1, date2);
        } catch (ParseException e) {
            System.out.println("日期格式不正确");
            e.printStackTrace();
        }
        return null;
    }

    public static String getNowDateStr(){
        return format.format(new Date());
    }
}
