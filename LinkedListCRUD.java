package com.jtl.List;

import java.util.LinkedList;

/**
 * @author jtl
 * java学习用
 *
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.remove();
        System.out.println("linkedList = " + linkedList);
    }
}
