package org.launchcode.java.studios;
import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle? ");
        Double radius = input.nextDouble();
        Double pi = 3.14;
        Double area = Circle.getArea(radius);
        System.out.println("The area of your circle is: " +area);

    }
}
