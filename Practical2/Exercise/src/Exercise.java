
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {
        System.out.println("Please enter a number");
        Scanner object = new Scanner(System.in);
        double number = object.nextDouble();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }//method

    }//main method

}//class
