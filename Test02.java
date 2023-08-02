package com.jtl.Set_;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @author jtl
 * java学习用
 */
public class Test02 {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        objects.add(new Bird("小白",1));
        objects.add(new Bird("小白",2));
        objects.add(new Bird("小黄",1));
        objects.add(new Bird("小白",3));
        System.out.println("objects =" + objects);
    }
}

class Bird{
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
