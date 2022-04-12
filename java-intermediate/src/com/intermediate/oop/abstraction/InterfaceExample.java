package com.intermediate.oop.abstraction;

interface printable {
    void print();
}

public class InterfaceExample implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new InterfaceExample().print();
    }

}
