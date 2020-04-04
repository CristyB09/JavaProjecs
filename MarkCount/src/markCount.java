
import java.util.Scanner;


public class markCount {


    public static void main(String[] args) {
      
    }
    
    
    public static void markCount(){
    
        System.out.println("Please enter 4 marks from 1 to 100");
        Scanner input = new Scanner(System.in);
        
        int mark1 = input.nextByte();
        int mark2 = input.nextByte();
        int mark3 = input.nextByte();
        int mark4 = input.nextByte();
        
        
        int result = (mark1 + mark2 + mark3 + mark4 / 4);
        System.out.println("The average of your 4 marks is:" + result);
        if (result >= 70){
        
            System.out.println("First");
        }
        else if (rewsult > 60)
            System.out.println("2:1");
        else if (result )
        
    
    
    
    }
    
    
    
    
}
