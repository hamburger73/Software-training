public class Plane extends Vehicle {

    public Plane(String powerType, int numWheels, int numDoors, String color, double fuelEconomy, int passangerCapacity) {
        super("Plane", powerType, numWheels, numDoors, color, fuelEconomy, passangerCapacity)
        boolean islandinggeardown;
        isLandingGearDown = true;
    }

    public void takeoff() {
        System.out.println("We have liftoff!");
        isLandingGearDown = false;
    }

    public void prepToLand() {
        isLandingGearDown = true;

    }

    public boolean land() {
        if (isLandingGearDown) {
            System.out.println("We have landed!");
            return true;
        } else {
            System.out.println("Put the landing gear down.");
            return false;
        }
    }

    public static void main(String[] args) {
        Plane cessna = new Plane("Pixie Dust", 6, 2, "White", 70, 4);
        cessna.takeoff();
        cessna.land();
        cessna.prepToLand();
        cessna.land();
    }
}
