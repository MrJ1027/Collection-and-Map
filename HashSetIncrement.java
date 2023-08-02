package com.jtl.Set_;

import java.util.HashSet;

/**
 * @author jtl
 * java学习用
 * HashSet扩容机制
 * HashSet底层是HashMap,第一次添加时，table数组扩容到16，
 * 临界值(threshold)是16 * 加载因子(loadFactor)是0.75 = 12
 * 如果table 数组使用到了临界值12，就会扩容到16*2=32，
 * 新的临界值就是32*0.75=24,以此类推
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        for(int i = 1; i <= 100; i++){
//            hashSet.add(i);
//        }
        /*
         * 如果一条链表的元素个数(size)达到 TREEIFY_THRESHOLD(default:8)
         *并且table的大小 >= MIN_TREEIFY_CAPACITY(default：64),
         * 就会进行树化(红黑树)，否则仍然采用数组扩容机制
         *
         *
         * */
        for (int i = 0; i <= 12; i++) {
            hashSet.add(new Test(i));
        }
        System.out.println("hashSet = " + hashSet);


    }
}

class Test {
    private int n;

    public Test(int n) {
        this.n = n;
    }

    //重写hashCode方法，该类对象的hashCode都一样，在表中的索引自然也就一样了
    public int hashCode() {
        return 10086;
    }
}
