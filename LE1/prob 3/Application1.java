class Mother {
    void show() {
        System.out.println("Mother's show() method");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Child's show() method");
    }
}

public class Application1 {
    public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show();  
    }
}
