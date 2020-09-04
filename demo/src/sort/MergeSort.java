package sort;

public class MergeSort {

    public void mergeSort(int [] array){
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
        int q = (p+r)/2;
        sort(array, p, q);
        sort(array, q+1, r);
        merge(array, p,q,r);
    }

    public void merge(int [] array, int p, int q,int r){
        int i = p;
        int j = q+1;
        int k = 0;
        int [] tmp = new int[r-p+1];
        while (i<=q && j<=r){
            if (array[i] <= array[j]){
                tmp[k++] = array[i++];
            }else{
                tmp[k++] = array[j++];
            }
        }
        while(i<=q){
            tmp[k++] = array[i++];
        }
        while(j<=r){
            tmp[k++] = array[j++];
        }
        for (int a=0; a<tmp.length;a++){
            array[p++] = tmp[a];
        }
    }

    public static void main(String [] args){
        int [] array = {4,3,7,5,9,1,10,45,31,22};
        MergeSort ms = new MergeSort();
        ms.mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
}
