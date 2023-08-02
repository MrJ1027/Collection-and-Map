package com.jtl.Set_;


import java.util.HashSet;

/**
 * @author jtl
 * java学习用
 * 数组加链表结构
 */
public class HashSetStructure {
    public static void main(String[] args) {
        Node[] hashSet = new Node[5];
        Node jtl = new Node("jtl", null);
        hashSet[1] = jtl;
        Node cqh = new Node("cqh", null);
        jtl.next = cqh;
        System.out.println(jtl);
        System.out.println(cqh);


    }
}

class Node{
    private Object item;
    public Node next;

    public Node(Object item,Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}


