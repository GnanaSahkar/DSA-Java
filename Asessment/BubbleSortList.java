package Asessment;
import java.util.LinkedList;
public class BubbleSortList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(-3);
        list.add(-1);
        list.add(10);
        list.add(18);
        list.add(5);
        list.add(-7);
        list.add(-6);
        list.add(-12);

        System.out.println("Before Sorting");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
        bubbleSort(list);
        System.out.println("After bubbleSort");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
    public static LinkedList<Integer> bubbleSort(LinkedList<Integer> list){
       int n = list.size();
       int temp =0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(list.get(i)<list.get(j)){
            temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
       }  
    }return list;
}
}
