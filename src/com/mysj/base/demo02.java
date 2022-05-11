package com.mysj.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class demo02 {
    public static void main(String[] args) {
        String s = new String("2");
        s.intern();
        String s2 = "2";
        System.out.println(s == s2);

        Map<String,String> map = new HashMap<>();
        System.out.println(map.getOrDefault("111", "1233333"));
    }
}
