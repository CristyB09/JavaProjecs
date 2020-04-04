import java.util.Scanner;
public class JavaApplication24 {

    
    public static void main(String[] args) {
       oddEven();
    }
    
    public static void oddEven(){
    
        System.out.println("Please Enter a number");
        
        Scanner object = new Scanner(System.in);
        double number = object.nextDouble(); 
        if (number % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        
        
        }
        }
        
    
    
    
}
