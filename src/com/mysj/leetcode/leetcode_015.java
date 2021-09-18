package com.mysj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 数组中选三个相加为0，输出
 */
public class leetcode_015 {
    /**
     * nums输出数组中相加为0的三个数，要求不能重复
     * nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * @param nums
     * @return
     */
    static public List<List<Integer>> threeSum(int[] nums) {
        //考虑使用排序 + 遍历 + 双指针
        Arrays.sort(nums);//-4,-1,-1,0,1,2
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (n < 3 || nums == null) return ans;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;//跳过重复数字
            int L = i + 1;
            int R = n - 1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while(L < R && nums[L] == nums[L+1]) L++;//去掉右边相同的数字
                    while(L < R && nums[R] == nums[R-1]) R--;//去掉左边相同的数字
                    L++;
                    R--;
                }else if(sum < 0){
                    L++;
                }else if(sum > 0){
                    R--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
