package com.ga;

public class Circle extends Shape {
    private double width1;
    private double width2;
    private double side3;
    private double side4;

    public Circle(double width1, double width2, double side3, double side4) {
        this.width1 = width1;
        this.width2 = width2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public double getCircumference() {
        return width1 + width2 + side3 + side4;
    }

    @Override
    public double getArea() {
        double width = width1;
    }

}
