package cms.model.vehicle;

public class Van extends Vehicle {
  private final double WEAR_AND_TEAR_MULTIPLIER = 0.6;
  public Van(String registrationNumber, String make, int year, String model,
             double odometer, double serviceInterval) {
    super(registrationNumber, make, year, model, odometer, serviceInterval);
  }
  
  @Override
  public double wearAndTearRate(double kilometers) {
    return kilometers * WEAR_AND_TEAR_MULTIPLIER;
  }
  
  public String toString() {
    return String.format("Van: Reg Number: %s, Make: %s, Model: %s, Year: %d\n" +
            "Odometer: %fkm, Last Service: %fkm, Service Interval: %fkm",
            getRegistrationNumber(), getMake(), getModel(), getYear(), getOdometer(),
            getLastServicePoint(), getServiceInterval());
  }
}
