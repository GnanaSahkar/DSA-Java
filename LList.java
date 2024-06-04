import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(4);

        list.forEach(System.out:: println);
    
    }
}
