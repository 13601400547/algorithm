package linkList;

public class SingleTrackCycleLink<T> {

    private SingleTrackNode<T> first;

    private SingleTrackNode<T> last;

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
        SingleTrackNode l = last;
        SingleTrackNode newNode = new SingleTrackNode(t);
        newNode.setNext(first);
        last = newNode;
        if (l == null){
            first = newNode;
        }else{
            l.setNext(newNode);
        }
        size++;
    }

    public String iterator(){
        StringBuilder s = new StringBuilder();
        SingleTrackNode currentNode = first;
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
