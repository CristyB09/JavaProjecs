
import java.util.Scanner;

public class JavaApplication25 {

    public static void main(String[] args) {
exercise();
    }

    public static void exercise() {
        System.out.println("Enter a number");
        Scanner object = new Scanner(System.in);
        double number = object.nextDouble();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }

}
