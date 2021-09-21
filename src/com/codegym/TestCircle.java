package com.codegym;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5,"green");
        double area  = circle1.getArea();
        double radius = circle1.getRadius();
        System.out.println("this Circle of Radius is " + radius + " ,and Area is: " + area);

}
}
