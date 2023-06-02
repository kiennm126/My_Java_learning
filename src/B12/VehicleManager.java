package B12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    public void removeVehicle(String id) {
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            if (vehicle.getId().equals(id)) {
                iterator.remove();
                System.out.println("Vehicle removed successfully.");
                return;
            }
        }
        System.out.println("Vehicle with the given ID was not found.");
    }

    public void findVehiclesByManufacturer(String manufacturer) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getManufacturer().equalsIgnoreCase(manufacturer)) {
                System.out.println(vehicle.getDetails());
            }
        }
    }

    public void findVehiclesByColor(String color) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicle.getDetails());
            }
        }
    }

    public void exitProgram() {
        System.exit(0);
    }
}