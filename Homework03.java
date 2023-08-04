package com.jtl.Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author jtl
 * java学习用
 */
public class Homework03 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        map.put("jack",2600);

        Set<String> strings = map.keySet();
        for(Object key : strings){
            map.put((String)key,(Integer)map.get(key) + 100);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("name = " + entry.getKey() + " sal = " + entry.getValue());
        }
    }
}
