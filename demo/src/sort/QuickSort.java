package sort;

public class QuickSort {

    public void quickSort(int [] array){
        int n = array.length;
        if (n<=1){
            return;
        }
        sort(array, 0, n-1);
    }

    public void sort(int [] array, int p, int r){
        if (p >= r){
            return;
        }
        int q = partition(array, p, r);
        sort(array, p, q-1);
        sort(array, q+1, r);
    }

    public int partition(int [] array, int p, int r){
        int pivot = array[r];
        int i = p;
        for (int j=p; j<=r; j++){
            if (array[j] < pivot){
                swap(array, i, j);
                i = i+1;
            }
        }
        swap(array, i, r);
        return i;
    }

    public void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String [] args) {
        int[] array = {4, 3, 7, 5, 9, 1, 10, 45, 31, 22};
        QuickSort qs = new QuickSort();
        qs.quickSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
