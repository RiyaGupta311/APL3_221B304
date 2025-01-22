class One {
    One(int x) {
        System.out.println("Constructor of One called with value: " + x);
    }
}

class Two extends One {
    Two() {
        super(10);  
        System.out.println("Constructor of Two called");
    }
}

public class Application {
    public static void main(String[] args) {
        Two t = new Two();
    }
}
