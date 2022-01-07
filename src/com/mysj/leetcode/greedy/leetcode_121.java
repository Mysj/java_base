package com.mysj.leetcode.greedy;

public class leetcode_121 {
    public static int maxProfit(int[] prices) {

        if (prices.length == 0)return 0;
        int Min = prices[0];
        int Max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < Min)Min = prices[i];
            else Max = Math.max(Max,prices[i] - Min);
        }
        return Max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
