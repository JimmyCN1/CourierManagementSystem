package cms.model.interfaces;

import cms.model.vehicle.Vehicle;

public interface CourierManagementSystem {

  public void addVehicle(Vehicle vehicle);
  
  public void displayAllVehicles();
  
  public Vehicle displayVehicleInfo(String registrationNumber);
  
  public void displayAllJobs();
  
  public boolean scheduleJob(double tripDistance, String registrationNumber);
  
  public void serviceVehicle(String registrationNumber);
}
