package com.jtl.Set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author jtl
 * java学习用
 *
 *1. LinkedHashSet中维护了一个hash表和双向链表(有head和tail)
 *2.每一个节点有before和after属性，形成双向链表
 *3.在添加一个元素时，先求hash值，再求索引，确定该元素的位置，然后将添加元素
 * 加入到双向链表(如果已经存在了，不添加)
 *4.通过双向链表可以保证插入顺序和遍历顺序一致
 *
 */
public class LinkedHashSet_ {
    public static void main(String[] args) {
        //底层分析
        Set set = new LinkedHashSet();
        set.add(new String("jtl"));
        set.add(100);
        set.add(100);
        set.add(new Cat("小豆",2));
        set.add(200);
        set.add("cqh");
        System.out.println("LinkedHashSet = " + set);
        //1.LinkedHashSet 加入顺序和取出元素/数据顺序一致
        //2.LinkedHashSet底层维护的是一个LinkedHashMap(是HashMap的子类)
        //3.LinkedHashSet底层结构(数组+双向链表)
        //4.添加第一次时，直接将table数组(数组类型是HashMap$Node[])扩容到16，存放的结点类型是 LinkedHashMap$Entry
        //数组是HashMap$Node[]存放的元素是 LinkedHashMap$Entry类型，表面两个类型有继承关系，把子类对象存在父类类型的数组
        /*

               //静态内部类
        *     static class Entry<K,V> extends HashMap.Node<K,V> {
                Entry<K,V> before, after;
                Entry(int hash, K key, V value, Node<K,V> next) {
                    super(hash, key, value, next);
                }
            }

        * */

    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
