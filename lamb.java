interface in {
    void walk();
    
}

class inner implements in {
    @Override
    public void walk() {
        System.out.println("walking");
    }
    

}

public class lamb {
    public static void main(String[] args) {
        in obj = () -> {
            System.out.println("Walking");
        };

        obj.walk();
    }
}