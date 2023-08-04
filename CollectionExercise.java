package com.jtl.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 蒋天乐
 * java学习用
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("cqh",18));
        list.add(new Dog("jtl",20));
        list.add(new Dog("zhy",25));
        //1.iterator遍历：
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        System.out.println("==================");
        //2.增强for遍历：
        for(Object obj : list){
            System.out.println("obj = " + obj);
        }
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
