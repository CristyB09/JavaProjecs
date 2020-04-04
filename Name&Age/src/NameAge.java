
/*------------Home Exercise Using Scanner----------

*/

import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
     
        System.out.print("How old are you?");
        int num = keyboard.nextInt();
        
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+num);
        
    }
    
}
