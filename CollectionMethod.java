package com.jtl.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蒋天乐
 * java学习用
 * Collection interface 常见方法
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //1.add,添加单个元素
        list.add("jtl");//list.add(Object obj)
        list.add(18);
        list.add(true);
        System.out.println("list = " + list);//jtl 18 true
        //2.删除指定元素
        list.remove(0);//参数：index，删除第一个元素
        System.out.println("list = " + list);// 18 true
        list.remove(Integer.valueOf(18));//参数 Object 指定删除某个元素
        System.out.println("list = " + list);//true
        //3.查找元素是否存在
        if(list.contains(true)){
            System.out.println("存在");
        }
        //4.size获取元素个数
        System.out.println(list.size());
        //5.isEmpty判断是否为空
        String str = list.isEmpty()? "为空" : "不为空";
        System.out.println(str);
        //6.clear清空所有元素
        list.clear();
        System.out.println("list = " + list);
        //7.addAll添加多个元素
        List list2 = new ArrayList();
        list2.add("水浒传");
        list2.add("宋江");
        list.addAll(list2);
        System.out.println("list = " + list);
        //8.containsAll查找多个元素是否存在
        System.out.println(list.containsAll(list2));//true
        //9.removeAll删除多个元素
        list.removeAll(list2);
        list.add("三国演义");
        System.out.println("list = " + list);//只剩三国演义


    }
}
