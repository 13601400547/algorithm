package recursive;

public class Test {

    public static void main(String [] args){
        Test t1 = new Test();
        t1.testPerm();
    }

    public void testFibo(){
        FibonacciSeq fibo = new FibonacciSeq();
        for (int i=1;i<10;i++){
            System.out.println(fibo.sumFibonacciSeq(i));
        }
    }

    public void testFactorial(){
        Factorial factorial = new Factorial();
        for (int i=1;i<10;i++){
            System.out.println(factorial.caculateFactorial(i));
        }
    }

    public void testPerm(){
        Permutation perm = new Permutation();
        int [] array={1,2,1};
        perm.perm(array, 0, array.length-1);
    }
}
