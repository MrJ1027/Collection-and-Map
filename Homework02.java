package com.jtl.Homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author jtl
 * java学习用
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("jtl");
        arrayList.add("cqh");
        arrayList.add("jtl");
        arrayList.remove("jtl");
        System.out.println(arrayList.contains(123));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        ArrayList<Object> arrayList1 = new ArrayList<>();
        arrayList1.add("messi");
        arrayList1.add("kane");
        arrayList1.add("sonny");
        arrayList.addAll(arrayList1);
        System.out.println("arrayList = " + arrayList );
        System.out.println(arrayList.containsAll(arrayList1));
        arrayList.removeAll(arrayList1);

        arrayList.add(new Car("宝马",400000));
        arrayList.add(new Car("宾利",500000));
        System.out.println("---------增强for----------");
        for(Object obj : arrayList){
            System.out.println("obj =" + obj);
        }
        System.out.println("----------迭代器----------");
        Iterator<Object> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
