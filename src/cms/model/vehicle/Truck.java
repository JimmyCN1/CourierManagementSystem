package cms.model.vehicle;

public class Truck extends Vehicle {
  private final double WEAR_AND_TEAR_MULTIPLIER = 0.5;
  
  private int loadCapacity;
  
  public Truck(String registrationNumber, String make, int year, String model, double odometer,
               double serviceInterval, int loadCapacity) {
    super(registrationNumber, make, year, model, odometer, serviceInterval);
    this.loadCapacity = loadCapacity;
  }
  
  public double getLoadCapacity() { return this.loadCapacity; }
  
  @Override
  public double wearAndTearRate(double kilometers) {
    return loadCapacity * WEAR_AND_TEAR_MULTIPLIER * kilometers;
  }
  
  public String toString() {
    return String.format("Truck: Reg Number: %s, Make: %s, Model: %s, Year: %d, Load Capacity: %f\n" +
            "Odometer: %fkm, Last Service: %fkm, Service Interval: %fkm",
            getRegistrationNumber(), getMake(), getModel(), getYear(), getLoadCapacity(),
            getOdometer(), getLastServicePoint(), getServiceInterval());
  }
}
