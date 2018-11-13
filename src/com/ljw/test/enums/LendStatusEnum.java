package com.ljw.test.enums;

/**
 * @Description: 是否借出枚举
 * @Author Created by junwei.liang on 2018/10/30 17:35
 */
public enum LendStatusEnum implements EnumValue {

    /**
     * 可借
     */
    NO(0, "可借"),
    /**
     * 不可借
     */
    YES(1, "已借出");
    private int code;
    private String name;

    LendStatusEnum(int code, String name) {
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
        for (LendStatusEnum itemEnum : LendStatusEnum.values()) {
            if (itemEnum.getCode() == code) {
                return itemEnum.getName();
            }
        }
        return null;
    }
}
