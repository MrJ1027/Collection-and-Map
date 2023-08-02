package com.jtl.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 蒋天乐
 * java学习用
 */
public class SetMethod {
    public static void main(String[] args) {
        //1.以Set接口的实现类HashSet来讲解Set接口的办法
        //2.set接口的实现类的对象(Set接口对象),不能存放重复元素，可以添加一个null
        //3.set接口对象存放数据是无需(即添加的顺序和取出的顺序不一致)
        //4.取出的顺序虽然不是添加的顺序，但他是固定的(for循环验证)
        Set set = new HashSet();
        set.add("cqh");
        set.add("jtl");
        set.add("zhy");
        set.add("jtl");
        set.add("null");
        set.add("null");
        System.out.println("set = " + set);

        //5.遍历：
        //1.使用迭代器 -> 是Collection的子接口
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        //2.增强for便利
        System.out.println("==========增强for==========");
        for(Object o : set){
            System.out.println("o = " + o);
        }
        //set对象不能通过索引遍历,因为没有List的get方法。
    }
}
