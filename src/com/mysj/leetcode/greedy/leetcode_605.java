package com.mysj.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode_605 {
    /**
     * 只要有三个连续的0，就能种一朵花
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;
        int result = 0;
        for (int i = 0; i < len && result < n; i++) {
            if (flowerbed[i] == 1)continue;
            int pre = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == len - 1 ? 0 : flowerbed[i + 1];
            if (pre == 0 && next == 0){
                result++;
                flowerbed[i] = 1;
            }
        }

        return result >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
