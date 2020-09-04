package queue;

public class ArrayQueue<T> {
    private int size;

    private int count;

    private  Object[] stack;

    public ArrayQueue(){
        this.size = 10;
        this.count = 0;
        this.stack = new Object[size];
    }

    public void inQueue(T obj){
        if(count==size){
            size = size*2;
            Object[] originalStack = stack;
            stack = new Object[size];
            for (int i=0;i<originalStack.length;i++){
                stack[i]=originalStack[i];
            }
        }
        stack[count]=obj;
        count++;
    }

    public void outQueue(){
        if(count>0){
            for(int i=1;i<count;i++){
                stack[i-1]=stack[i];
            }
            count--;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object[] getStack() {
        return stack;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }
}
