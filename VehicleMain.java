package Mam;

import java.util.*;

public class VehicleMain {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        String choice;

        do {
            System.out.print("Enter Registration Number: ");
            int registrationNumber = s.nextInt();
            s.nextLine(); 

            System.out.print("Enter Owner Name: ");
            String ownerName = s.nextLine();

            System.out.print("Enter Number of Doors (Car): ");
            int door = s.nextInt();
            s.nextLine(); 

            System.out.print("Enter Fuel Type (Car): ");
            String fuelType = s.nextLine();

            System.out.print("Enter Load Capacity (Truck): ");
            double loadCapacity = s.nextDouble();

            System.out.print("Enter Number of Axles (Truck): ");
            int numberAxles = s.nextInt();

            System.out.print("Enter Engine Capacity (Motorcycle): ");
            double engineCapacity = s.nextDouble();

            System.out.print("Has Sidecar (true/false) (Motorcycle): ");
            boolean hasSidecar = s.nextBoolean();
            s.nextLine();

          
            vehicles.add(new Car(registrationNumber, ownerName, door, fuelType));
            vehicles.add(new Truck(registrationNumber, ownerName, loadCapacity, numberAxles));
            vehicles.add(new Motorcycle(registrationNumber, ownerName, engineCapacity, hasSidecar));

            System.out.print("Add another vehicle set? (yes/no): ");
            choice = s.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\n=== VEHICLE DETAILS ===");
        for (Vehicle v : vehicles) {
            System.out.println("\nVehicle Type: " + v.getClass().getSimpleName());
            v.displayDetails();
        }

        System.out.println("\nTotal Vehicles Registered: " + Vehicle.getTotalVehicles());
        s.close();
    }
}
