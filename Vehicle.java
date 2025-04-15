package Mam;

class Vehicle {
/*
 * Vehicle Registration System
You are building a system that registers different types of vehicles. All vehicles have:

registrationNumber, ownerName, and a method displayDetails().

There are different vehicle types:

Car: number of doors, fuel type

Truck: load capacity, number of axles

Motorcycle: engine capacity, hasSidecar (boolean)

Each subclass must:

Inherit from Vehicle

Override the displayDetails() method to show specific info

Include constructors, getters/setters, and validation logic (e.g., engine capacity must be > 50cc for motorcycles)

🧪 Bonus Requirements:
Create an array/list to store multiple vehicle objects.

Use polymorphism to display all vehicle details using a single loop.

Add a totalVehicles static field in the base class to count registered vehicles.

*/
	    private int registrationNumber;
	    private String ownerName;
	    private static int totalVehicle = 0;

	    public Vehicle(int registrationNumber, String ownerName) {
	        this.registrationNumber = registrationNumber;
	        this.ownerName = ownerName;
	        totalVehicle++;
	    }

	    public void setRegistrationNumber(int registrationNumber) {
	        this.registrationNumber = registrationNumber;
	    }

	    public int getRegistrationNumber() {
	        return registrationNumber;
	    }

	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }

	    public static int getTotalVehicles() {
	        return totalVehicle;
	    }

	    public void displayDetails() {
	        System.out.println("Registration Number: " + registrationNumber);
	        System.out.println("Owner Name: " + ownerName);
	    }
	}

	class Car extends Vehicle {
	    private int numberOfDoor;
	    private String fuelType;

	    public Car(int registrationNumber, String ownerName, int numberOfDoor, String fuelType) {
	        super(registrationNumber, ownerName);
	        this.numberOfDoor = numberOfDoor;
	        this.fuelType = fuelType;
	    }

	    public int getNumberDoor() {
	        return numberOfDoor;
	    }

	    public void setNumberDoor(int numberOfDoor) {
	        this.numberOfDoor = numberOfDoor;
	    }

	    public String getFuelType() {
	        return fuelType;
	    }

	    public void setFuelType(String fuelType) {
	        this.fuelType = fuelType;
	    }

	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Number of Doors: " + numberOfDoor);
	        System.out.println("Fuel Type: " + fuelType);
	    }
	}

	class Truck extends Vehicle {
	    private double loadCapacity;
	    private int numberAxles;

	    public Truck(int registrationNumber, String ownerName, double loadCapacity, int numberAxles) {
	        super(registrationNumber, ownerName);
	        this.loadCapacity = loadCapacity;
	        this.numberAxles = numberAxles;
	    }

	    public double getLoadCapacity() {
	        return loadCapacity;
	    }

	    public void setLoadCapacity(double loadCapacity) {
	        this.loadCapacity = loadCapacity;
	    }

	    public int getNumberAxles() {
	        return numberAxles;
	    }

	    public void setNumberAxles(int numberAxles) {
	        this.numberAxles = numberAxles;
	    }

	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Load Capacity: " + loadCapacity);
	        System.out.println("Number of Axles: " + numberAxles);
	    }
	}

	class Motorcycle extends Vehicle {
	    private double engineCapacity;
	    private boolean hasSideCar;

	    public Motorcycle(int registrationNumber, String ownerName, double engineCapacity, boolean hasSideCar) {
	        super(registrationNumber, ownerName);
	        if (engineCapacity <= 50) {
	            throw new IllegalArgumentException("Engine capacity must be greater than 50cc.");
	        }
	        this.engineCapacity = engineCapacity;
	        this.hasSideCar = hasSideCar;
	    }

	    public double getEngineCapacity() {
	        return engineCapacity;
	    }

	    public void setEngineCapacity(double engineCapacity) {
	        if (engineCapacity <= 50) {
	            throw new IllegalArgumentException("Engine capacity must be greater than 50cc.");
	        }
	        this.engineCapacity = engineCapacity;
	    }

	    public boolean getHasSideCar() {
	        return hasSideCar;
	    }

	    public void setHasSideCar(boolean hasSideCar) {
	        this.hasSideCar = hasSideCar;
	    }
	    

	    public void displayDetails() {
	    	System.out.println("Registration Number: " + getRegistrationNumber());
	        System.out.println("Owner Name: " + getOwnerName());
	        System.out.println("Engine Capacity: " + engineCapacity);
	        System.out.println("Has Sidecar: " + hasSideCar);
	    }
	}
