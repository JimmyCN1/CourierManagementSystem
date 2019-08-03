package fleet;

import fleet.data.JobData;
import fleet.data.MaintenanceData;

import java.util.List;

public class Van extends Vehicle {
  public Van(String registrationNumber, int year, String make, String model,
             int odometer, List<MaintenanceData> maintenanceData, List<JobData> jobData) {
    super(registrationNumber, year, make, model, odometer, maintenanceData, jobData);
  }
  
  @Override
  public void getWearAndTearExpense() {
  
  }
}
