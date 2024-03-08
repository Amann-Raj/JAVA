class Apple {
    void show() {
        System.out.println("Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println( "Cherry ");
    }
}

public class question43 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        Apple ref;

        ref = apple;
        ref.show(); 

        ref = banana;
        ref.show(); 

        ref = cherry;
        ref.show();
    }
}
