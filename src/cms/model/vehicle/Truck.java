package cms.model.vehicle;

import cms.model.vehicle.data.JobData;
import cms.model.vehicle.data.MaintenanceData;

public class Truck extends Vehicle {
  private final double WEAR_AND_TEAR_MULTIPLIER = 0.5;
  
  private double loadCapacity;
  
  public Truck(String registrationNumber, String model, int year, String make, double odometer,
               double maintenanceData, int jobData) {
    super(registrationNumber, model, year, make, odometer, maintenanceData, jobData);
  }
  
  public double getLoadCapacity() { return this.loadCapacity; }
  
  @Override
  public double wearAndTearRate(double kilometers) {
    return loadCapacity * WEAR_AND_TEAR_MULTIPLIER * kilometers;
  }
}
