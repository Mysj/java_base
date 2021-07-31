package com.mysj.sort;

/**
 * 实现快排
 */
public class QuickSort {
    public  void swap(int[] data,int start,int high){
        int temp = data[start];
        data[start] = data[high];
        data[high] = temp;
    }

    public  void sort(int[] data,int start,int end){
        if (start < end){
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true){
                while(low < end && data[++low] <= base);
                while(start < high && data[--high] >= base);
                if (low < high){
                    swap(data,low,high);
                }else {
                    break;
                }
            }
            swap(data,start,high);
            sort(data,start,high - 1);
            sort(data,high + 1,end);
        }
    }
}
