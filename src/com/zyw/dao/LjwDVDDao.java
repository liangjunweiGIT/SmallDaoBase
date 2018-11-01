package com.zyw.dao;

import com.zyw.pojo.LjwDVD;
import com.zyw.vo.DVDVO;

import java.util.List;

/**
 * @Description: t_dvd表dao层接口
 * @Author Created by junwei.liang on 2018/10/30 15:34
 */
public interface LjwDVDDao {
    /**
     * 查询DVD列表
     * @return DVD列表
     */
    List<DVDVO> queryDVDList();

    /**
     * 新增DVD
     * @param dvd DVD
     */
    int addDVD(LjwDVD dvd);

    /**
     * 根据编号列表删除DVD 支持批量
     * @param idList id列表
     */
    int deleteDVD(List<Long> idList);

    /**
     * 修改dvd状态等数据
     * @param dvd dvd
     * @return 修改条数
     */
    int updateDVD(LjwDVD dvd);

    /**
     * 根据id查找一张DVD
     * @param id dvd主键
     * @return
     */
    LjwDVD getDVDById(Long id);

}
