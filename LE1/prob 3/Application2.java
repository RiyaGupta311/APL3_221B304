class Mother {
    static void show() {
        System.out.println("Mother's static show() method");
    }
}
class Child extends Mother {
}
public class Application2 {
    public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show(); 
        Child ch = new Child();
        ch.show();  
    }
}
