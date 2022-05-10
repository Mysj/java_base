package com.mysj.sort;

/**
 * 测试各种排序算法
 */
public class Sort {
    //主方法测试
    public static void main(String[] args) {
        int[] input = {12,2,18,9,5,7,99,13};
        //bubbleSort(input);
        //selectSort(input);
        insertSort(input);
        //shellSort(input);

        //QuickSort quickSort = new QuickSort();
        //quickSort.sort(input,0,input.length - 1);

        for (int i : input) {
            System.out.println(i);
        }
    }


    /**
     * 交换算法，用异或
     * 异或的性质：0^a = a; a^a = 0;
     * 使用这样的交换算法前提是 这两个交换的值，在内存中是两个位置，不是同一个位置的数据
     *                        否则该内存区域的数据将会被抹成 0
     * @param a
     * @param i
     * @param j
     */
    public static void swap(int[]a,int i,int j){
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }

    /**
     * 实现冒泡排序
     * 时间复杂度    时间复杂度（最坏）   时间复杂度（最好）   空间复杂度   稳定性
     * O(N^2)       O(N^2)              O(N^2)              o(1)        稳定
     * 升序
     * @param input
     */
    public static void bubbleSort(int[] input){
        for (int i = 0; i < input.length; i++) {
            //优化算法，当第一次循环的时候没有发生交换，就说明有序，不执行后续
            boolean isSort = true;
            for (int j = 0; j < input.length-i-1; j++) {
                int temp = 0;
                if (input[j] > input[j+1]){
                    /*temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;*/
                    swap(input,j,j+1);
                    isSort = false;
                }
            }
            if (isSort){
                break;
            }
        }

    }

    /**
     * 实现选择排序
     * 时间复杂度    时间复杂度（最坏）   时间复杂度（最好）   空间复杂度   稳定性
     * O(N^2)       O(N^2)              O(N^2)              o(1)        稳定
     * 升序
     * @param input
     */
    public static void selectSort(int[] input){
        for (int i = 0; i < input.length; i++) {
            int min = i;
            int temp = 0;
            for (int j = i+1; j < input.length; j++) {
                if (input[min] > input[j]){
                    min = j;
                }
            }
            
            //交换位置
            temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
    }

    /**
     * 实现插入排序
     * 时间复杂度    时间复杂度（最坏）   时间复杂度（最好）   空间复杂度   稳定性
     * O(N^2)       O(N^2)              O(N)              o(1)        稳定
     *  升序
     * @param input
     */
    public static void insertSort(int[] input){
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j = 0;
            for (  j = i-1; j >= 0; j--) {
                if (temp < input[j]){
                    //往后移动
                    input[j+1] = input[j];
                }else {
                    break;
                }
            }
            input[j+1] = temp;
        }
    }

    /**
     * 实现希尔排序
     * 时间复杂度    时间复杂度（最坏）   时间复杂度（最好）   空间复杂度   稳定性
     * O(N^1.3)       O(N^2)              O(N)              o(1)        稳定
     *  升序
     * @param input
     */
    public static void shellSort(int[] input){
        int length = input.length;
        //区间
        int gap = 1;
        while(gap < length){
            //区间一般为1/2到1/3之间
            gap = gap*3 + 1;
        }
        //跨区间排序
        while(gap > 0){
            for (int i = gap; i < length; i++) {
                int temp = input[i];
                int j = i - gap;
                while (j>=0 && input[j] > temp){
                    input[j+gap] = input[j];
                    j -= gap;
                }
                input[j+gap] = temp;
            }
            gap = gap / 3;
        }
    }

    /**
     * 实现归并排序
     * 时间复杂度    时间复杂度（最坏）   时间复杂度（最好）   空间复杂度   稳定性
     * O(NlogN)       O(NlogN)             O(NlogN)          o(N)        稳定
     *  升序
     * @param input
     */
    public static void mergeSort(int[] input){

    }

}

