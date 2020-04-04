
public class booleanif {

    public static void main(String[] args) {

        exercise2();

        int myInt = 15;

        if (myInt < 10) {
            System.out.println("Yes, it's true!");
        } else if (myInt > 20) {
            System.out.println("No, it's false!");
        } else {
            System.out.println("None of the above.");
        }
    }

    public static void exercise2() {

        int loop = 0;

        while (true) {
            System.out.println("Looping: " + loop);

            if (loop == 5) {
                break;
            }

            loop++;//++ (increment integer + 1)

            System.out.println("Running");

        }

    }

}
