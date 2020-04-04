import java.util.Scanner;


public class Week6 {
 static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {
          Table();
    }
    public static void Table(){
      int multiplier;
      int start;
      int end;

        System.out.println("Please enter the multiplier");
        multiplier = user.nextInt();
        System.out.println("Please enter the starting number");
        start = user.nextInt();
        System.out.println("Please enter the ending number");
        end = user.nextInt();
       
        for(int i=start; i<=end; i++){
        System.out.println(multiplier+" * "+i+" = "+multiplier*i);
        }
    }
    
}
