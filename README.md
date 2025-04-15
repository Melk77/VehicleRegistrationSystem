# Vehicle Registration System 🚗🛻🏍️

This Java-based **Vehicle Registration System** allows users to register and manage different types of vehicles: **Cars**, **Trucks**, and **Motorcycles**. It is a console-based application that uses **Object-Oriented Programming (OOP)** principles like inheritance and polymorphism.

---

## 💡 Features

- ✅ Register different types of vehicles:
  - **Car**: number of doors, fuel type
  - **Truck**: load capacity, number of axles
  - **Motorcycle**: engine capacity, sidecar support
- ✅ Display all vehicle details using **polymorphism**
- ✅ Keep track of total registered vehicles using a static field
- ✅ Input validation (e.g., engine capacity for motorcycles must be > 50cc)

---

## 🧰 Technologies Used

- Java
- OOP (Inheritance, Polymorphism, Encapsulation)
- CLI (Command Line Interface)

---

## 📁 Project Structure

Mam/ ├── VehicleMain.java # Main logic and user interaction ├── Vehicle.java # Contains base class and subclasses: Car, Truck, Motorcycle.

---

## 🧱 Class Overview

### 🔹 Vehicle (Base Class)
- Fields: `registrationNumber`, `ownerName`
- Static: `totalVehicle` to count all registered vehicles
- Methods: Getters, setters, `displayDetails()`

### 🔹 Car (Subclass)
- Additional Fields: `numberOfDoor`, `fuelType`
- Overrides: `displayDetails()`

### 🔹 Truck (Subclass)
- Additional Fields: `loadCapacity`, `numberAxles`
- Overrides: `displayDetails()`

### 🔹 Motorcycle (Subclass)
- Additional Fields: `engineCapacity`, `hasSideCar`
- Includes validation: `engineCapacity > 50cc`
- Overrides: `displayDetails()`

---

## 🔁 Polymorphism In Action

All vehicle objects are stored in a single `List<Vehicle>`. During display, Java's dynamic method dispatch calls each subclass's `displayDetails()` method properly:

```java
for (Vehicle v : vehicles) {
    System.out.println("\nVehicle Type: " + v.getClass().getSimpleName());
    v.displayDetails(); // Automatically calls subclass method
}
=== VEHICLE DETAILS ===

Vehicle Type: Car
Registration Number: 1001
Owner Name: Melkamu
Number of Doors: 4
Fuel Type: Diesel

Vehicle Type: Truck
Registration Number: 1001
Owner Name: Melkamu
Load Capacity: 3000.0
Number of Axles: 2

Vehicle Type: Motorcycle
Registration Number: 1001
Owner Name: Melkamu
Engine Capacity: 150.0
Has Sidecar: false

Total Vehicles Registered: 3

---

📌 **To use it**:
1. Create a file in your repository named `README.md`
2. Paste the content above
3. Commit the file and push it to GitHub

Want to include screenshots or icons? I can help with that too!
