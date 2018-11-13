package com.ljw.test;

import com.ljw.base.util.PropertiesUtils;
import com.ljw.test.mgr.DvdMgr;

public class Main {
    public static void main(String[] args) {
        DvdMgr d = (DvdMgr)PropertiesUtils.getObject("LJW_DVD_MGR");
        assert d != null;
        d.Menu();
    }

}
