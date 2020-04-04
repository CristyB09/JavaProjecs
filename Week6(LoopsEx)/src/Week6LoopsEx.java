
import java.util.Scanner;

public class Week6LoopsEx {

    public static void main(String[] args) {
        //exercise1();
        
        //exercise2();
        //exercise3();
        exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
    }

    public static void exercise1() {

        final int HOWMANY = 10;
        int count, number, total = 0;

        Scanner keyboard = new Scanner(System.in);
        for (count = 1; count <= HOWMANY; count++) {
            System.out.println("Enter a number - ");
            number = keyboard.nextInt();
            total = total + number;

        }//for

        System.out.println("Total of numbers = " + total);

    }//main

    public static void exercise2() {

        int menuChoice;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("1. Enter Name ");
            System.out.println("2. Enter Adress ");
            System.out.println("3. Exit");
            System.out.println("Please enter your menu selection");

            menuChoice = keyboard.nextInt();
        } while (menuChoice != 1 & menuChoice != 2 & menuChoice != 3);

        System.out.println("Your menu selection was" + menuChoice);

    }

    public static void exercise3() {
        final int SEARCHNUMBER = 5;
        int number = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Looking for number 5");

        do {
            number = (int) (Math.random() * 10);
            //get a random number
            System.out.println("The number is " + number);

        } while (number != SEARCHNUMBER);

        System.out.println("Found search number - " + number);

    }//main

    public static void exercise4() {
        double price, tax;
        char reply;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("*** Product Price Check ***");
            System.out.println("Enter initial price ");
            price = keyboard.nextDouble();
            System.out.println("Enter tax rate: ");
            tax = keyboard.nextDouble();
            price = price * (1 + tax / 100);
            System.out.println("Cost after tax = " + price);
            // now see if user wants another go
            System.out.println();
            System.out.println("Would you like to enter another product(y/n)?: ");
            reply = keyboard.next().charAt(0);
            System.out.println();
        } while (reply == 'y' || reply == 'Y');

    }

    static final int TERMINATOR = -999;

    public static void exercise5() {

        int number;
        int total = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter next number of TERMINATOR -999 ");
        number = keyboard.nextInt();

        while (number != TERMINATOR) {
            total = total + number;
            System.out.println("Enter another number - ");
            number = keyboard.nextInt();

        }//while 
        System.out.println("Ttotal of numbers = " + total);

    }

    public static void exercise6() {

        Scanner keyboard = new Scanner(System.in);
        int number;
        double average;
        int total = 0;   // initialise total
        int count = 0;   //initialise count

        System.out.println("Enter a number - ");
        number = keyboard.nextInt();   // read first number

        while (number != TERMINATOR) // continue condition
        {
            total = total + number;  // update running total
            count = count + 1; // increment count

            System.out.println("Enter another number - ");
            number = keyboard.nextInt();  // read next number
        }//while 

        System.out.println("The total of number is = " + total);
        System.out.println("The number of numbers = " + count);

        average = (double) total / count; // calculate average
        System.out.println("The average of the numbers = " + average);

    }//main
    
    public static void exercise7(){
        
        
        Scanner keyboard = new Scanner(System.in);
        int number;
        double average;
        int total = 0;
        int count = 0;
        
        System.out.println("Enter the money for Monday. ");
        number = keyboard.nextInt();
        
        while (number != TERMINATOR)
        {
            total = total + number;
            count = count + 1;
            
            System.out.println("Enter the money for Tuesday ");
            number = keyboard.nextInt();
            
            System.out.println("Enter the money for Wednesday ");
            number = keyboard.nextInt();
          
        }//while
      System.out.println("The total of money is = " + total);
        System.out.println("The total numbers of days are: " + count);

        average = (double) total / count; // calculate average
        System.out.println("The average of the numbers = " + average);
        
        }
        
    
        
        
    
    
    
    
    
    

}//class
