package linkList;


import java.util.LinkedList;

public class Test {

    private SingleTrackLink<String> stl;

    private SingleTrackCycleLink<String> stcl;

    public static void  main(String [] args){
        Test t1 = new Test();
        SingleTrackLink<String> link1 = t1.testSingleTrackLink1();
        SingleTrackLink<String> link2 = t1.testSingleTrackLink2();
        link1.mergeLink(link2);
        System.out.println(link1.getSize());
        link1.getCycleLength();
    }

    public SingleTrackLink<String> testSingleTrackLink1(){
        stl = new SingleTrackLink();
        stl.linkLast("1");
        stl.linkLast("2");
        stl.linkLast("3");
        System.out.println(stl.iterator());
        return stl;
    }

    public SingleTrackLink<String> testSingleTrackLink2(){
        stl = new SingleTrackLink();
        stl.linkLast("4");
        stl.linkLast("5");
        stl.linkLast("6");
        stl.linkLast("7");
        stl.linkLast("8");
        stl.linkLast("9");
        System.out.println(stl.iterator());
        stl.cycleEnd();
        return stl;
    }

    public SingleTrackLink<String> testSingleTrackUnlinkLast(){
        stl.unlinkLast();
        System.out.println(stl.iterator());
        return stl;
    }

    public SingleTrackCycleLink<String> testSingleTrackCycleLink(){
        stcl = new SingleTrackCycleLink();
        stcl.linkLast("1");
        stcl.linkLast("2");
        stcl.linkLast("3");
        stcl.linkLast("4");
        stcl.linkLast("5");
        stcl.linkLast("6");
        System.out.println(stcl.iterator());
        return stcl;
    }


}
