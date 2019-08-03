package fleet.data;

import fleet.Vehicle;

public class JobData extends FleetData {
  private static int numJobs;
  
  private int jobID;
  private int tripDistance;
  private Vehicle vehicle;
  
  public JobData(int tripDistance) {
    numJobs++;
    this.jobID = numJobs;
  }
  
  public int getID() { return this.jobID; }
}
