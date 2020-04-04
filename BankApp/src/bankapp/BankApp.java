
package bankapp;

import java.util.Scanner;


public class BankApp {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BankAccount ba = new BankAccount(0, "Cristi", "Bonte", "40-10-00", "000000000", "07571234782365", 0, true, 0);
        BankAccount ba1 = new BankAccount(0, "Cristi", "Bonte", "40-10-00", "000000000", "07571234782365", 0, true, 0);
        BankAccount b1=new BankAccount(0, "", "", "", "", "", 0, true, 0);
        System.out.println(ba);
        
        ba.setMoney(100000);
        
        System.out.println(ba);
        System.out.println(ba1);
        
        System.out.println("ID:");
        int id=input.nextInt();
        b1.setId(id);
        System.out.println("First Name:");
        String fname=input.nextLine();
        b1.setFname(fname);
        System.out.println("Last Name:");
        String lname=input.nextLine();
        b1.setLname(lname);
        System.out.println("SCode");
        String scode=input.nextLine();
        b1.setSort_code(scode);
        System.out.println("Acc no");
        String accno=input.nextLine();
        b1.setAcc_no(accno);
        System.out.println("Tel");
        String tel=input.nextLine();
        b1.setTel(tel);
        
        
        
        
 
    }
    
}
