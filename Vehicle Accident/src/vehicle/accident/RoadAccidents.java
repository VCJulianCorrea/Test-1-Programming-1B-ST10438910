/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.accident;

/**
 *
 * @author lab_services_student
 */
abstract class RoadAccidents {
    String vehicleType;
    String city;
    int numAccidents;
    public RoadAccidents(String vehicleType, String city, int numAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.numAccidents = numAccidents;
    }
    public interface IRoadAccidents {
        String getAccidentVehicleType();
        String getCity();
        int getAccidentTotal();
    }
}
