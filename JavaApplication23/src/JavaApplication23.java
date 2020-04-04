
import java.util.Scanner;

public class JavaApplication23 {

    public static void main(String[] args) {

        oddandeven();
    }

    public static void oddandeven() {
        System.out.println("Please enter a number");

        Scanner object = new Scanner(System.in);

        double number = object.nextDouble();
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }//Method

    }//main

}//class
