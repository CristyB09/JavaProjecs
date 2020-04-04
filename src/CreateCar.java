import java.util.Scanner;

public class CreateCar {

    public static void main (String [] args){

      /*  Car c1 = new Car("Ford", 2008 , "BVD 123", 20000);

        c1.printCarInfo();

        System.out.println("The price of the car object is "+c1.getPrice()); //part b

        */

        Car [] cars = new Car[2]; //part c starts here

         String make, regNo;
         int price, yearOfManufacture;

         Scanner keyboard = new Scanner(System.in);

        for(int counter = 0; counter < cars.length; counter++){

            System.out.print("Enter the make for Car "+(counter+1)+ ": ");
            make = keyboard.nextLine();

            System.out.print("Enter the year of manufacture for Car "+(counter+1)+ ": ");
            yearOfManufacture = keyboard.nextInt();
            keyboard.nextLine(); //gets the return key

            System.out.print("Enter the registration number for Car: "+(counter+1)+": ");
            regNo = keyboard.nextLine();

            System.out.print("Enter the price for Car "+(counter+1)+": ");
            price = keyboard.nextInt();
            keyboard.nextLine(); //gets the return key
            cars[counter] = new Car(make, yearOfManufacture, regNo, price);//line of code you had to write for part (c)

            System.out.println();
        }

        //part d
        for (int counter = 0; counter < cars.length; counter++){

            System.out.println("Details for Car "+(counter+1)+": ");
            cars[counter].printCarInfo();
        }



    }
}
