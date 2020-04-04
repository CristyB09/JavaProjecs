
import java.util.Scanner;


public class BankAcc10 {

  
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        BankAcc b1 = new BankAcc(0, "Cristi", "Bonte", "923647475", "40-10-30", "075712388478", 0, true);
        System.out.println(b1.getFname()+" "+b1.getLname()+" "+b1.getSort_code()+" "+b1.getAccnio());
    }
    
}
