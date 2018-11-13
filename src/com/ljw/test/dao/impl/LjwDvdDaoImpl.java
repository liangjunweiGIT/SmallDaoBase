package com.ljw.test.dao.impl;

import com.ljw.base.db.BaseDao;
import com.ljw.base.util.CollectionUtil;
import com.ljw.test.dao.LjwDvdDao;
import com.ljw.test.pojo.LjwDvd;
import com.ljw.test.vo.DvdVo;

import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 18:22
 */
public class LjwDvdDaoImpl extends BaseDao implements LjwDvdDao {
    @Override
    public List<DvdVo> queryDVDList() {
        return queryForList("SELECT td.*,tl.lend_date,tt.name as typeName FROM t_dvd td LEFT JOIN t_lend tl on (td.id=tl.dvd_id AND tl.return_date=null)" +
                "LEFT JOIN t_type tt on td.type_id = tt.id WHERE is_delete=0 ORDER BY td.count DESC, td.id ASC", DvdVo.class);
    }

    @Override
    public int addDVD(LjwDvd dvd) {
        return insert("insert into t_dvd values(#id#,#name#,0,#status#,#count#,#typeId#,0)", dvd);
    }

    @Override
    public int deleteDVD(List<Long> idList) {
        StringBuilder sb = new StringBuilder("(").append(CollectionUtil.list2String(idList, ",")).append(")");
        return update("UPDATE t_dvd set is_delete = 1  where id in ( #sb# )", sb);
    }

    @Override
    public int updateDVD(LjwDvd dvd) {
        return update("UPDATE t_dvd SET name=#name#, is_delete=#isDelete#, status=#status#, count=#count#,type_id=#typeId#  where id = #id#", dvd);
    }

    @Override
    public LjwDvd getDVDById(Long id) {
        return queryForObject("select * from t_dvd where id=#id# AND is_delete=0", LjwDvd.class, id);
    }
}
