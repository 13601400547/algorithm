package queue;

import linkList.DoubleTrackNode;
import stack.ArrayStack;
import stack.LinkStack;

public class Test {

    public ArrayQueue<String> arrayQueue = new ArrayQueue<String>();

    public LinkQueue<String> linkQueue = new LinkQueue<String>();

    public static void  main(String [] args){

    }

    public void testInArrayQueue(String s){
        arrayQueue.inQueue(s);
    }

    public void testOutArrayQueue(){
        arrayQueue.outQueue();
    }

    public void testInLinkQueue(String s){
        linkQueue.inQueue(s);
    }

    public void testOutLinkQueue(){
        linkQueue.outQueue();
    }

    public void iterator(ArrayQueue<String> arrayQueue){
       /* for(int i=arrayQueue.getCount()-1;i>=0;i--){
            System.out.print(arrayQueue.getStack()[i]);
            if (i>0){
                System.out.print(",");
            }else{
                System.out.println();
            }
        }*/
        for(int i=0;i<arrayQueue.getCount();i++){
            System.out.print(arrayQueue.getStack()[i]);
            if (i<arrayQueue.getCount()-1){
                System.out.print(",");
            }else{
                System.out.println();
            }
        }
    }

    public void iterator(LinkQueue<String> linkQueue){
        DoubleTrackNode currentNode = linkQueue.getFirst();
        while(currentNode!=null){
            System.out.print(currentNode.getObj());
            currentNode=currentNode.getNext();
            if(currentNode!=null){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
