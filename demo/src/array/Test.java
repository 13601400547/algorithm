package array;

public class Test {

    public static void  main(String [] args){

    }

    public void testAutoCapacityArray(){
        AutoCapacityArray<String> arrayList = new AutoCapacityArray();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");
        arrayList.add("h");
        arrayList.add("i");
        arrayList.add("j");
        arrayList.add("k");
        arrayList.remove(5);
        for(int i=0; i<arrayList.getCount();i++){
            System.out.print(arrayList.get(i));
            if (i<arrayList.getCount()-1){
                System.out.print(",");
            }else{
                System.out.println();
            }
        }
        System.out.println(arrayList.getSize());
    }

    public void mergeTwoSortArray(int [] a, int [] b){
        if (a != null && b != null){

        }
    }

}
