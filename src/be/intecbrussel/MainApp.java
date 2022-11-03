package be.intecbrussel;

public class MainApp {

    public static void main(String[] args){

        Car car = new Car();

        car.openDoor(5);
        System.out.println(car.getDoorsOpen());
        car.toggleSwitch();
        car.gas();
        car.closeDoor(3);
        car.gas();
        car.closeDoor(1);
        car.gas();
        car.closeDoor(1);
        car.gas();

//        Battery DuracelDoubleA = new DuracelDoubleA();
//        Battery VartaDoubleA = new VartaDoubleA();
//
//        Flashlight flashlight1 = new Flashlight(DuracelDoubleA);
//        Flashlight flashlight2 = new Flashlight(VartaDoubleA);
//
//        flashlight1.deliverPower();




    }

}
