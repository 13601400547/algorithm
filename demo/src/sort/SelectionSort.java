package sort;

public class SelectionSort {

    public void sort(int [] array){
        int n = array.length;
        if(n<=1){
            return;
        }
        for(int i=0; i<n-1;i++){
            int k = i;
            for (int j=k+1;j<n;j++){
                if (array[k] > array[j]){
                    k = j;
                }
            }
            if (k != i){
                int tmp = array[k];
                array[k] = array[i];
                array[i] = tmp;
            }
        }

    }

    public static void main(String [] args){
        int [] array = {4,3,7,5,9,1,10,45,31,22};
        SelectionSort ss = new SelectionSort();
        ss.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
}
