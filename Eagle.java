public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (this.isFlying()) {
            System.out.printf("%s is alredy in flight.%n", this.getName());
        } else {
            System.out.printf("%s takes off in the sky.%n", this.getName());
            this.flying = true;
        }
    }

    @Override
    public void ascend(int altitude) {
        if (this.isFlying()) {
            this.altitude += altitude;
            System.out.printf("%s flies upward, altitude: %s%n", this.getName(), this.altitude);
        } else {
            System.out.printf("%s must take off before ascend", this.getName());
        }
    }

    @Override
    public void descend(int altitude) {
        if (this.isFlying()) {
            this.altitude -= altitude;
            if (this.altitude < 0) {
                System.out.printf("%s is now a red smudge.%n", this.getName());
            } else {
                System.out.printf("%s flies downward, altitude: %s%n", this.getName(), this.altitude);
            }
        } else {
            System.out.printf("%s must take off before descend", this.getName());
        }
    }

    @Override
    public void land() {
        if ( this.isFlying()) {
            if (this.altitude > 1) {
                System.out.printf("%s is too high, it can't land.%n", this.getName());
            } else {
                System.out.printf("%s lands on the ground.%n", this.getName());
            }
        }
        else {
            System.out.printf("%s must take off before land", this.getName());
        }

    }
}
