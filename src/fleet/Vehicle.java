package fleet;

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
  private List<JobData> jobs;
  
  
}
