package com.jtl.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author 蒋天乐
 * java学习用
 */
public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new  Vector();
        list.add(new Book("三国演义",50,"罗贯中"));
        list.add(new Book("无间梦境",10,"纸嫁衣"));
        list.add(new Book("资治通鉴",20,"司马光"));
        for(Object obj : list){
            System.out.println(obj);
        }
        bubbleSort(list);
        System.out.println("==========排序后===========");
        for(Object obj : list){
            System.out.println(obj);
        }
    }
    //对集合进行排序
    public static void bubbleSort(List list){
        int size = list.size();//不用反复调用size
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1 - i; j++){
                //比较,取出对象
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()){
                        list.set(j,book2);
                        list.set(j + 1,book1);
                }
            }
        }
    }


}

class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
