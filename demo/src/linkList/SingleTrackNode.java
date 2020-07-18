package linkList;

public class SingleTrackNode<T> {

    private SingleTrackNode next;

    private T obj;

    public SingleTrackNode(T obj){
        this.obj = obj;
    }

    public SingleTrackNode(SingleTrackNode next, T obj){
        this.next = next;
        this.obj = obj;
    }

    public SingleTrackNode getNext() {
        return next;
    }

    public void setNext(SingleTrackNode next) {
        this.next = next;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
