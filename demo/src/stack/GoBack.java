package stack;

public class GoBack<String> {

    private ArrayStack<String> goStack;

    private ArrayStack<String> backStack;

    public GoBack(){
        this.goStack = new ArrayStack();
        this.backStack = new ArrayStack();
    }

    public void insert(String str){
        goStack.inStack(str);
        backStack.clear();
        System.out.println("当前页面是：" + str);
    }

    public void go(){
        if (backStack.getCount() == 0){
            System.out.println("没有页面可以前进");
            return;
        }
        String obj = backStack.outStack();
        goStack.inStack(obj);
        System.out.println("当前页面是：" + obj);
    }

    public void back(){
        if (goStack.getCount() == 0){
            System.out.println("没有页面可以后退");
            return;
        }
        String obj = goStack.outStack();
        backStack.inStack(obj);
        String nextout = goStack.getNextOut();
        if (nextout == null){
            System.out.println("没有页面可以后退");
        }else{
            System.out.println("当前页面是：" + nextout);
        }

    }

}
