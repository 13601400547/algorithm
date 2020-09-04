package queue;

import linkList.DoubleTrackNode;

public class LinkQueue<T> {

    private int count;

    private DoubleTrackNode first;

    private DoubleTrackNode last;

    public LinkQueue(){
        this.count=0;
    }

    public void inQueue(T t){
        DoubleTrackNode f = first;
        DoubleTrackNode newNode = new DoubleTrackNode(null, f, t);
        first = newNode;
        if(f==null){
            last = newNode;
        }else{
            f.setPrev(newNode);
        }
        count++;
    }

    public void outQueue(){
        if(last != null){
            DoubleTrackNode prev = first.getPrev();
            last = prev;
            if(prev==null){
                first=null;
            }else{
                prev.setNext(null);
            }
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DoubleTrackNode getFirst() {
        return first;
    }

    public void setFirst(DoubleTrackNode first) {
        this.first = first;
    }

    public DoubleTrackNode getLast() {
        return last;
    }

    public void setLast(DoubleTrackNode last) {
        this.last = last;
    }
}
