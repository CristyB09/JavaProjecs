

import java.util.Scanner;

public class Javaaplication1 {

 
    public static void main(String[] args) {
        ifExample();
    }//main
    
    public static void ifExample()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        int grade = keyboard.nextInt();
        if(grade >= 70){
            
        System.out.println("Distingtion");    
        }
        else if(grade >=60 && grade < 70){
          System.out.println("2.1");
        }
        else if (grade >=50 && grade < 60) { 
          System.out.println("2.2");
        }
        else if (grade >=40 && grade < 50){
            System.out.println("3.3");
        }
              
        
         
            
        
           
       
    
    
    
    }//method
    
}//class
