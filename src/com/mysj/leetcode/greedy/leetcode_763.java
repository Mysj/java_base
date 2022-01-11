package com.mysj.leetcode.greedy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class leetcode_763 {
    public static List<Integer> partitionLabels(String s) {

        int[] lastIndexOfChar = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndexOfChar[s.charAt(i) - 'a'] = i;
        }
        List<Integer> partitions = new ArrayList<>();
        int firstIndex = 0;
        while(firstIndex < s.length()){
            int lastIndex = firstIndex;
            for (int i = firstIndex; i < s.length() && i <= lastIndex; i++) {
                int index = lastIndexOfChar[s.charAt(i) - 'a'];
                if (index > lastIndex){
                    lastIndex = index;
                }
            }
            partitions.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
        }
        return partitions;
    }

    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";
        //输出结果：[9,7,8] "ababcbaca", "defegde", "hijhklij"。
        List<Integer> integers = partitionLabels(S);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
