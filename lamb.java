interface in {
    void walk();
    void talk();
}

class inner implements in {
    @Override
    public void walk() {
        System.out.println("walking");
    }

    @Override
    public void talk() {
        System.out.println("talking");
    }
}

public class lamb {
    public static void main(String[] args) {
        in obj = new inner();
        obj.walk();
    }
}