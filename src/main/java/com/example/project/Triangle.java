package com.example.project;
import java.lang.Math;
/*
Joey Michelini
AP Computer Science A
10/19/2020
This class is intended to simulate a triangle, with specific side lengths and the ability
to calculate area and perimeter.
*/
public class Triangle {
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Triangle() {
        x0 = 0.0;
        y0 = 0.0;
        x1 = 0.0;
        y1 = 0.0;
        x2 = 0.0;
        y1 = 0.0;
    }
    public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double perimeter() {
        double ab = Math.sqrt((Math.pow((x1 - x0), 2)) + (Math.pow((y1 - y0), 2)));
        double bc = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        double ca = Math.sqrt((Math.pow((x0 - x2), 2)) + (Math.pow((y0 - y2), 2)));
        double perimeter = ab + bc + ca;
        return perimeter;
    }

    public double area() {
        double ab = Math.sqrt((Math.pow((x1 - x0), 2)) + (Math.pow((y1 - y0), 2)));
        double bc = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        double ca = Math.sqrt((Math.pow((x0 - x2), 2)) + (Math.pow((y0 - y2), 2)));
        double sp = (ab + bc + ca) / 2; //semiperimeter
        double area = Math.sqrt((sp) * (sp-ab) * (sp-bc) * (sp-ca)); //some heron's formula up in here
        return area;
    }

    public void translateX(double translation) {
        x0 += translation;
        x1 += translation;
        x2 += translation;
    }

    public void translateY(double translation) {
        y0 += translation;
        y1 += translation;
        y2 += translation;
    }

    public String getTriangleValues() { //used for testing with the test class
        return (x0+", "+x1+", "+x2+", "+y0+", "+y1+", "+y2);
    }

    // DO NOT DELETE THESE!
    public double getx0() { return x0; }
    public double gety0() { return y0; }
    public double getx1() { return x1; }
    public double gety1() { return y1; }
    public double getx2() { return x2; }
    public double gety2() { return y2; }
}
