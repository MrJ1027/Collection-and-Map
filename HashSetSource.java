package com.jtl.Set_;

import java.util.HashSet;


public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("水浒传");
        hashSet.add("三国演义");
        hashSet.add("水浒传");
        System.out.println("set = " + hashSet);
    }
}

/**
 * @author jtl
 * java学习用
 *
 * HashSet源码：
 * 1.构造器
 *   public HashSet() {
 *         map = new HashMap<>();
 *     }
 *  2.执行add
 *   public boolean add(E e) {e= "java"
 *         return map.put(e, PRESENT)==null;
 *         //    private static final Object PRESENT = new Object();--> 只是一个占位
 *     }
 *  3.执行put
 *   public V put(K key, V value) {key = "java"，value = PRESENT共享
 *         return putVal(hash(key), key, value, false, true);
 *     }
 *  4.然后得到-->hash(key)得到key对应的hash值，不完全等价于hashCode
 *     static final int hash(Object key) {
 *         int h;
 *         return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
 *     }
 *
 *   5.执行putVal方法-->核心方法
 *   final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
 *                    boolean evict) {
 *         Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
 *         //table是HashMap的一个数组，类型是Node[]
 *         //if语句表示如果当前table是null，或者大小为0
 *         //就走resize方法扩容到16个
 *         if ((tab = table) == null || (n = tab.length) == 0)
 *             n = (tab = resize()).length;
 *             //1.根据key得到的hash去计算该key应该存放到table的哪个索引位置
 *             //并且把这个位置的对象赋给p
 *             //2.判断p是否为null
 *             //2.1 如果p为null，表示还没有存放元素，就创建一个Node(key = "java",value = PERSENT)
 *             //就放在该位置tab[i] = newNode(hash, key, value, null);
 *         if ((p = tab[i = (n - 1) & hash]) == null)
 *             tab[i] = newNode(hash, key, value, null);
 *         else {
 *              //在需要局部变量(辅助变量)的时候，再创建;
 *             Node<K,V> e; K k;
 *             //如果当前索引位置对应的链表的第一个元素的hash值与准备添加的key的hash相同
 *             //并且满足下面两个条件之一：
 *             //1.准备加入的key("java")和p 指向的Node结点的key是同一个对象
 *             //2. p 指向的Node结点的key的equals()和准备加入的key比较后相同
 *             //那么这个key(这里是"java")就不能再加入了
 *             //说明：比如你加的是自定义对象(Person),可能两个对象不是同一个，但是经过重写后的equals判断
 *             //它两个是同一个对象，也满足条件，这就是为什么有第二个条件，满足其中一个就认为是相同的对象
 *             if (p.hash == hash &&
 *                 ((k = p.key) == key || (key != null && key.equals(k))))
 *                 e = p;
 *
 *              //再判断p是不是一颗TreeNode
 *              //如果是红黑树，就调用putTreeVal进行添加
 *             else if (p instanceof TreeNode)
 *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
 *              //进入链表,for循环遍历比较后面的
 *              //如果table对应的索引位置，已经是一个链表，就使用for循环比较
 *              //1.依次和该链表的每一个元素比较后，都不相同，则加入到该链表的最后
 *              //在把元素添加到链表后，立即判断该链表是否已经达到了8个结点
 *              //如果达到了，就调用treeifyBin(tab, hash);对当前链表进行树化(转成红黑树)
 *              //注意，在转成红黑树时，要进行判断，若table数组大小小于64(if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY))
 *              //成立,先用resize对table扩容
 *              //不成立时，才进行树化
 *              //2.在依次比较过程中，如果有相同情况，就直接break;
 *
 *             else {
 *                 for (int binCount = 0; ; ++binCount) {
 *                     if ((e = p.next) == null) {
 *                         p.next = newNode(hash, key, value, null);
 *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
 *                             treeifyBin(tab, hash);
 *                         break; 1.
 *                     }
 *                     //但凡后面有一个相同，直接退出
 *                     if (e.hash == hash &&
 *                         ((k = e.key) == key || (key != null && key.equals(k))))
 *                         break; 2.
 *                     p = e;//把p往后移动
 *                 }
 *             }
 *             if (e != null) { // existing mapping for key
 *                 V oldValue = e.value;
 *                 if (!onlyIfAbsent || oldValue == null)
 *                     e.value = value;
 *                 afterNodeAccess(e);
 *                 return oldValue;
 *             }
 *         }
 *         ++modCount;
 *         //size每加入一个Node就增加一个
 *         if (++size > threshold)
 *             resize();
 *         afterNodeInsertion(evict);
 *         return null;
 *     }
 *
 *
 */
