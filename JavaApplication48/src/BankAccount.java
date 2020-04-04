
import java.util.Scanner;

public class BankAccount {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String custName;
        int custAccNum;
        double startGift = 0.99;
        BankAccount tomsSavings = new BankAccount(startgift);

        System.out.print(
        “Enter customer
        
        's name: ”);
    custName = keyboard.nextLine();
        System.out.print(”Enter new account 
        number: ”);
    custAccNum = keyboard.nextInt();

        tomsSavings.setName(custName);
        tomsSavings.setAccNum(custAccNum);

        System.out.print(”Welcome
        , with the gift of £” + startGift
        );
    System.out.println(
        ”, your balance is £
        ” +       
                             tomsSavings.getBalance()
    

);
  }//main
}//LocalBank
