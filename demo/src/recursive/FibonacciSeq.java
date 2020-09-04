package recursive;

public class FibonacciSeq {

    public int sumFibonacciSeq(int n){
        if (n<1){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }
        return sumFibonacciSeq(n-1) + sumFibonacciSeq(n-2);
    }
}
