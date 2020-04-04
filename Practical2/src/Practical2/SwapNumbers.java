
package Practical2;


import static Practical2.Box.Box;
import java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {
     
       int num1, num2;
       num1 = 50;
       num2 = 32;
       int temp;
       
       Scanner input = new Scanner (System.in);
       System.out.println("The value of num1 is:"+num1);
       System.out.println("The value of num2 is:"+num2);
       System.out.println("\n\n");
       
       temp = num1;
       num1 = num2;
       num2 = temp;
       
    //Prin out new value to screen
    System.out.println("The new value of num1 is"+num1);
    System.out.println("The new value of num2 is"+num2);
   
    Box();
       
    
    }//main

}//class
