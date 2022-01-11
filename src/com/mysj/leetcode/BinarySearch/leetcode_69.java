package com.mysj.leetcode.BinarySearch;

public class leetcode_69 {
    public static int mySqrt(int x) {
        if(x <= 1){
            return x;
        }
        int l = 1,h = x;
        while (l <= h){
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if(sqrt == mid){
                return mid;
            }else if(mid > sqrt){
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int X = 8;
        System.out.println(mySqrt(X));
    }
}
