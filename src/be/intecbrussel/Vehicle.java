package be.intecbrussel;

public interface Vehicle extends Switch,Motor {

    void openDoor(int door);
    void closeDoor(int door);
}
