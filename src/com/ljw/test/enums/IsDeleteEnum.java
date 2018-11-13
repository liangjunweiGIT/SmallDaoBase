package com.ljw.test.enums;

/**
 * @Description: 是否删除枚举
 * @Author Created by junwei.liang on 2018/10/30 17:35
 */
public enum IsDeleteEnum implements EnumValue {

    /**
     *
     */
    NO(0, "未删除"),
    /**
     *
     */
    YES(1, "已删除");
    private int code;
    private String name;

    IsDeleteEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getEnumByCode(int code) {
        for (IsDeleteEnum itemEnum : IsDeleteEnum.values()) {
            if (itemEnum.getCode() == (code)) {
                return itemEnum.getName();
            }
        }
        return null;
    }
}
