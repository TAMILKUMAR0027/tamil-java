package TKSCJC;

public class Vehicle {

    void run() {
        System.out.println("Jeeva is running");
    }

    public static void main(String[] args) {

        Vehicle a = new Vehicle();
        a.run();

        Vehicle b = new truck();   
        b.run();
    }
}

class truck extends Vehicle {

    void run() {
        System.out.println("Muhindhar is running");
    }
}