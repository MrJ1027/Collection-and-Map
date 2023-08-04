package com.jtl.Collections_;

import java.util.*;

/**
 * @author jtl
 * java学习用
 */
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //1.反转List中元素的顺序
        list.add("jtll");
        list.add("cq");
        list.add("z");
        list.add("lkttttt");
        Collections.reverse(list);
        System.out.println("list = " + list);
        //2.对List集合元素随机进行排序
        Collections.shuffle(list);
        System.out.println("list = " + list);
        //3.根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        System.out.println("list = " + list);
        //4.根据指定的Comparator产生的顺序对List集合元素排序
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("list = " + list);

        //5.指定List集合中i处元素和j处元素进行交换
        Collections.swap(list,0,3);
        System.out.println("list交换后 = " + list);

        //6.根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然顺序的最大值=" + Collections.max(list));

        //7.根据Comparator指定顺序，返回给定集合中的最大元素
        Object maxObj = Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("maxObj = " + maxObj);

        //min同理

        //返回指定集合中指定元素的出现次数
        System.out.println(Collections.frequency(list,"cq"));

        //将src的内容赋值到dest中
        //为了完成完整的拷贝，需要先给dest赋值，大小和list.size()一样
        ArrayList dest = new ArrayList();
        for(int i = 0; i < list.size(); i++){
            dest.add(null);
        }
        Collections.copy(dest,list);
        System.out.println("dest = " + dest);

        //使用新值替换List对象的所有旧值
        Collections.replaceAll(list,"cq","曹操");
        System.out.println("list = " + list);


    }
}
