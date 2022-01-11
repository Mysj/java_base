package com.mysj.leetcode.BinarySearch;

public class leetcode_540 {
    public static int singleNonDuplicate(int[] nums) {
        int index = 0;//为出现一次的数字的位置
        int n = nums.length;//肯定为奇数，但是要注意下标是从0开始
        int l = 0,r = n - 1;
        int mid = 0;
        while (l < r){
            mid = (l + r) / 2;
            if (mid % 2 == 1){
                mid--;
            }
            if (nums[mid] == nums[mid + 1]){
                l = mid + 2;
            }else {
                r = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        //有序数组
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
