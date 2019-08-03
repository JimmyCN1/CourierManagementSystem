package cms.model.vehicle.data;

import cms.model.vehicle.Vehicle;

public class JobData extends FleetData {
  private static int numJobs;
  
  private final double PROFIT_MARGIN_RATE = 0.5;
  
  private int jobID;
  private double tripDistance;
  private double wearAndTearExpense;
  private Vehicle vehicle;
  
  public JobData(int tripDistance, Vehicle vehicle) {
    numJobs++;
    this.jobID = numJobs;
    this.tripDistance = tripDistance;
    setWearAndTearExpense(tripDistance, vehicle);
  }
  
  public int getID() { return this.jobID; }
  
  private void setWearAndTearExpense(double tripDistance, Vehicle vehicle) {
    this.wearAndTearExpense = vehicle.wearAndTearRate(tripDistance);
  }
  
  public double getProfitMargin() {
    return PROFIT_MARGIN_RATE * wearAndTearExpense;
  }
}
