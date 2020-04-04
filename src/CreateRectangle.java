public class CreateRectangle {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);

        // Create a Rectangle with width 3.5 and height 35.9
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);


        System.out.println("Rectangle 1");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());


        System.out.println("Rectangle 2");
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        System.out.println();
        System.out.println("The total number of rectangles created is "+Rectangle.getCount());
    }
}
