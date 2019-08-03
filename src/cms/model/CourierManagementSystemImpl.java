package cms.model;

import cms.model.interfaces.CourierManagementSystem;
import cms.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourierManagementSystemImpl implements CourierManagementSystem {
  private List<Vehicle> fleet;
  
  public CourierManagementSystemImpl() {
    fleet = new ArrayList<>();
  }
  
  public Vehicle getVehicle(String registrationNumber) {
    List<Vehicle> vehicles = fleet.stream()
            .filter(v -> v.getRegistrationNumber() == registrationNumber)
            .collect(Collectors.toList());
    return vehicles.get(0);
  }
  
  @Override
  public void addVehicle(Vehicle vehicle) {
    fleet.add(vehicle);
  }
  
  @Override
  public void displayAllVehicles() {
    fleet.forEach((vehicle) -> {
      System.out.println(vehicle.toString());
    });
  }
  
  @Override
  public void displayVehicleInfo(String registrationNumber) {
    fleet.forEach(vehicle -> {
      if (vehicle.getRegistrationNumber() == registrationNumber) {
        System.out.println(vehicle.toString());
      }
    });
  }
  
  @Override
  public void displayAllJobs() {
    //TODO: implement method
    fleet.forEach(vehicle -> {
      System.out.println();
    });
  }
  
  @Override
  public boolean scheduleJob(double tripDistance, String registrationNumber) {
    boolean jobScheduled = false;
    Vehicle vehicle = getVehicle(registrationNumber);
    double odometer = vehicle.getOdometer();
    double lastServicePoint = vehicle.getLastServicePoint();
    double serviceInterval = vehicle.getServiceInterval();
    if (tripDistance < serviceInterval - odometer + lastServicePoint) {
      vehicle.setOdometer(tripDistance);
      jobScheduled = true;
    }
    return jobScheduled;
  }
  
  @Override
  public void serviceVehicle(String registrationNumber) {
    Vehicle vehicle = getVehicle(registrationNumber);
    vehicle.setLastServicePoint();
  }
  
}
