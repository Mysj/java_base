package com.mysj.leetcode.greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_406 {
    /**
     * 身高从大到小、个数从小到大 进行排序，然后再进行插入操作
     * @param people
     * @return
     */
    public static int[][] reconstructQueue(int[][] people) {

        if (people == null || people.length == 0 || people[0].length == 0){
            return new int[0][0];
        }
        Arrays.sort(people,(a,b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people){
            queue.add(p[1],p);
        }
        return queue.toArray(new int[queue.size()][]);

    }

    public static void main(String[] args) {
        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        int[][] result =reconstructQueue(people);
        System.out.println(result);
    }
}
