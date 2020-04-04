
import java.util.Scanner;

public class Week4 {

    static Scanner user = new Scanner(System.in);

    public static void main(String args[]) {
        //numberSize();
        getMonth();
        //getMonth2();
    }//main

    public static void numberSize() {
        System.out.println("Please enter a number");
        int x = user.nextInt();
        if (x > 50) {
            System.out.println(x + "is a big number");

        } else if (x < 50) {
            System.out.println(x + "is a small number");

        } else if (x == 50) {
            System.out.println(x + "is the middle number");
        }

    }

    //----------Task 1----------------------------//
    //----------Task 2 ---------------------------//
    public static void getMonth() {
        System.out.println("Please enter a month number");
        byte month = user.nextByte();
        if (month == 1) {
            System.out.println("Month " + month + " is January");
        } else if (month == 2) {
            System.out.println("Month " + month + " is February");
        } else if (month == 3) {
            System.out.println("Month " + month + " is March");
        } else if (month == 4) {
            System.out.println("Month " + month + " is April");
        } else if (month == 5) {
            System.out.println("Mont " + month + " is May");
        } else if (month == 6) {
            System.out.println("Month " + month + " is June");
        } else if (month == 7) {
            System.out.println("Month " + month + " is July");
        } else if (month == 8) {
            System.out.println("Month " + month + " is August");
        } else if (month == 9) {
            System.out.println("Month " + month + " is September");
        } else if (month == 10) {
            System.out.println("Month " + month + " is October");
        } else if (month == 11) {
            System.out.println("Month " + month + " is November");
        } else if (month == 12) {
            System.out.println("Month " + month + " is December");
        }
    }
    //---------------------Task 3 -----------------------------//

    public static void getMonth2() {
        System.out.println("Please enter a month number");
        byte month = user.nextByte();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorect number of the month");
        }
    }

}//class
