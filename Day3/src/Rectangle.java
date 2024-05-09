//Write a program that reads the X and Y coordinates of two points and then outputs the area of a
//rectangle where both points are opposite corners. Use the following class to store the data for the
//points:


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublePoint upLeft = new DoublePoint();
        System.out.println("Enter the x ordinate of the top left corner: ");
        upLeft.x = scan.nextDouble();
        System.out.println("Enter the y ordinate of the top left corner: ");
        upLeft.y = scan.nextDouble();
        DoublePoint downRight = new DoublePoint();
        System.out.println("Enter the x ordinate of the bottom right corner: ");
        downRight.x = scan.nextDouble();
        System.out.println("Enter the y ordinate of the bottom right corner: ");
        downRight.y = scan.nextDouble();
        areaOfRectangle(upLeft, downRight);
    }

    static void areaOfRectangle(DoublePoint upLeft, DoublePoint downRight) {

        System.out.println(upLeft.y);
        System.out.println(upLeft.x);
        System.out.println(downRight.y);
        System.out.println(downRight.x);
        double valueOfx = Math.abs(upLeft.x - downRight.x);
        double valueOfy = Math.abs(upLeft.y - downRight.y);
        System.out.println(valueOfx);
        System.out.println(valueOfy);
        double area = valueOfx * valueOfy;
        System.out.println("area of rectangle is " + area + " square units");
    }
}