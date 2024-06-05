package Asessment;

 import java.util.*;
public class reverseList {
  
    public static void main(String[] args) {
        
      LinkedList <Integer> list = new LinkedList<>();


        list.add(-3);
        list.add(-1);
        list.add(10);
        list.add(18);
        list.add(5);
        list.add(-7);
        list.add(-6);
        list.add(-12);

        System.out.println("NormalList");
        for (Integer integer : list) {
            System.out.print(integer +" ");
        }
        System.out.println();
        System.out.println("Reversed LinkedList");
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer +" ");
        }
    }
}

