package com.example.project;

public class TriangleTester {

    public static void main(String[] args) {
        Triangle blankTriangle = new Triangle();
        Triangle myTriangle = new Triangle(1, 3, 4, 5, 6, 8);

        System.out.println("Degenerate triangle perimeter (should be 0): " + blankTriangle.perimeter());
        System.out.println("Degenerate triangle area (should be 0): " + blankTriangle.area());

        System.out.println("\nTest triangle points: (1,3), (4,5), (6,8)");
        System.out.println("Test triangle perimeter (should be ~14.2): " + myTriangle.perimeter());
        System.out.println("Test triangle area (should be ~2.5): " + myTriangle.area());

        System.out.println("\nTranslation test: the triangle will be translated 2 in the X direction and 4 in the Y direction.");
        System.out.println("Triangle values before translation: "+myTriangle.getTriangleValues());
        myTriangle.translateX(2);
        myTriangle.translateY(4);
        System.out.println("Triangle values after translation: "+myTriangle.getTriangleValues());
        System.out.println("The perimeter (" + myTriangle.perimeter() + ") and area (" + myTriangle.area() + ") should still be the same.");

    }
}
