package search;

import sort.CountingSort;

import java.util.Arrays;

/**
 * 查找值等于给定数值的元素
 */
public class BinarySearch1 {

    public int binarySearch(int [] array, int value){
        int n = array.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low+(high-low)>>1;
            if (array[mid] > value){
                high = mid-1;
            }
            if (array[mid] < value){
                low = mid+1;
            }
            if (array[mid] == value){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 14, 15, 16, 18};
        BinarySearch1 bs = new BinarySearch1();
        System.out.println(bs.binarySearch(array, 3));
    }
}
