package cms.model.vehicle;

import cms.model.vehicle.data.FleetData;
import cms.model.vehicle.data.JobData;
import cms.model.vehicle.data.MaintenanceData;

import java.util.List;

public abstract class Vehicle {
  private String registrationNumber;
  private int year;
  private String make;
  private String model;
  private double odometer;
  private double maintenanceData;
  private int jobData;
  
  public Vehicle(String registrationNumber, String model, int year, String make, double odometer,
                 double maintenanceData, int jobData) {
    this.registrationNumber = registrationNumber;
    this.year = year;
    this.make = make;
    this.model = model;
    this.odometer = odometer;
    this.maintenanceData = maintenanceData;
    this.jobData = jobData;
  }
  
  public Vehicle(String registrationNumber, String make, String model, int year, double odometer,
                 double maintenanceData) {
    this.registrationNumber = registrationNumber;
    this.year = year;
    this.make = make;
    this.model = model;
    this.odometer = odometer;
    this.maintenanceData = maintenanceData;
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
