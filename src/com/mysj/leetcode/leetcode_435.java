package com.mysj.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 */
public class leetcode_435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0;
        //把二维数组按照右边界排序-----因为右边界越小，可以选择的区间越多---去掉的区间越少
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
                //return o1[0] - o2[0];这是按照左边界排序
            }
        });

        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }

        return intervals.length - cnt;
    }


    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
