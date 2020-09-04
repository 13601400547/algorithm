package queue;

public class CycleArrayQueue<T> {

    private int count;

    private int size;

    private int front;

    private int rear;

    private Object[] array;

    public CycleArrayQueue(int size){
        this.count = 0;
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.array = new Object[size];
    }

    public void inQueue(T t){
        if((rear+1)%size == front){
            System.out.println("队列已满");
            return;
        }
        array[rear] = t;
        count++;
        rear = (rear+1)%size;
    }

    public T outQueue(T t){
        if(front == rear){
            System.out.println("队列为空");
            return null;
        }
        T obj = (T)array[front];
        array[front] = null;
        front = (front+1)%size;
        return obj;
    }



}
