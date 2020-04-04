
//boolean loops representing value true or false;
public class Loops {

    public static void main(String[] args) {
        //exercise2();
        exercise3();

        int value = 10;
        boolean loop = value < 20;

        System.out.println(loop);
    }

    public static void exercise2() {

        int value = 0;

        while (value < 10) {
            System.out.println("Hello");

        }

    }

    public static void exercise3() {

        int value = 0;

        while (value < 10) {
            System.out.println("Hello" + value);

            value = value + 1;
        }

    }

}
