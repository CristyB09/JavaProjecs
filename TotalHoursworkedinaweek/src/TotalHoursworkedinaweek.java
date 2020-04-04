
import java.util.Scanner;

public class TotalHoursworkedinaweek {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double HourlyRate = 9.78;
        double totalHours, grossPay;
      

        System.out.println("Enter number of hours worked: ");
        totalHours = keyboard.nextInt();

        grossPay = totalHours * HourlyRate;

        System.out.println("Your total gross pay for the week is £" + String.format("%.2f", grossPay));

    }

}
