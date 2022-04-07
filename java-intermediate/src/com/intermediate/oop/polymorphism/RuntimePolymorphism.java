package com.intermediate.oop.polymorphism;

// Upcasting
class AUpcasting {
}

class BUpcasting extends AUpcasting {
}

class BikeUpcasting {
    void run() {
        System.out.println("running");
    }
}

class SplendorUpcasting extends BikeUpcasting {
    void run() {
        System.out.println("running safely with 60km");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        AUpcasting a = new BUpcasting(); //upcasting

        BikeUpcasting b = new SplendorUpcasting();//upcasting
        b.run();
    }
}
