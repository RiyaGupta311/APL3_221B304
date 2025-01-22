class Mother {
    int x = 10; 
    void show() {
        System.out.println("This is the show() method of the Mother class. x = " + x);
    }
}
class Child extends Mother {
}

public class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();
    }
}
