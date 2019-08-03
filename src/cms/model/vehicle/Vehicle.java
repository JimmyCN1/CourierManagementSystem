package cms.model.vehicle;

public abstract class Vehicle {
  private String registrationNumber;
  private int year;
  private String make;
  private String model;
  private double odometer;
  private double lastServicePoint;
  private double serviceInterval;
  private int jobData;
  
  public Vehicle(String registrationNumber, String make, int year, String model, double odometer,
                 double serviceInterval) {
    this.registrationNumber = registrationNumber;
    this.make = make;
    this.year = year;
    this.model = model;
    this.odometer = odometer;
    this.serviceInterval = serviceInterval;
  }
  
  public String getRegistrationNumber() {
    return registrationNumber;
  }
  
  public int getYear() {
    return year;
  }
  
  public String getMake() {
    return make;
  }
  
  public String getModel() {
    return model;
  }
  
  public double getOdometer() {
    return odometer;
  }
  
  public double getLastServicePoint() {
    return lastServicePoint;
  }
  
  public double getServiceInterval() {
    return serviceInterval;
  }
  
  public int getJobData() {
    return jobData;
  }
  
  public abstract double wearAndTearRate(double kilometers);
}
