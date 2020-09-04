package stack;

import linkList.DoubleTrackNode;

public class Test {

    public ArrayStack<String> arrayStack = new ArrayStack<String>();

    public LinkStack<String> linkStack = new LinkStack<String>();

    public static void  main(String [] args){
        GoBack goback = new GoBack();
        goback.insert("A");
        goback.insert("B");
        goback.insert("C");
        goback.insert("D");
        goback.back();
        goback.insert("E");
        goback.back();

    }

    public void testInArrayStack(String s){
        arrayStack.inStack(s);
    }

    public void testOutArrayStack(){
        arrayStack.outStack();
    }

    public void testInLinkStack(String s){
        linkStack.inStack(s);
    }

    public void testOutLinkStack(){
        linkStack.outStack();
    }

    public void iterator(ArrayStack<String> arrayStack){
        for(int i=arrayStack.getCount()-1;i>=0;i--){
            System.out.print(arrayStack.getStack()[i]);
            if (i>0){
                System.out.print(",");
            }else{
                System.out.println();
            }
        }

    }

    public void iterator(LinkStack<String> arrayStack){
        DoubleTrackNode currentNode = arrayStack.getFirst();
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
