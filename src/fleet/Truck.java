package fleet;

import fleet.data.JobData;
import fleet.data.MaintenanceData;

import java.util.List;

public class Truck extends Vehicle {
  private final double WEAR_AND_TEAR_MULTIPLIER = 0.5;
  
  private double loadCapacity;
  
  public Truck(String registrationNumber, int year, String make, String model, int odometer,
               List<MaintenanceData> maintenanceData, List<JobData> jobData, int loadCapacity) {
    super(registrationNumber, year, make, model, odometer, maintenanceData, jobData);
    this.loadCapacity = loadCapacity;
  }
  
  public double getLoadCapacity() { return this.loadCapacity; }
  
  @Override
  public double wearAndTearRate(double kilometers) {
    return loadCapacity * WEAR_AND_TEAR_MULTIPLIER * kilometers;
  }
}
