package com.jtl.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 蒋天乐
 * java学习用
 * 增强for循环
 */
public class CollectionFor {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10));
        col.add(new Book("水浒传","施耐庵",20));
        col.add(new Book("红楼梦","曹雪芹",30));

        //增强for 底层仍然是迭代器 ->Debug 理解成简化版本的迭代器遍历
        //快捷：I / col.for
        for(Object book : col){
            System.out.println(book);
        }
    }

}
