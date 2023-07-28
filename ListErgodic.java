package com.jtl.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author 蒋天乐
 * java学习用
 * List三种遍历方式
 */
public class ListErgodic {
    public static void main(String[] args) {
        //List接口实现子类：Vector等也可以
        List list = new ArrayList();
        for(int i = 0; i < 10; i++){
            list.add("jtl" + i);
        }
        System.out.println("迭代器遍历输出...");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj =" + obj);
        }
        System.out.println("增强for遍历输出...");
        for(Object obj : list){
            System.out.println("obj =" + obj);
        }
        System.out.println("普通for循环遍历输出...");
        for(int i = 0; i < list.size(); i++){
            System.out.println("obj =" + list.get(i));
        }
    }
}
