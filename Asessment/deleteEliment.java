package Asessment;
import java.util.LinkedList;

public class deleteEliment {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();

        list.add(-3);
        list.add(-1);
        list.add(10);
        list.add(18);
        list.add(5);
        list.add(-7);
        list.add(-6);
        
        for (int i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        list.remove(list.size()/2);
        for (int i : list) {
            System.out.print(i+" ");
        }
        
    }
}
