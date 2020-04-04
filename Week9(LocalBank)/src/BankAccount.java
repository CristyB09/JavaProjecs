
import java.util.Scanner;


public class BankAccount {
    public static void main(String[] args) {
        
    }
   public BankAccount(){
       
       Scanner keyboard = new Scanner(System.in);
       String custName;
       int custAccNum;
       double startGift = 0.99;
       BankAccount tomsSavings = new BankAccount(startGift);
       
         System.out.println("Enter customer's name: ");
         custName = keyboard.nextLine();
         System.out.println("Enter new account number: ");
         custAccNum = keyboard.nextInt();
         
         
         tomsSavings.setName(custName);
         tomsSavings.setAccNum(custAccNum);
        
         System.out.println("Welcome, with the gift of £" + startGift);
         System.out.println(", your balance is £" + tomsSavings.getBalance());
         
    }

    private BankAccount(double startGift) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setName(String custName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAccNum(int custAccNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    
    

