package linkList;

public class SingleTrackLink<T> {

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

    public void setFirst(SingleTrackNode<T> first) {
        this.first = first;
    }

    public void setLast(SingleTrackNode<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void linkLast(T t){
        SingleTrackNode l = last;
        SingleTrackNode newNode = new SingleTrackNode(t);
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
                SingleTrackNode currentNode = first;
                SingleTrackNode curretnNodePrev = null;
                SingleTrackNode curretnNodeNext = currentNode.getNext();
                while(curretnNodeNext != null){
                    curretnNodePrev = currentNode;
                    currentNode = currentNode.getNext();
                    curretnNodeNext = currentNode.getNext();
                    if (curretnNodeNext == null){
                        curretnNodePrev.setNext(null);
                        last = curretnNodePrev;
                        size--;
                    }
                }
            }
        }
    }


    public void cycleEnd(){
        if (first != null && last != null){
            last.setNext(first);
        }
    }

    public void mergeLink(SingleTrackLink<T> argsLink){
        SingleTrackNode<T> argsLinkFirstNode = null;
        if (argsLink != null && argsLink.first != null){
            argsLinkFirstNode = argsLink.first;
        }
        if (first != null && last != null && argsLinkFirstNode != null){
            last.setNext(argsLinkFirstNode);
            size = size + argsLink.size;
        }
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

    /**
     * 检测链表中是否存在环
     * @return
     */
    public SingleTrackNode<T> checkCycleExist(){
        SingleTrackNode<T> faster = first;
        SingleTrackNode<T> lower = first;
        while(faster != null && faster.getNext() != null){
            lower = lower.getNext();
            faster = faster.getNext().getNext();
            if (lower == faster){
                System.out.println("单链表中存在环");
                return faster;
            }
        }
        System.out.println("单链表中没有环");
        return null;
    }

    /**
     * 检测环的开始节点
     * @return
     */
    public SingleTrackNode<T> checkCycleStart(){
        SingleTrackNode<T> intersectionNode = checkCycleExist();
        if (intersectionNode == null){
            return null;
        }
        SingleTrackNode<T> anotherNode = first;
        while (anotherNode != intersectionNode){
            anotherNode = anotherNode.getNext();
            intersectionNode = intersectionNode.getNext();
            if (anotherNode == intersectionNode){
                System.out.println("环入口是" + anotherNode.getObj());
                return anotherNode;
            }
        }
        return null;
    }

    /**
     * 获取环的长度
     * @return
     */
    public SingleTrackNode<T> getCycleLength(){
        SingleTrackNode<T> cycleStartNode = checkCycleStart();
        SingleTrackNode<T> faster = cycleStartNode;
        SingleTrackNode<T> lower = cycleStartNode;
        int length = 0;
        while(faster != null && faster.getNext() != null){
            faster = faster.getNext().getNext();
            lower = lower.getNext();
            length++;
            if (faster == lower){
                System.out.println("环长度是" + String.valueOf(length));
                return faster;
            }
        }
        return null;
    }

    /**
     * 反转链表
     */
    public void reserve(){
        SingleTrackNode<T> currNode = first;
        SingleTrackNode<T> prevNode = null;
        SingleTrackNode<T> nextNode = null;
        while (currNode.getNext() != null){
            nextNode = currNode.getNext();
            currNode.setNext(prevNode);
            prevNode = currNode;
            currNode = nextNode;
        }
    }

    /**
     * 求链表的中间节点
     */
    public SingleTrackNode<T> getMiddleNode(){
        if(checkCycleExist() == null){
            SingleTrackNode<T> faster = first;
            SingleTrackNode<T> lower = first;
            while (faster != null && faster.getNext() != null){
                lower = lower.getNext();
                faster = faster.getNext().getNext();
            }
            return lower;
        }
        return null;
    }

}
