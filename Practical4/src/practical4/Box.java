
package practical4;


public class Box {


    public static void main(String[] args) {
    
        int height = 3;
        int width = 4;
        int depth = 5;
        int perimeter = 4*height+4*width+4*depth;
        int volume = height*width*depth;
        
        System.out.println("The box is "+height+ " cm high, "+width+ "cm wide and "+depth+"cm deep ");
        System.out.println("The volume of the box is "+volume+"cms cubed");
        System.out.println("The perimeter of the box is "+perimeter+" cms\n\n\n\n");
        
        height = 3;
        width = 4;
        depth = 5;
        volume = height*width*depth;
        perimeter = 4*height+4*width+4*depth;
        
        System.out.println("The box is"+height+" cm high,"+width+" cm wide,and"+depth+" cm deep");
        System.out.println("The volume of the box is "+volume+"cms cubed");
        System.out.println("The perimeter of the box is "+perimeter+" cms\n\n\n\n");
        
        
        
        
    }//main
    
}//class
