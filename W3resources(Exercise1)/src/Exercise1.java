
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the day: ");
        String the_service = keyboard.nextLine();

        switch (the_service) {
            case "Monday":
                System.out.println("The price of Haircut is: ");
                break;

            case "Tuesday":
                System.out.println("Tuesday the price of Haircut is: ");
                break;

            case "Wednesday":
                System.out.println("Wednesday");
                break;

            case "Thursday":
                System.out.println("Thursday");
                break;

            case "Friday":
                System.out.println("Friday");
                break;

            case "Saturday":
                System.out.println("Saturday");
                break;

            case "Sunday":
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please write correctly the name of the day");

        }

        /**
         * int[] the_price = { 18, 9, 10, 14, 15, 7, 17 };
         *
         * String[] the_service = { " Oap", "Skin Fade", "Normal Price", "Kids",
         * "Saturday & Sunday", "Beard Trim", "Wash Haircut and Finish "
         *
         * };
         *
         * System.out.println("The price list before is £ " +
         * Arrays.toString(the_price)); Arrays.sort(the_price);
         * System.out.println("Order price list after is £ : " +
         * Arrays.toString(the_price));
         *
         * System.out.println("Original numeric array : " +
         * Arrays.toString(the_service)); Arrays.sort(the_service);
         * System.out.println("Sorted string array: " + Arrays.toString(the_service));
         */
    }

}
