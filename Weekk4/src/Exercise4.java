
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        //switchExample();
        switchStringExample();

    }//main

    public static void switchExample() {//method
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int choice = input.nextInt();
        input.nextLine();//Clear the \n
        switch (choice) {
            case 1:
                
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;
            //default:
             
                //System.out.println("Please enter a valid option");
        }
        if (choice > 10) {

        }//method

    }//method swich example

    public static void switchStringExample() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = input.nextLine();
        switch (string.toUpperCase()) {// temporary conversion to UpperCase
            case "ONE":
                System.out.println(string.toUpperCase());//Takes both letters (lowe and upper case), to remove spell mistake in case
                break;

            case "TWO":
                System.out.println("string");
                break;

            case "THREE":
                System.out.println("string");
                break;

            default:
                System.out.println("Invalid option");

        }

    }//another method 
}//public class

