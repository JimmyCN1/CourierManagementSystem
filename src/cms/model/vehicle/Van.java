package cms.model.vehicle;

import cms.model.vehicle.data.MaintenanceData;

public class Van extends Vehicle {
  private final double WEAR_AND_TEAR_MULTIPLIER = 0.6;
  public Van(String registrationNumber, String model, int year, String make,
             double odometer, double maintenanceData) {
    super(registrationNumber, make, model, year, odometer, maintenanceData);
  }
  
  @Override
  public double wearAndTearRate(double kilometers) {
    return kilometers * WEAR_AND_TEAR_MULTIPLIER;
  }
}
