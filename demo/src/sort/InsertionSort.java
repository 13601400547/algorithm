package sort;

public class InsertionSort {

    public void sort(int [] array){
        int n = array.length;
        if (n<=1){
            return;
        }
        for (int i=1;i<n;i++){
            int value = array[i];
            int j=i-1;
            for (; j>=0;j--){
                if (array[j] > value){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = value;
        }
    }
}
