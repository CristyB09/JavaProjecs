
import java.util.ArrayList;

public class Week7Arrays2 {

    static ArrayList<Integer> grades = new ArrayList<>();
    
    //We use wrapper class for colection without primitive data types;

    public static void main(String[] args) {
         grades.add(75);
         grades.add(50);
         grades.add(1, 100);
         for(int i=0; i<grades.size(); i++)
         {
         
             System.out.println(grades.get(i));
         
         }
        System.out.println(grades.contains(71));
        System.out.println(grades.contains(50));
        grades.remove(50);
        grades.remove(0);
    }
    

}
