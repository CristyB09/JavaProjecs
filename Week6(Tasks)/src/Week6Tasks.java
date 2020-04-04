import java.util.Scanner;

public class Week6Tasks {
 static Scanner user = new Scanner(System.in);
  
    public static void main(String[] args) {
       //Task();
       Task2();
       //task3();
    }
    public static void Task(){
        System.out.println("Please insert an ingeger number bigger than 0");
        int number = user.nextInt();
        int multiplier;
        int result;
        
        for(int i=0; i<=20; i++){
            System.out.println(number+" * "+i+" = "+number*i);
        
    }
    
    }
    
    public static void Task2(){
      
       
        System.out.println("Please enter the base number");
        int num1 = user.nextInt();
        
        System.out.println("Please enter the exponent number");
        int power = user.nextInt();
        
        int raised = num1;
        for (int i = 1; i < power; i++) {
            raised*=num1;
            
        }
        System.out.println(raised);
        
        
    }
    
    public static void task3(){
      
        char choice;
        int num1, num2;
        
        System.out.println("(a) - Addition");
        System.out.println("(b) - Subtraction");
        System.out.println("(c) - Quit");
        
        do{
            choice = user.next().charAt(0);
            
            switch (choice) {
                case 'a':
                    System.out.println("Enter the first number");
                    num1 = user.nextInt();
                    
                    System.out.println("Enter the second number");
                    num2 = user.nextInt();
                    
                    System.out.println((num1 + num2));
                    break;
                    
                case 'b':
                    System.out.println("Enter the first number");
                    num1 = user.nextInt();
                    
                    
                    System.out.println("Enter the second number");
                    num2 = user.nextInt();
                    
                    System.out.println((num1 - num2));
                    break;
                  
                default:
                    System.out.println("Read the menu please");
            }
            
        }while (choice != 'c');
    
    }
    

    
}
