package com.jtl.Set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author jtl
 * java学习用
 */
public class HashSet_ {
    public static void main(String[] args) {
        //1.HashSet实际上是HashMap
        //  public HashSet() {
        //        map = new HashMap<>();
        //    }

        //2.HashSet可以存放null，但是只能有一个，即元素不能重复
        Set set = new HashSet();
        set.add(null);
        set.add(null);
        System.out.println("set = " + set);

        set = new HashSet();
        System.out.println("set = " + set);
        set.add("jtl");//添加成功
        set.add("jtl");//加入不了
        set.add(new Person("cqh"));//添加成功
        set.add(new Person("cqh"));//添加成功(名字相同但是不是一个对象)
        System.out.println("set = " + set);

        set.add(new String("zhy"));//ok
        set.add(new String("zhy"));//no
        System.out.println("set = " + set);



    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(name, person.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
