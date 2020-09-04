package sort;

public class BubbleSort {

    public void sort(int [] array){
        int n = array.length;
        if (n <= 1){
            return;
        }
        for (int i=0; i<n; i++){
            boolean flag = false;
            for (int j=i; j<n-i+1; j++){
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
