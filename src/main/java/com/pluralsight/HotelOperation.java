package com.pluralsight;

public class HotelOperation {
    public static void main(String[] args) {

        Room room1 = new Room(2, 150.00, true, false);
        Room room2 = new Room(3, 20.00, false, true);
        Room room3 = new Room(1, 60.00, false, false);

        System.out.println("Room 1");
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: "  + room1.getPrice());
        System.out.println("Is it available? " + room1.isAvailable() + "\n");

        System.out.println("Room 2");
        System.out.println("Beds: " + room2.getNumberOfBeds());
        System.out.println("Price: "  + room2.getPrice());
        System.out.println("Is it available? " + room2.isAvailable() + "\n");

        System.out.println("Room 3");
        System.out.println("Beds: " + room3.getNumberOfBeds());
        System.out.println("Price: "  + room3.getPrice());
        System.out.println("Is it available? " + room3.isAvailable() + "\n");

        System.out.println("------------------------------\n");
    }
}
