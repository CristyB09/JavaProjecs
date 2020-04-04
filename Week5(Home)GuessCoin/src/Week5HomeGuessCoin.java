
import java.util.Scanner;

public class Week5HomeGuessCoin {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int guess;
        int coin = (int) (Math.random()*2);
        
        System.out.println("Enter a guess 0-head or 1-tail:");
        guess = keyboard.nextInt();
        
        System.out.println("You guessed "+guess);
        System.out.println("The number was "+coin);
        
        if (guess == coin){
            System.out.println("correct!");
        }//end if
        else{
            System.out.println("Incorrect");
        }//end else
        
        
        
        
    }
    
}
