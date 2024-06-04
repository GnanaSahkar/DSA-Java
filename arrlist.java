import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();

        arrlist.add(1);
        arrlist.add(5);
        arrlist.add(-5);
        arrlist.add(9);
        for(int i :arrlist){
            System.out.print(i+" ");
        }
    }
}
