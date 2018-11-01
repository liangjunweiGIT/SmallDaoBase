package com.zyw.pojo;

/**
 * @Description: 影片类型实体类
 * @Author Created by junwei.liang on 2018/10/30 16:25
 */
public class LjwType {
    /**
     * 主键
     */
    private Long id;
    /**
     * 类型名称
     */
    private String name;

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
}
