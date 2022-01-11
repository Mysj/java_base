package com.mysj.leetcode.BinarySearch;

public class leetcode_034 {

    private static int findFirst(int[] nums, int target) {
        int l = 0, h = nums.length; // 注意 h 的初始值
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= target) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findFirst(nums, target + 1) - 1;
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        } else {
            return new int[]{first, Math.max(first, last)};
        }
    }



    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 3;
        System.out.println(searchRange(nums, target)[0]+"   "+searchRange(nums, target)[1]);
    }
}
