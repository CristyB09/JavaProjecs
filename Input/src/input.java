
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        //Input your name, age and gender.
        //Print it in the following format.
        // My name is Cristian , I am X years old and I am male/female.]
        nameAge();
    }

    public static void nameAge() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("How old are you? ");
        int num = keyboard.nextInt();

        System.out.println("My name is " + name);
        System.out.println("I am " + num + " years old ");

    }

}
