
class Student {

    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Pot sa sar " + height + " metri inaltime!");
        System.out.println("O am de " + 20 + " de cm.");
    }

    public void move(String direction, double distante) {
        System.out.println("Alerg " + distante + "metri pe minut " + direction);
    }

}

public class udemyParameters {

    public static void main(String[] args) {
        Student cristy = new Student();

        cristy.speak("Buna! Sunt Cristian.");
        cristy.jump(7);
        cristy.move("tot inainte. ", 99.9);
        String greeting = "Ce nu crezi!!! ";
        cristy.speak(greeting);
        int value = 14;
        cristy.jump(value);
    }

}
