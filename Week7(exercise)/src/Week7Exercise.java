
import java.util.ArrayList;
import java.util.Scanner;

public class Week7Exercise {

    public static void main(String[] args) {
        singleChar();
    }

    public static void singleChar() {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> letters = new ArrayList<Character>();
        String word;
        System.out.println("Write a string");
        word = input.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (letters.contains(word.charAt(i))) {

            } else {
                letters.add(word.charAt(i));
            }

        }
        System.out.println(letters);
    }

}
