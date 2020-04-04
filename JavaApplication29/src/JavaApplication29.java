
public class JavaApplication29 {

    public static void main(String[] args) {
        //exercise();
        exercise1();

    }

    public static void exercise() {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }

    public static void exercise1() {
        int numbers[] = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum off all array elements
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            //calculate average value
            double average = sum / numbers.length;

            System.out.println("Average value of the array elements is : " + average);

        }
    }

}
