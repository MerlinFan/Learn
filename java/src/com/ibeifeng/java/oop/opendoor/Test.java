package com.ibeifeng.java.oop.opendoor;

public class Test {
    public static void main(String[] args) {
        Door door = new OpenTheDoor();
        ((OpenTheDoor) door).openLook();
        door.openDoor();
        ((OpenTheDoor) door).openLook();
        door.closeDoor();


    }
}
