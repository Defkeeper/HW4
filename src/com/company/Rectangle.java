package com.company;

public class Rectangle {
    double x;
    double y;
    private static int createdRectangles;
    private static final String Russian_Class_Name = "Прямоугольник";
    private static final String English_Class_Name = "Rectangle";

    public Rectangle(double a, double b) {
        x = a;
        y = b;
        createdRectangles++;
    }

    public Rectangle(double i) {
        this.x = i;
        this.y = i;
        this.createdRectangles++;
    }

    double calculateArea() {
        double area = x * y;
        return area;
    }

    double printArea() {
        double print = calculateArea();
        return print;
    }

    String printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат!");
        } else if (x != y) {
            System.out.println("Это прямоугольник!");
        }
        return toString();
    }

    public boolean IsTheSameRectangle(Rectangle rectangle) {
        boolean result = x == rectangle.x && y == rectangle.y;
        System.out.println(result);
        return result;
    }

    public static void printRectanglesCount() {
        System.out.println("Создано прямоугольников: " + createdRectangles);
    }

    public static void printClassName(boolean printlnRussian) {
        if (printlnRussian) {
            System.out.println("Название класса:" + Russian_Class_Name);
        } else {
            System.out.println("Class name is: " + English_Class_Name);
        }
    }
}

