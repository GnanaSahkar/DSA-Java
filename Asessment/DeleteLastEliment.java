package Asessment;
import java.util.*;
public class DeleteLastEliment{
 public static void main(String[] args) {
    LinkedList <Integer> list = new LinkedList<>();

    list.add(10);
    list.add(20);
    list.add(0);
    list.add(25);
    list.add(30);
    list.add(20);

    list = deleteLastOcuurence(list);
    System.out.println(list);
    
 }
 public static LinkedList<Integer> deleteLastOcuurence(LinkedList<Integer> list) {
    if (list.isEmpty()) {
        return list;
    }

    int lastElement = list.getLast();
    ListIterator<Integer> iterator = list.listIterator(list.size() - 2);

    while (iterator.hasPrevious()) {
        if (iterator.previous() == lastElement) {
            iterator.remove();
            break;
        }
    }

    return list;
}
}