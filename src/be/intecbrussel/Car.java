package be.intecbrussel;

public class Car implements Switch, Motor, Vehicle {

    private boolean switchToggled;

    private int doorsOpen;

    public boolean isSwitchToggled() {
        return switchToggled;
    }

    public int getDoorsOpen() {
        System.out.print("Amount of doors open is ");
        return doorsOpen;
    }

    @Override
    public void gas() {
        if (switchToggled == true && doorsOpen == 0){
            System.out.println("You give gas");
        } else if (switchToggled == false) {
            System.out.println("You can't give gas when the car is turned off");
        }
        if (doorsOpen != 0 && doorsOpen > 1){
            System.out.println("You can't give gas because there are "+doorsOpen+ " doors open");
        } else if (doorsOpen == 1) {
            System.out.println("You can't give gas because there is 1 door open");

        }

    }

    @Override
    public void toggleSwitch() {
        if (switchToggled == false){
            System.out.println("You turn the car on");
            switchToggled = true;
        } else if (switchToggled == true) {
            System.out.println("You turn the car off");
            switchToggled = false;
        }

    }

    @Override
    public void openDoor(int door) {
        System.out.println("You open " +door+ " doors");
        doorsOpen+=door;
    }

    @Override
    public void closeDoor(int door) {
        if (door == 1){
            System.out.println("You close 1 door");
        }
        else {
            System.out.println("You close "+door+ " doors");
        }
        doorsOpen-=door;
    }
}
