package com.ljw.test.dao;

import com.ljw.test.pojo.LjwDvd;
import com.ljw.test.vo.DvdVo;

import java.util.List;

/**
 * @Description: t_dvd表dao层接口
 * @Author Created by junwei.liang on 2018/10/30 15:34
 */
public interface LjwDvdDao {
    /**
     * 查询DVD列表
     *
     * @return DVD列表
     */
    List<DvdVo> queryDVDList();

    /**
     * 新增DVD
     *
     * @param dvd DVD
     * @return 修改条数
     */
    int addDVD(LjwDvd dvd);

    /**
     * 根据编号列表删除DVD 支持批量
     *
     * @param idList id列表
     * @return 修改条数
     */
    int deleteDVD(List<Long> idList);

    /**
     * 修改dvd状态等数据
     *
     * @param dvd dvd
     * @return 修改条数
     */
    int updateDVD(LjwDvd dvd);

    /**
     * 根据id查找一张DVD
     *
     * @param id dvd主键
     * @return DVD
     */
    LjwDvd getDVDById(Long id);

}
