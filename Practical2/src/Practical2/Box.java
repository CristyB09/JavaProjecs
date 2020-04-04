
package Practical2;

import java.util.Scanner;
public class Box{
    public static void Box()
    {     
        int height; 
        int width ;
        int depth;
        
     
        Scanner input = new Scanner(System.in);
        
        System.out.println("What are the dimension of the box?:*");
        
        System.out.println("The height is?:*");
        height = input.nextByte();
        System.out.println("The width is?:*");
        width = input.nextByte();
        System.out.println("The depth is?:*");
        depth = input.nextByte();
        
        int perimeter =2*height+3*width+4*depth;
        int volume = height*width*depth;
       
        //Print out new value to scrren
        
        System.out.println("The box is" + height +"cm high, " + width + "cm wide and " + depth + "cm deep\n");
        System.out.println("The volume of the box is " + volume + "cms cubed\n");
        System.out.println("The perimeter of the box is" + perimeter +"cms");
               
        
      
        
      
    }//main
    
    
    
}//class