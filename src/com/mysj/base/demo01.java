package com.mysj.base;

import java.util.*;

/**
 * Map的遍历方式
 */
public class demo01 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aaaaaaa",1);
        map.put("bbbbbb",12);
        map.put("ffffff",11);
        map.put("eeeee",143);
        map.put("qqqqq",13);

        //fun_for(map);
        fun_iterator3(map);
    }

    /**
     * for循环遍历
     * @param map
     */
    public static void fun_for(Map<String,Integer> map){
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "----------->" + entry.getValue());
        }
    }

    /**
     * 迭代
     * @param map
     */
    public static void fun_iterator1(Map<String,Integer> map){
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) i.next();
            System.out.println(entry.getKey()+ "----------->" + entry.getValue());
        }
    }

    /**
     * keySet()迭代
     * @param map
     */
    public static void fun_iterator2(Map<String,Integer> map){
        Iterator i = map.keySet().iterator();
        while (i.hasNext()){
            String key = i.next().toString();
            System.out.println(key + "---------->" + map.get(key));
        }
    }

    /**
     * entrySet()迭代
     * @param map
     */
    public static void fun_iterator3(Map<String,Integer> map){
        Iterator it=map.entrySet().iterator();
        String key;
        String value;
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            key=entry.getKey().toString();
            value=entry.getValue().toString();
            System.out.println( key + "-------------->"+ value);
        }
    }
}
