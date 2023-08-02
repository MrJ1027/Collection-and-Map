package com.jtl.Set_;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author jtl
 * java学习用
 * 1.当使用无参构造器创建TreeSet时，仍然是无序的
 * 2.希望添加的元素，按照字符串大小来排序
 * 3.使用TreeSet提供的一个构造器，可以传入一个比较器(匿名内部类)
 */
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet<Object> objects = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的compareTo方法
                /*
                *     public int compareTo(String anotherString) {
                        int len1 = value.length;
                        int len2 = anotherString.value.length;
                        int lim = Math.min(len1, len2);
                        char v1[] = value;
                        char v2[] = anotherString.value;

                        int k = 0;
                        while (k < lim) {
                            char c1 = v1[k];
                            char c2 = v2[k];
                            if (c1 != c2) {
                                return c1 - c2;
                            }
                            k++;
                        }
                        return len1 - len2;
                    }
                * */
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        objects.add("jtl");
        objects.add("cq");
        objects.add("z");
        objects.add("messi");
        System.out.println("objects =" + objects);
    }
}

/*
* 1.构造器把传入的比较器对象赋给了TreeSet的底层TreeMap的属性->comparator
*
*  public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }
*
*  2.在调用treeSet.add("jtl"),底层执行
*
*    Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {
                parent = t;
              //动态绑定我们的匿名内部类对象
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
*
*
*
*
*
*
*
*
*
*
* */
