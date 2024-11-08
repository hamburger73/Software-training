public class Motor {

    double speed;
    int id;

    public Motor(int id) {
        this.id = id;
    }

    public double get() {
        return speed;
    }

    public void set(double speed) {
        this.speed = speed;
        if (speed > 1) {
            set(1);
        }
        if (speed < -1) {
            set(-1);
        }
    }

    public void stop() {
        set(0.0);
    }

    public String status() {
        return "Motor #" + id + "=" + speed;
    }

    public static void main(String... args) {
        Motor frontLeft = new Motor(1);
        frontLeft.set(2);
        System.out.println(frontLeft.status());
        frontLeft.stop();
        System.out.println(frontLeft.status());

        Motor backRight = new Motor(2);
        backRight.set(-0.5);
        System.out.println(backRight.status());
        backRight.stop();
        System.out.println(backRight.status());

    }
}