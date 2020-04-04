
public class ClassRoom1 {
    
    private final String roomNum;
    private short capacity;
    private boolean hasComputers;
    private boolean availability;

    public ClassRoom1(String roomNum, short capacity, boolean hasComputers, boolean availability) {
        this.roomNum = roomNum;
        this.capacity = capacity;
        this.hasComputers = hasComputers;
        this.availability = availability;
    }
    
    public void changeAvailability(boolean newAvailability) {

        availability = newAvailability;

    }

    public void changeHasComputers(boolean newHasComputers) {

        hasComputers = newHasComputers;

    }

    public void changeCapacity(short newCapacity) {

        capacity = newCapacity;
    }

    public String getRoomNum() {

        return roomNum;

    }

    public short getCapacity() {
        return capacity;

    }

    public boolean HasComputers() {

        return hasComputers;

    }

    public boolean isAvailability() {

        return availability;

    }

}
