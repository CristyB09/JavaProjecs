
import java.util.Date;


public class Students {
        String fn;//Global scope
        String sn;
        Date DOB;
        String tel;
        String studentID;
        char gender;
        String adress;
        String nationality;
        static float balance;
        String University_name;
        
        public static void main(String[]args){
              // local scope
        
        }//main method
        
        public static void anotherMethd(){
            
        }//another method
        
        public static void payPrinting(){
        balance-=10;
        }
       
        public static void deposit(){
        balance += 10;
        }
}//class
