package be.intecbrussel;

public class Flashlight implements Battery{

    private Battery battery;

    public Flashlight(Battery battery){
        this.battery = battery;
    }

    @Override
    public int deliverPower() {
        System.out.println("Your flashlight is powered by batteries");
        return 100;
    }
}
