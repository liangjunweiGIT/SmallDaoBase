package com.ljw.test.dao;

import com.ljw.test.pojo.LjwLend;

/**
 * @Description: t_lend表dao层接口
 * @Author Created by junwei.liang on 2018/10/30 16:54
 */
public interface LjwLendDao {
    /**
     * 新增借出表记录
     *
     * @param id dvdId列表
     * @return 新增条数
     */
    int addLendDVD(Long id);

    /**
     * 修改借出表
     *
     * @param lend lend对象
     * @return 修改条数
     */
    int update(LjwLend lend);

    /**
     * 根据DVDid查询未归还的一条数据
     *
     * @param dvdId dvd表主键
     * @return 借出记录
     */
    LjwLend getLendByDvdId(Long dvdId);
}
