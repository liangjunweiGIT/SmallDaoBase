package com.zyw.service;

import com.zyw.pojo.LjwDVD;
import com.zyw.vo.DVDVO;

import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 17:04
 */
public interface LjwDVDService {
    /**
     * 增加一张dvd
     */
    boolean addDVD(LjwDVD dvd);

    /**
     * 显示所有dvd
     */
    List<DVDVO> showAllDVD();

    /**
     * 删除一张dvd
     */
    boolean delete(Long id);

    /**
     * 借一张dvd
     */
    boolean lendDVD(Long id);

    /**
     * 归还dvd
     */
    boolean returnDVD(Long id, String date);


}
