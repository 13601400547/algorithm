package queue;

import linkList.DoubleTrackNode;

public class CycleLinkQueue<T> {

    private int count;

    private DoubleTrackNode<T> front;

    private DoubleTrackNode<T> rear;

    public CycleLinkQueue(){
        this.count = 0;
        front = rear = new DoubleTrackNode(null);
    }

    public void inQueue(T obj){
        DoubleTrackNode<T> newNode = new DoubleTrackNode(obj);
        if (front == rear){
            front = newNode;
            rear.setPrev(newNode);
        }else{
            DoubleTrackNode<T> prevNode = rear.getPrev();
            prevNode.setNext(newNode);
            newNode.setPrev(prevNode);
            rear.setPrev(newNode);
        }
        count++;
    }

    public T outQueue(){
        if (front == rear){
            System.out.println("队列为空");
            return null;
        }
        DoubleTrackNode<T> currNode = front;
        front = front.getNext();
        count--;
        return currNode.getObj();
    }

}
