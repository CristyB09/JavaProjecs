
import java.util.Scanner;//click the icon for Scanner input

public class UdemyGettingUserInput {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);//input is variable and new Scanner is object

        // Output the prompt
        System.out.println("Enter an integer: ");//Promt said to do something

        // Wait for the user to enter a line of text
        //String line = input.nextLine();
        //double value = input.nextDouble();
        int value = input.nextInt();

        // Tell them what they entered.
        System.out.println("You entered: " + value);

    }

}
