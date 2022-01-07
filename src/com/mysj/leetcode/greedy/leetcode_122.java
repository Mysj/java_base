package com.mysj.leetcode.greedy;

public class leetcode_122 {
    public static int maxProfit(int[] prices) {

        if (prices.length == 0)return 0;
        int profile = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])profile += prices[i] - prices[i - 1];
        }
        return profile;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
