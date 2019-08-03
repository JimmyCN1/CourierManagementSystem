package cms.model;

import cms.model.interfaces.CourierManagementSystem;
import cms.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CourierManagementSystemImpl implements CourierManagementSystem {
  private List<Vehicle> fleet;
  
  public CourierManagementSystemImpl() {
    fleet = new ArrayList<>();
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
  
  }
  
  @Override
  public boolean scheduleJob(double tripDistance, String registrationNumber) {
    return false;
  }
  
  @Override
  public void serviceVehicle(String registrationNumber) {
  
  }
  
}
