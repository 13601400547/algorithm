package search;

public class SearchTheK {

    public int searchTheK(int [] array, int index){
        int n = array.length;
        if (n<=1){
            return -1;
        }
        int q = partition(array, 0, n-1);
        while(q+1 != index){
            if (index > q+1){
                q = partition(array, q+1, n-1);
            }else{
                q = partition(array, 0, q);
            }
        }
        return array[q];
    }


    public int partition(int [] array, int p, int r){
        int pivot = array[r];
        int i = p;
        for (int j=p;j<r;j++){
            if(array[j]>pivot){
                swap(array, i, j);
                i++;
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
        SearchTheK sk = new SearchTheK();
        System.out.print(sk.searchTheK(array, 6));

    }


}
