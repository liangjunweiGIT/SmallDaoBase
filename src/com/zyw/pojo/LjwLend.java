package com.zyw.pojo;

/**
 * @Description: 借出表
 * @Author Created by junwei.liang on 2018/10/30 16:26
 */
public class LjwLend {
    /**
     * 主键
     */
    private Long id;
    /**
     * DVD表主键
     */
    private Long dvdId;
    /**
     * 借出时间
     */
    private String lendDate;
    /**
     * 归还时间
     */
    private String returnDate;
    /**
     * 此次应收
     */
    private double money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDvdId() {
        return dvdId;
    }

    public void setDvdId(Long dvdId) {
        this.dvdId = dvdId;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
