public class Rectangle {

    private double width;
    private double height;

    private static int count = 0;


       public  Rectangle() {
            count++;
        }

        public Rectangle(double newWidth, double newHeight) {
            width = newWidth;
            height = newHeight;
            count++;
        }


       public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public static int getCount(){

           return count;
        }
    }

