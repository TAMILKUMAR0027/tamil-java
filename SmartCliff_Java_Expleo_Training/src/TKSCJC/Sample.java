package TKSCJC;

public class Sample {

    public final void display() {
        System.out.println("Hi and hello");
    }

    public static void main(String[] args) {

        base b = new base();
        b.display();   // inherited method
    }
}

class base extends Sample {
    void display() {
    	System.out.println("bye bye");
    }
}