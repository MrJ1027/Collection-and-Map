package com.jtl.List;

import java.util.Vector;

/**
 * @author JackSpeed
 * java学习用
 * Vector扩容机制源码
 * 1.new Vector() ->
 *   public Vector() {
 *         this(10);
 *     }
 *
 *  2.添加数据到vector集合
 *     vector.add(i) ->
 *     public synchronized boolean add(E e) {
 *         modCount++;
 *         ensureCapacityHelper(elementCount + 1);
 *         elementData[elementCount++] = e;
 *         return true;
 *     }
 *    确定是否需要扩容,如果需要的最小容量比最大容量还小，就需要
 *       private void ensureCapacityHelper(int minCapacity) {
 *         // overflow-conscious code
 *         if (minCapacity - elementData.length > 0)
 *             grow(minCapacity);
 *     }
 *
 *   3.真正扩容：
 *    private void grow(int minCapacity) {
 *         // overflow-conscious code
 *         int oldCapacity = elementData.length;
 *         int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
 *                                          capacityIncrement : oldCapacity);
 *         if (newCapacity - minCapacity < 0)
 *             newCapacity = minCapacity;
 *         if (newCapacity - MAX_ARRAY_SIZE > 0)
 *             newCapacity = hugeCapacity(minCapacity);
 *         elementData = Arrays.copyOf(elementData, newCapacity);
 *     }
 *
 *   4.如果是无参，默认10，满了后按照两倍扩容
 *   如果指定大小，则每次直接按照两倍扩容
 *
 *
 *
 *
 */
public class Vector_ {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for(int i = 0; i < 10; i++){
            vector.add(i);
        }
        vector.add(11);
    }
}
