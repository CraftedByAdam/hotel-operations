package com.pluralsight;

import javax.management.StandardMBean;

public class HotelOperation {
    public static void main(String[] args) {

        Room room1 = new Room(2, 150.00, true, false);
        Room room2 = new Room(3, 20.00, false, true);
        Room room3 = new Room(1, 60.00, false, false);

        System.out.println("Room Class");
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

        Reservation reservation1 = new Reservation("King", 1, false);
        Reservation reservation2 = new Reservation("Double", 3, true);
        Reservation reservation3 = new Reservation("king", 3, false);

        System.out.println("Reservation Class");
        System.out.println("Room 1");
        System.out.println("Room Type is: " + reservation1.getRoomType());
        System.out.println("Number of Nights: " + reservation1.getNumberOfNights());
        System.out.println("Stay Over Weekend: " + reservation1.isWeekend());
        System.out.println("Price Per Night: "  + reservation1.getPrice());
        System.out.println("Total: " + reservation1.getReservationTotal() + "\n");

        System.out.println("Room 2");
        System.out.println("Room Type is: " + reservation2.getRoomType());
        System.out.println("Number of Nights: " + reservation2.getNumberOfNights());
        System.out.println("Stay Over Weekend: " + reservation2.isWeekend());
        System.out.println("Price Per Night: " + reservation2.getPrice());
        System.out.println("Total: " + reservation2.getReservationTotal() + "\n");

        System.out.println("Room 3");
        System.out.println("Room Type is: " + reservation3.getRoomType());
        System.out.println("Number of Nights: " + reservation3.getNumberOfNights());
        System.out.println("Stay Over Weekend: " + reservation3.isWeekend());
        System.out.println("Price Per Night: " + reservation3.getPrice());
        System.out.println("Total: " + reservation3.getReservationTotal() + "\n");

        System.out.println("------------------------------\n");

        Employee employee1 = new Employee(1, "Bob", "Sales", 30.00, 30);
        Employee employee2 = new Employee(2, "Larry", "Plumber", 40.00, 50);
        Employee employee3 = new Employee(3, "Adam", "Programmer", 100.00, 40);

        System.out.println("Employee Class");
        System.out.println("Employee Info");
        System.out.println("ID: " + employee1.getEmployeeId());
        System.out.println("Name: "  + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Pay Rate: "  + employee1.getPayRate());
        System.out.println("Hours Worked: " + employee1.getHoursWorked());
        System.out.println("Total Pay: " + employee1.getTotalPay() + "\n");


        System.out.println("Employee Info");
        System.out.println("ID: " + employee2.getEmployeeId());
        System.out.println("Name: "  + employee2.getName());
        System.out.println("Department: " + employee2.getDepartment());
        System.out.println("Pay Rate: "  + employee2.getPayRate());
        System.out.println("Hours Worked: " + employee2.getHoursWorked());
        System.out.println("Total Pay: " + employee2.getTotalPay() + "\n");

        System.out.println("Employee Info");
        System.out.println("ID: " + employee3.getEmployeeId());
        System.out.println("Name: "  + employee3.getName());
        System.out.println("Department: " + employee3.getDepartment());
        System.out.println("Pay Rate: "  + employee3.getPayRate());
        System.out.println("Hours Worked: " + employee3.getHoursWorked());
        System.out.println("Total Pay: " + employee3.getTotalPay() + "\n");
    }
}
