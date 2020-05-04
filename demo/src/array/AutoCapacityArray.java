package array;

public class AutoCapacityArray<T> {

    private int count;

    private int size;

    private Object[] array;

    public AutoCapacityArray(){
        this.count = 0;
        this.size = 10;
        this.array = new Object[size];
    }

    public void add(T obj){
        int currSize = this.size;
        
    }
}
