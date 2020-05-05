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
            autoCapacity();
        }
        this.array[count] = obj;
        this.count++;
    }

    public void autoCapacity(){
        this.size = this.size * 2;
        Object [] newArray = new Object[this.size];
        for (int i=0; i<count; i++){
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public void remove(int index){
        if (index > this.count-1){
            return;
        }
        if (index != this.count-1){
            for (int i = index; i<this.count-1; i++){
                this.array[i] = this.array[i+1];
            }
        }else{
            this.array[index] = null;
        }
        count--;
    }

    public T get(int i){
        return (T)this.array[i];
    }

    public int getSize(){
        return this.size;
    }

    public int getCount(){
        return this.count;
    }
}
