package Asessment;

import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(-3);
        list.add(-1);
        list.add(10);
        list.add(18);
        list.add(5);
        list.add(-7);
        list.add(-6);
        list.add(-12);
        list.add(-3);
        list.add(-1);
        list.add(10);
        list.add(18);
        list.add(5);
        list.add(-7);
        list.add(-6);
        list.add(-12);

        System.out.println("Before removing Duplicates");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Without Duplicates");
        list = noDuplicates(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static LinkedList<Integer> noDuplicates(LinkedList<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new LinkedList<>(set);
    }
}