package stack;

public class ArrayStack<T> {

    private int size;

    private int count;

    private  Object[] stack;

    public ArrayStack(){
        this.size = 10;
        this.count = 0;
        this.stack = new Object[size];
    }

    public void inStack(T obj){
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

    public T outStack(){
        if(count>0){
            T obj = (T)stack[count-1];
            stack[count-1] = null;
            count--;
            return obj;
        }
        return null;
    }

    public T getNextOut(){
        if (count == 0){
            return null;
        }
        return (T)stack[count-1];
    }

    public void clear(){
        for (int i=0;i<stack.length;i++){
            stack[i]= null;
        }
        count = 0;
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
