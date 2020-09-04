package recursive;

import java.util.Arrays;

public class Permutation {

    public void perm(int [] array, int index, int length){
        if (index == length){
            System.out.println(Arrays.toString(array));
        }
        for (int i=index;i<=length;i++){
            if (!judgeSwap(array, index,i)){
                continue;
            }
            swap(array, index, i);
            perm(array, index+1, length);
            swap(array, index, i);
        }
    }

    public void swap(int [] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public boolean judgeSwap(int [] array, int index, int i){
        for (int j=index; j<i;j++){
            if (array[j] == array[i]){
                return false;
            }
        }
        return true;
    }

}
