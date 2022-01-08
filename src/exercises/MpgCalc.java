package exercises;
import java.util.Scanner;

public class MpgCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you traveled?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gasoline did your ride consume?");
        double gallonsConsumed = input.nextDouble();

        double mpg = milesDriven/gallonsConsumed;
        System.out.println("Looks like your vehicle is getting " + mpg + " miles per gallon.");
    }
}
