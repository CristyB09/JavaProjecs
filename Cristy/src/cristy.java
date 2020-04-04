
class Iubita {

    public void declaratie(String declaratie) {
        System.out.println(declaratie);
    }

    public void dincer(long value) {
        System.out.println("Te iubesc din August " + value);
    }
    public void altametoda(String altametoda){
        System.out.println(altametoda);
    }
   

}

public class cristy {

    public static void main(String[] args) {

        Iubita frumoasa = new Iubita();
        
        frumoasa.declaratie("Vreau sa iti spun ca ");
        frumoasa.declaratie ("Te iubesc din totdeauna !");
        frumoasa.dincer(2012);
        long value = 2012;
        frumoasa.declaratie("Aici scriu ce vreau ");
        frumoasa.dincer(2019);
        frumoasa.altametoda("Ce nu ma crezi? ");
    }

}
