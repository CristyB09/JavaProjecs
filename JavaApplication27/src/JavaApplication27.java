
import java.util.Scanner;

public class JavaApplication27 {

    public static void main(String[] args) {
         exercise();
    }//main

    public static void exercise() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("How old are you? ");
        int age = keyboard.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
    }

}//class
