package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 3);
        double rectangle1printArea = rectangle1.printArea();
        String rectangle1RectangleKind = rectangle1.printRectangleKind();

        Rectangle rectangle2 = new Rectangle(5);
        double rectangle2printArea = rectangle2.printArea();
        String rectangle2RectangleKind = rectangle2.printRectangleKind();
        boolean rectangle2Same = rectangle2.IsTheSameRectangle(rectangle1);

        Rectangle rectangle3 = new Rectangle(4, 6);
        double rectangle3printArea = rectangle3.printArea();
        String rectangle3RectangleKind = rectangle3.printRectangleKind();
        boolean rectangle3Same = rectangle3.IsTheSameRectangle(rectangle2);

        Rectangle.printRectanglesCount();
        Rectangle.printClassName( false);
    }
}
