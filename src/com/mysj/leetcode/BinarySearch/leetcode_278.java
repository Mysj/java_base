package com.mysj.leetcode.BinarySearch;

/**
 *
 */
public class leetcode_278 {
    public int firstBadVersion(int n) {
        int l = 1,r = n;
        while(l < r){
            //这里注意不能(l + r)/2,这样有可能溢出，而且时间开销比下面的更大
            int mid = l + (r - l) / 2;
            //if(isBadVersion(mid)){
            if(true){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;

    }

    public static void main(String[] args) {

    }
}
