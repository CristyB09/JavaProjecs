
public class ClassRoom {

    static ClassRoom1 room1 = new ClassRoom1("301", (short) 30, true, false);
    static ClassRoom1 room2 = new ClassRoom1("302", (short) 40, false, true);

    
    
    public static void main(String[] args) {

        System.out.println("Room#: " + room2.getRoomNum());
        System.out.println("Capacity: " + room1.getCapacity());
        System.out.println("Availability: " + room1.isAvailability());
        System.out.println("Computers±: " + room1.HasComputers());

    }

}
