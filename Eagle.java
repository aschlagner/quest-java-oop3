public class Eagle extends Bird implements Fly {

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


    // Must methods from Interface Fly

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println("Takes off steeply into the sky.");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 7000);
            System.out.println(this.getName() + " climbs to " + this.altitude + " metres altitude.");
        }
        return this.altitude;    
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + " falls to " + this.altitude + " metres altitude.");
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.println(this.getName() + " is back on the ground after a buttery landing.");
        } else {
            System.out.println(this.getName() + " is still too high and would break all his bones if he landed.");
        }
    }

}
