package com.zyw.vo;

import com.zyw.pojo.LjwDVD;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/11/1 16:01
 */
public class DVDVO extends LjwDVD {
    /**
     * 类型名
     */
    private Long typeName;
    /**
     * 借出时间
     */
    private String lendDate;

    public Long getTypeName() {
        return typeName;
    }

    public void setTypeName(Long typeName) {
        this.typeName = typeName;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }
}
