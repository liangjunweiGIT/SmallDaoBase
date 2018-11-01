package com.zyw.pojo;

/**
 * @Description: DVD实体类
 * @Author Created by junwei.liang on 2018/10/30 15:53
 */
public class LjwDVD {
    /**
     * 主键
     */
    private Long id;
    /**
     * DVD名称
     */
    private String name;
    /**
     * 是否删除 1:是 0:否
     */
    private int isDelete;
    /**
     * 借出状态: 1:已借出 0:可借
     */
    private int status;
    /**
     * 借出次数
     */
    private int count;
    /**
     * 影片类型编号
     */
    private Long typeId;
    /**
     * 每日单价
     */
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
