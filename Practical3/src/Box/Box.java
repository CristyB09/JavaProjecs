package Box;

import java.util.Scanner;
public class Box {

    public static void main(String[] args) {
     
     
        Scanner input = new Scanner(System.in);
       
        System.out.println("The height is?:*");
        byte height = input.nextByte();
        System.out.println("The width is?:*");
        byte width = input.nextByte();
        System.out.println("The depth is?:*");
        byte depth = input.nextByte();
        
        int perimeter = 4* (height + width + depth);
        int volume = height * width * depth;
       
        //Print out new value to scrren
        
        System.out.println("The box is " + height + "cm high, " + width + "cm wide and " + depth + "cm deep\n");
        System.out.println("The volume of the box is " + volume + "cms cubed\n");
        System.out.println("The perimeter of the box is" + perimeter + "cms");
               
        
      
        
      
       
    }//main
    
    
}//class