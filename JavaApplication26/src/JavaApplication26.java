
import java.util.Scanner;

public class JavaApplication26 {

    public static void main(String[] args) {
        exercise();
    }

    public static void exercise() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = keyboard.nextLine();
        
        
        System.out.println("How old are you? ");
        int num = keyboard.nextInt();
        
        System.out.println("Your name is "+name);
        System.out.println("Your age are "+num);

    }

}
