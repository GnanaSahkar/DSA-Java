package Asessment;

import java.util.LinkedList;

public class swapCount {
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

        /*System.out.println("List");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }*/
        
        list = bubbleSort(list);
        System.out.println("After bubbleSort");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static LinkedList<Integer> bubbleSort(LinkedList<Integer> list) {
        int n = list.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j ));
                    list.set(j , temp);
                    count++;
                }
            }
        }
        System.out.println("Number of Swaps is :" + count);
        return list;
    }
}