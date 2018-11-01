package demo;

import com.zyw.mgr.DVDMgr;
import com.zyw.pojo.LjwDVD;
import com.zyw.service.LjwDVDService;
import com.zyw.utils.PropertiesUtils;

public class Main {
    public static void main(String[] args) {
        DVDMgr d = (DVDMgr)PropertiesUtils.getObject("LJW_DVD_MGR");
        assert d != null;
        d.Menu();
        /*LjwDVDService dvdService = (LjwDVDService) PropertiesUtils.getObject("LJW_DVD_SERVICE");
        assert dvdService != null;
        dvdService.showAllDVD();
        *//*LjwDVD dvd = new LjwDVD();
        dvd.setId(12L);
        System.out.println(dvdService.addDVD(dvd));*/
    }

}
