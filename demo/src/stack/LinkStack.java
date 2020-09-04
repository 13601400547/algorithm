package stack;

import linkList.DoubleTrackNode;

public class LinkStack<T> {

    private int count;

    private DoubleTrackNode first;

    private DoubleTrackNode last;

    public LinkStack(){
        this.count=0;
    }

    public void inStack(T t){
        /*DoubleTrackNode l = last;
        DoubleTrackNode newNode = new DoubleTrackNode(l, null, t);
        last = newNode;
        if(l==null){
            first = newNode;
        }else{
            l.setNext(newNode);
        }
        count++;*/

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

    public void outStack(){
        if(first != null){
            DoubleTrackNode next = first.getNext();
            first = next;
            if(next==null){
                last=null;
            }else{
                next.setPrev(null);
            }
            count--;
        }
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
