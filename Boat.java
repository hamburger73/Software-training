public class Boat extends Vehicle {
    public Boat(String powerType, int numDoors, String color, double fuelEconomy,
            int passangerCapacity) {
        super("Boat 🛥️", powerType, 0, numDoors, color, fuelEconomy, passangerCapacity);

    }

    public void drift(double miles) {
        milesTraveled += miles;
    }

    public static void main(String[] args) {
        Boat boatyMcBoatFace = new Boat("Gas", 0, "White", 20, 5);
        boatyMcBoatFace.embark(2);
        boatyMcBoatFace.drift(0.5);
        System.out.println(boatyMcBoatFace.type);
    }

}
