/*
 * Eric Pfister
 * ericspfister@gmail.com
 * 
 */
package java_example_classes;

/**
 *
 * @author ericpfister
 * 
 * vehicle object 
 * 
 * 
 */
public class Vehicles {
    
    //member variables/attributes
    private int vehicleYear;
    private String vehicleMake;
    private String vehicleModel;

    //constructor/initializer
    public Vehicles(int vehicleYear, String vehicleMake, String vehicleModel) {
        this.vehicleYear = vehicleYear;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
    }

    //getter and setters
    
    //get vehicle year
    public int getVehicleYear() {
        return vehicleYear;
    }
    
    //set vehicle year
    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }
    
    //get vehicle make
    public String getVehicleMake() {
        return vehicleMake;
    }

    //set vehicle make    
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    } 
    
    //get vehicle model
    public String getVehicleModel() {
        return vehicleModel;
    }

    //set vehicle model
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    
}
