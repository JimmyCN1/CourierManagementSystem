package fleet;

import fleet.data.JobData;
import fleet.data.MaintenanceData;

import java.util.List;

public class Truck extends Vehicle {
  private int loadCapacity;
  
  public Truck(String registrationNumber, int year, String make, String model, int odometer,
               List<MaintenanceData> maintenanceData, List<JobData> jobData, int loadCapacity) {
    super(registrationNumber, year, make, model, odometer, maintenanceData, jobData);
    this.loadCapacity = loadCapacity;
  }
  
  @Override
  public void getWearAndTearExpense() {
  
  }
}
