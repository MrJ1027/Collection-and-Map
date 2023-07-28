package com.jtl.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蒋天乐
 * java学习用
 */
public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        //1.List集合类中元素有序(添加和取出顺序一致，而且可以重复)
        list.add("jtl");
        list.add("cqh");
        list.add("zhy");
        list.add("lkt");
        list.add("lkt");
        System.out.println("list = " + list);
        //2.List集合中的每个元素都有对应的顺序索引，从0开始
        System.out.println(list.get(1));//输出cqh

    }
}
