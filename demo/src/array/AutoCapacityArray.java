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
        if(this.count == this.size){

        }

    }

    public void autoCapacity(){
        Object [] newArray = new Object[this.size * 2];
        int count = this.count;
        this.count = 0;
        for (int i=0; i<count; i++){
            newArray[i] = this.array[i];
            count++;
        }
    }
}
