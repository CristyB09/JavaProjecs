
public class Week7Arrays {

    static Byte[] grades = new Byte[5];//from 0 to 4;
    //If values not assigment, we use wrapper class (Byte) to check for nullability

    public static void main(String[] args) {
        grades[0] = 75;
        grades[1] = 50;
        grades[2] = 55;
        grades[3] = 0;
        grades[4] = 92;        
        for(int i = 0; i < grades.length; i++){
        System.out.println(grades[i]);
        }
        
        
    }

}
