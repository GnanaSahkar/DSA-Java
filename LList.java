import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        //initialise
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(-1);
        list.add(9);

        /*System.out.println(list.toString());

        // print
        for (int i : list) {
            System.out.println(i);
        }

        

        int count = 0;
        while (count < list.size()) {
            System.out.println(list.get(count));
            count++;
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        // list.forEach(element -> System.out.println(element));
        //list.forEach(System.out::println);
        //list.stream().filter(e -> e%2 ==0).forEach(System.out::println);
        // Java 8 features

    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
       }

       
       
    }
}