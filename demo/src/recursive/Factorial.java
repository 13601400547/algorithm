package recursive;

public class Factorial {

    public int caculateFactorial(int n){
        if (n==1){
            return 1;
        }
        return caculateFactorial(n-1) * n;
    }
}
