package com.jtl.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蒋天乐
 * java学习用
 * ArrayList底层结构分析 -> ArrayList如何进行扩容...
 * 1.数据放在这里：transient Object[] elementData;
 * ArrayList中维护了一个Object类型的数组，transient表示该属性不会被序列化
 * <p>
 * 2.当创建ArrayList对象的时候，如果使用无参构造器，初始elementData
 * 容量为0，第一次添加就扩容为10，如果要再次扩容，则扩容为elementData的1.5倍
 * <p>
 * 3.如果使用指定大小的有参构造器，则初始elementData为指定大小的数组，如果要再次扩容
 * 就直接按照1.5倍进行扩容
 */
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //走Debug看源码...
        List list = new ArrayList();
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        for(int i = 11; i <= 15; i++){
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        /*真正实现扩容的源码，也可以看出来调用不同构造器第一次走的地方不一样
        //扩容使用的是Arrays里面的copyOf方法...
        * private void grow(int minCapacity) {
        //      overflow-conscious code
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
            if (newCapacity - MAX_ARRAY_SIZE > 0)
                newCapacity = hugeCapacity(minCapacity);
            // minCapacity is usually close to size, so this is a win:
            elementData = Arrays.copyOf(elementData, newCapacity);
         }
        *
        * */


    }

}
