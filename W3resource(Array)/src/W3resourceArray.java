
public class W3resourceArray {

    public static void main(String[] args) {

        //exercise2();
        exercise3();

    }

    public static void exercise2() {

        int prices[] = {7, 9, 10, 13, 14, 15, 17, 18, 20};
        int sum = 0;

        for (int i : prices) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

    }

    public static void exercise3() {

        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.printf("%2d ", a[i][j]);

            }
            System.out.println();
        }
    }
}
