public class Vehicle {
    String type;
    String powerType;
    int numWheels;
    int numDoors;
    String color;
    double fuelRemaining;
    double fuelEconomy;
    int numPassangers;
    int passengerCapacity;

    public Vehicle(String type, String powerType, int numWheels, int numDoors, String color, double fuelEconomy,
            int passangerCapacity) {
        this.type = type;
        this.powerType = powerType;
        this.numWheels = numWheels;
        this.numDoors = numDoors;
        this.color = color;
        this.fuelRemaining = 100.0;
        this.fuelEconomy = fuelEconomy;
        this.numPassangers = 0;
        this.passengerCapacity = passengerCapacity;
    }

    public int embark(int partySize) {
        if (numPassangers + partySize > passangerCapacity) {
            System.out.println("Party size is too big");
        } else {
            numPassangers += partySize;
        }
        return numPassangers;
    }

    public int dismbark(int partySize) {
        if (numPassangers - partySize > 0) {
            numPassangers -= partySize;
        } else {
            System.out.println("The party size is too big or there is no one on board.");
        }
    }

    public double travel(double miles) {
        double fuelUsed = miles / fuelEconomy;
        if (fuelUsed > fuelRemaining) {
            System.out.println("There is not enough fuel");
        }
        fuelRemaining -= fuelUsed;
        return fuelRemaining;
    }

    public static void main(String[] args) {
        Vehicle prius = new Vehicle("Car", "gas", 4, 4, "red", 15, 5);
        prius.embark(5);

        Vehicle subaru = new Vehicle("Car", "gas", 4, 4, "red", 12, 10);
        subaru.embark(3);

        prius.travel(1000);
        System.out.println("Prius has" + prius.fuelRemaining + "%");
        System.out.println("Subaru has" + subaru.fuelRemaining + "%");

    }

}
