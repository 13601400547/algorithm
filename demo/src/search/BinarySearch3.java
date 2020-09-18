package search;

/**
 * 查找最后一个值等于给定数值的元素
 */
public class BinarySearch3 {

    public int binarySearch(int [] array, int value){
        int n = array.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + ((high-low)>>1);
            if (array[mid] > value){
                high = mid-1;
            }else if (array[mid] < value){
                low = mid+1;
            }else{
                if (mid == n-1 || array[mid+1] != value){
                    return mid;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int[] array = {1, 3, 5, 5, 5, 11, 14, 15, 16, 18};
        BinarySearch3 bs = new BinarySearch3();
        System.out.println(bs.binarySearch(array, 5));
    }
}
