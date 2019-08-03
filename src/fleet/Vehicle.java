package fleet;

import fleet.data.FleetData;
import fleet.data.JobData;
import fleet.data.MaintenanceData;

import java.util.List;

public abstract class Vehicle {
  private String registrationNumber;
  private int year;
  private String make;
  private String model;
  private int odometer;
  private List<MaintenanceData> maintenanceData;
  private List<JobData> jobData;
  
  public Vehicle(String registrationNumber, int year, String make, String model, int odometer,
                      List<MaintenanceData> maintenanceData, List<JobData> jobData) {
    this.registrationNumber = registrationNumber;
    this.year = year;
    this.make = make;
    this.model = model;
    this.odometer = odometer;
    this.maintenanceData = maintenanceData;
    this.jobData = jobData;
  }
  
  public FleetData getJobOrMaintenance(int id, List<FleetData> data){
    int index = 0;
    while (data.get(index).getID() != id) {
      index++;
    }
    return data.get(index);
  }
  
  public abstract double wearAndTearRate(double kilometers);
}
