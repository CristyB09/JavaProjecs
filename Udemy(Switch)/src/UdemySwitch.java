
import java.util.Scanner;

//Switch allowed to take different value from variables, can ve only use for some tipes of variables (int, string)
public class UdemySwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a comand: ");
        String text = input.nextLine();

        switch (text) {
            case "start":// value to check to start
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stopped. ");
                break;

            default:
        System.out.println("Comand not recognized");

    }

}
}