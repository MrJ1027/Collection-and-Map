package com.jtl.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 蒋天乐
 * java学习用
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i = 0; i < 10; i++){
            list.add("hello" + i);
        }
        list.add(1,"hello jtl");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"hello 实况足球");
        Iterator iterator = list.iterator();
        int i = 1;
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj"+ i +"=" + obj);
            i++;
        }
    }
}
