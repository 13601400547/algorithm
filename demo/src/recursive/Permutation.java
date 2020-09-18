package recursive;

import java.util.Arrays;

public class Permutation {

    public void perm(int [] array, int start, int end){
        if (start == end){
            System.out.println(Arrays.toString(array));
        }
        for (int i=start;i<=end;i++){
            if (!judgeSwap(array, start,i)){
                continue;
            }
            swap(array, start, i);
            perm(array, start+1, end);
            swap(array, start, i);
        }
    }

    public void swap(int [] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public boolean judgeSwap(int [] array, int start, int i){
        for (int j=start; j<i;j++){
            if (array[j] == array[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        Permutation perm = new Permutation();
        int [] array = {4,2,2, 4};
        perm.perm(array, 0, 3);
    }

}
