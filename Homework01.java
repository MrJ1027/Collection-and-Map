package com.jtl.Homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author jtl
 * java学习用
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList<Report> reports = new ArrayList<>();
        Report report1 = new Report("\"新冠确诊病例超千万，数百万印度信徒赴恒河\\\"圣浴\\\"引民众担忧\"");
        Report report2 = new Report("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        reports.add(report1);
        reports.add(report2);
        for(int i = reports.size() - 1; i >= 0; i--){
            System.out.println(processTitle(reports.get(i).getTitle()));
        }

    }

    public static String processTitle(String title){
        if(title == null){
            return "";
        }
        if(title.length() > 15){
            return title.substring(0,15) + "...";
        }
        return title;
    }
}

