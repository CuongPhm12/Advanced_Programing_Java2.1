package com.codegym;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){};

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}

