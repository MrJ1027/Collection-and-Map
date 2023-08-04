package com.jtl.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 蒋天乐
 * java学习用
 * 迭代器遍历
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();//向上转型
        col.add(new Book("三国演义","罗贯中",10));
        col.add(new Book("水浒传","施耐庵",20));
        col.add(new Book("红楼梦","曹雪芹",30));

        System.out.println("col = " + col);
        //希望遍历col集合
        //1.先得到col的迭代器
        Iterator iterator = col.iterator();
        //2.使用循环遍历(快捷键itit直接出来 ---> ctrl + j 显示所有快捷键)
        int i = 1;
        while(iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，编译类型是Object,运行类型是你存的对象类型
            //动态绑定机制
            Object obj = iterator.next();
            System.out.println("obj"+ i + " = " + obj);
            i++;
        }
        //iterator.next();
        //3.当退出while循环后，这时iterator迭代器指向最后的元素
        //这时再iterator.next(),直接抛出异常NoSuchElementException

        //4.如果需要再次遍历，需要重置迭代器:
        iterator = col.iterator();

    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
