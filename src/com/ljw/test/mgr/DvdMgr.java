package com.ljw.test.mgr;

import com.ljw.test.enums.IsDeleteEnum;
import com.ljw.test.pojo.LjwDvd;
import com.ljw.test.service.LjwDvdService;
import com.ljw.base.util.PropertiesUtils;

import java.util.Scanner;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/30 17:12
 */
public class DvdMgr {
    private LjwDvdService dvdService = (LjwDvdService) PropertiesUtils.getObject("LJW_DVD_SERVICE");

    private Scanner sc = new Scanner(System.in);

    public void Menu() {
        System.out.println("******************");
        System.out.println("****欢迎使用迷你DVD管理器****");
        System.out.println("*******1.新增DVD********");
        System.out.println("*******2.查看DVD********");
        System.out.println("*******3.删除DVD********");
        System.out.println("*******4.借出DVD********");
        System.out.println("*******5.归还DVD********");
        System.out.println("*******6.DVD排行榜********");
        System.out.println("*******7.退出********");
        System.out.println("********************");
        System.out.println("要办理的业务");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                addDvd();
                returnMenu();
                break;
            case 2:
                searchDvd();
                returnMenu();
                break;
            case 3:
                deleteDvd();
                returnMenu();
                break;
            case 4:
                lendDvd();
                returnMenu();
                break;
            case 5:
                returnDvd();
                returnMenu();
                break;
            case 6:
                list();
                returnMenu();
                break;
            case 7:
                System.out.println("谢谢使用下次再来");
                break;
            default:
                System.out.println("输入异常，系统崩溃");
        }
    }

    private void returnMenu() {
        System.out.println("输入0返回");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            Menu();
        } else {
            returnMenu();
        }
    }

    private void addDvd() {
        LjwDvd dvd = new LjwDvd();
        System.out.println("输入编号");
        dvd.setId(sc.nextLong());
        System.out.print("输入名称:");
        dvd.setName(sc.next());
        dvd.setIsDelete(IsDeleteEnum.NO.getCode());
        dvd.setCount(0);
        System.out.println("片名类型:");
        dvd.setTypeId(sc.nextLong());
        if (dvdService.addDVD(dvd)) {
            System.out.println("add ok");
        } else {
            System.out.println("add error");
        }
    }

    private void searchDvd() {
    }

    private void deleteDvd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入DVDid");
        Long id = sc.nextLong();
        if (dvdService.delete(id)) {
            System.out.println("delect ok");
        } else {
            System.out.println("delect error");
        }
    }

    private void lendDvd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入借DVD的id");
        Long id = sc.nextLong();
        if (dvdService.lendDVD(id)) {
            System.out.println("lend Ok");
        } else {
            System.out.println("lend error");
        }
    }

    private void returnDvd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入还DVD的id");
        Long id = sc.nextLong();
        System.out.println("输入还DVD日期");
        String date = sc.nextLine();
        if (dvdService.returnDVD(id, date)) {
            System.out.println("return Ok");
        } else {
            System.out.println("无相关信息");
        }
    }

    public void list() {
        dvdService.showAllDVD();
    }

}
