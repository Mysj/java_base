package com.mysj.leetcode.greedy;

public class leetcode_392 {
    public static boolean isSubsequence(String s, String t) {

        int index = -1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c,index + 1);
            if (index == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
