package com.intermediate.oop.abstraction;

abstract class Shape {
    abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

public class AbstractExample {
    public static void main(String args[]) {
        Shape s = new Circle();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}
