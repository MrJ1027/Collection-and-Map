package com.jtl.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蒋天乐
 * java学习用
 * List接口常用方法...
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //1.void add(int index,Object eles) 在index位置插入一个元素
        list.add("宋江");
        list.add("卢俊义");
        list.add(1,"晁盖");
        System.out.println("list = " + list);//list = [宋江, 晁盖, 卢俊义]
        //2.boolean addAll(int index,Collection eles) 从index位置开始将另一个集合所有元素添加进来
        List list2 = new ArrayList();
        list2.add("吴用");
        list2.add("公孙胜");
        list.addAll(3,list2);
        System.out.println("list = " + list);//list = [宋江, 晁盖, 卢俊义, 吴用, 公孙胜]
        //3.Object get(int index)获取指定index位置的元素
        System.out.println(list.get(0));//宋江
        //4.indexOf/lastIndexOf(Object obj) 返回obj在当前集合第一/最后一次出现的位置
        list.add("宋江");
        System.out.println(list.indexOf("宋江"));//0
        System.out.println(list.lastIndexOf("宋江"));//5
        //5.Object remove(int index)移除index位置的元素，并返回新的集合
        list.remove(0);
        System.out.println("list = " + list);//list = [晁盖, 卢俊义, 吴用, 公孙胜, 宋江]
        //6.Object set(int index, Object ele) 设置指定index位置的元素为ele，就是替换
        list.set(0,"林冲");
        System.out.println("list = " + list);//list = [林冲, 卢俊义, 吴用, 公孙胜, 宋江]
        //7.List subList(int fromIndex,int toIndex)返回从fromIndex到toIndex的子集合(前闭后开)
        list = list.subList(0,2);
        System.out.println("list = " + list);//list = [林冲, 卢俊义]


    }
}
