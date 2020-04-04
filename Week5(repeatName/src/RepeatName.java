

import java.util.Scanner;
public class RepeatName {
    static Scanner user = new Scanner(System.in);

    
    public static void main(String[] args) {
      //repeatName();
      //numbers();
       //getGrades();
       timeTable();
       //numbers1();
    }
    public static void repeatName()
    {
        System.out.println("Please Enter Your Name");
        String x = user.nextLine();
        for (int i=0; i<5; i++){
            System.out.println(x);}
        }
    
    
    public static void numbers(){
        int i = 5;
        while(i<16){
            System.out.println(i);
            i++;}
    
    }
    
    public static void numbers1()
    {
      for(int i=5;i<=20;i++)
      {
          System.out.println(i);
      }
    
    
    
    }
    
    public static void getGrades(){
        byte m1;
        byte i=0;
        
        do{
        System.out.println("Please enter score for Module");
        m1 = user.nextByte();
        if(m1>70)
                {
            System.out.println("Distinction");
        }else if (m1>60){
            System.out.println("Merit");
        }else if (m1>40){
            System.out.println("Pass");
        }else
            System.out.println("Fail");
        i++;
         
        }while(i<5);
            
        
        
    }
    
    
    public static void timeTable(){
           System.out.println("Pllease enter the multiplier");
           int x = user.nextInt();
           System.out.println("Please enter the startind number");
           int y = user.nextInt();
           System.out.println("Please enter the ending number");
           int z = user.nextInt();
        
      for(int i=y; i<=z; i++){
           int product = x * i;
           System.out.println(product);
           
   }
       
    }//method
    
    public static void charCountin(){
        System.out.println("");
    }
    
    
    
}//class
    

