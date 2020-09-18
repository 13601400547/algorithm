package sort;

import java.util.Arrays;

public class CountingSort {

    public void countingSort(int [] array){
        int n = array.length;
        if (n <= 1){
            return;
        }
        int max = 0;
        for (int i=0;i<n;i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        int [] tmp = new int[max+1];
        for (int i=0; i<tmp.length; i++){
            tmp[i] = 0;
        }
        for (int i=0; i<n; i++){
            tmp[array[i]]++;
        }
        for (int i=1; i<=max; i++){
            tmp[i] = tmp[i-1] + tmp[i];
        }
        int [] r = new int[n];
        for (int i=n-1; i>=0; i--){
            int index = tmp[array[i]]-1;
            r[index] = array[i];
            tmp[array[i]]--;
        }
        for (int i=0; i<r.length;i++){
            array[i] = r[i];
        }
    }

    public static void main(String [] args) {
        int[] array = {4, 3, 3, 2, 5, 1, 4, 0, 2, 3};
        CountingSort cs = new CountingSort();
        cs.countingSort(array);
        System.out.println(Arrays.toString(array));
    }
}
