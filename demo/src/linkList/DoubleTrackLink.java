package linkList;

public class DoubleTrackLink<T> {

    private DoubleTrackNode<T> first;

    private DoubleTrackNode<T> last;

    private int size;


    public T getFirst(){
        if (first != null){
            return first.getObj();
        }else{
            throw new RuntimeException("单链表头节点为空");
        }
    }

    public T getLast(){
        if (last != null){
            return last.getObj();
        }else{
            throw new RuntimeException("单链尾节点为空");
        }
    }

    public void linkLast(T t){
        DoubleTrackNode l = last;
        DoubleTrackNode newNode = new DoubleTrackNode(l, null, t);
        last = newNode;
        if (l == null){
            first = newNode;
        }else{
            l.setNext(newNode);
        }
        size++;
    }

    public void unlinkLast(){
        if (first != null){
            if (first.getNext() == null){
                first = null;
                last = null;
            }else{
                DoubleTrackNode currentNode = first;
                DoubleTrackNode curretnNodePrev = null;
                DoubleTrackNode curretnNodeNext = currentNode.getNext();
                while(curretnNodeNext != null){
                    curretnNodePrev = currentNode;
                    currentNode = currentNode.getNext();
                    curretnNodeNext = currentNode.getNext();
                    if (curretnNodeNext == null){
                        curretnNodePrev.setNext(null);
                        last = curretnNodePrev;
                    }
                }
            }
        }
    }

    public String iterator(){
        StringBuilder s = new StringBuilder();
        DoubleTrackNode currentNode = first;
        while(currentNode !=  null){
            if (s.toString().length() != 0){
                s.append(",");
            }
            s.append(currentNode.getObj().toString());
            currentNode = currentNode.getNext();
        }
        if (s.toString().length() == 0){
            s.append("单链表没有任何节点");
        }
        return s.toString();
    }

}
