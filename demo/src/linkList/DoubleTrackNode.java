package linkList;

public class DoubleTrackNode<T> {

    private DoubleTrackNode prev;

    private DoubleTrackNode next;

    private T obj;

    public DoubleTrackNode(T obj){
        this.obj = obj;
    }

    public DoubleTrackNode(DoubleTrackNode prev, DoubleTrackNode next, T obj){
        this.prev = prev;
        this.next = next;
        this.obj = obj;
    }

    public DoubleTrackNode getNext() {
        return next;
    }

    public void setNext(DoubleTrackNode next) {
        this.next = next;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public DoubleTrackNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleTrackNode prev) {
        this.prev = prev;
    }
}
