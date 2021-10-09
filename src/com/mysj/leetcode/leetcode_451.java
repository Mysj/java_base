package com.mysj.leetcode;

import java.util.*;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 */
public class leetcode_451 {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int frequency = map.getOrDefault(c, 0) + 1;
            map.put(c, frequency);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            for (int j = 0; j < map.get(c); j++) {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String str = "Aabccbc";
        String s = frequencySort(str);
        System.out.println(s);
    }
}
