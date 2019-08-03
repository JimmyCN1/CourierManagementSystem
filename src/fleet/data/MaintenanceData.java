package fleet.data;

import fleet.Vehicle;

public class MaintenanceData extends FleetData {
  private static int numMaintenance;
  
  private final int lastServicePoint;
  private final int serviceInterval;
  
  private int maintenanceID;
  private Vehicle vehicle;
  
  public MaintenanceData(int lastServicePoint, int serviceInterval, Vehicle vehicle) {
    numMaintenance++;
    this.lastServicePoint = lastServicePoint;
    this.serviceInterval = serviceInterval;
    this.maintenanceID = numMaintenance;
    this.vehicle = vehicle;
  }
  
  @Override
  public int getID() { return this.maintenanceID; }
  
  public int getLastServicePoint() { return lastServicePoint; }
  
  public int getServiceInterval() { return serviceInterval; }
}
