package com.ljw.test.service;

import com.ljw.test.pojo.LjwDvd;
import com.ljw.test.vo.DvdVo;

import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 17:04
 */
public interface LjwDvdService {
    /**
     * 增加一张DVD
     *
     * @param dvd
     * @return
     */
    boolean addDVD(LjwDvd dvd);

    /**
     * 显示所有dvd
     *
     * @return
     */
    List<DvdVo> showAllDVD();

    /**
     * 删除一张dvd
     *
     * @param id
     * @return
     */
    boolean delete(Long id);

    /**
     * 借一张dvd
     *
     * @param id
     * @return
     */
    boolean lendDVD(Long id);

    /**
     * 归还dvd
     *
     * @param id
     * @param date
     * @return
     */
    boolean returnDVD(Long id, String date);


}
