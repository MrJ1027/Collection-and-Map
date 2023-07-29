package com.jtl.List;

/**
 * @author jtl
 * java学习用
 * 简单链表
 */
public class LinkedList01 {
    public static void main(String[] args) {
        Node jtl = new Node("jtl");
        Node cqh = new Node("cqh");
        Node zhy = new Node("zhy");
        //链接结点，双向链表
        //jtl —— cqh -- zhy
        jtl.next = cqh;
        cqh.pre = jtl;
        cqh.next = zhy;
        zhy.pre = cqh;

        Node first = jtl;//让first引用指向jtl，就是双向链表的头结点
        Node end = zhy;//尾结点

        //顺序遍历
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("==========");
        //把刘备插入zhy和cqh之间...
        Node LiuBei = new Node("刘备");
        LiuBei.next = zhy;
        LiuBei.pre = cqh;
        zhy.pre = LiuBei;
        cqh.next = LiuBei;
        //反向遍历
        while (true) {
            if (end == null) {
                break;
            }
            System.out.println(end);
            end = end.pre;
        }

    }
}

//定义Node类，表示双向链表的一个节点
class Node {
    public Object item;//存放数据的地方
    public Node next;//指向后一个结点
    public Node pre;//指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name = " + item;
    }
}