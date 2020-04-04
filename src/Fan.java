public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String colour;


    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        colour = "blue";
    }


    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }


    public void turnOn() {
        on = true;
    }


    public void turnOff() {
        on = false;
    }


    public void setColour(String newColour) {
        colour = newColour;
    }


    public void setRadius(double newRadius) {
        radius = newRadius;
    }


    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }


    public boolean isOn() {
        return on;
    }


    public double getRadius() {
        return radius;
    }


    public String getColour() {
        return colour;
    }

    /** Returns a string description for the fan */
    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", colour: " + colour +
                    ", radius: " + radius + "\n";
        }
        else{
            return "\nFan colour: " + colour + ", radius: " + radius +
                    "\nfan is off\n";
        }
    }
}
