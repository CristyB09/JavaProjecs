
import java.util.Scanner;

public class vatCalculator {

    public static void main(String[] args) {

        vatCalculator();   
        
    }

    public static void vatCalculator() {

        double vatRate = 1.2;

        System.out.println("20% Vat Calculator");
        Scanner input = new Scanner(System.in);

        double amount = input.nextDouble();
        double result = amount / vatRate;

        System.out.println("Amount before Vat is £ " + result);

    }

}
