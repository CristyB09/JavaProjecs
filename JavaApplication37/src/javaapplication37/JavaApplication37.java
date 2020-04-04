package javaapplication37;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaApplication37 {

    public static void main(String[] args) {
        exercise1();
    }

    
    public static void exercise1() {
        int[] my_price = {7, 18, 14, 13, 14, 20, 25};
        int Index_position = 2;
        int newValue = 27;
        
        System.out.println("Original Price : " + Arrays.toString(my_price) );
        

        for (int i = my_price.length - 1; i > Index_position; i--) {
            my_price[i] = my_price[i - 1];
            {

            }
            my_price[Index_position] = newValue;
            

        }//end 
        //System.out.println("New Array: " + Arrays.toString(my_price));
        System.out.println("The new array is: ");
        for(int i=0;i<my_price.length;i++)
        {
            System.out.println((i+1)+": "+my_price[i]);
        }

    }//method
}//class
