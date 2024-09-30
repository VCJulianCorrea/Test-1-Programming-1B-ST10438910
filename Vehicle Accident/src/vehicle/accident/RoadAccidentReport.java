/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.accident;

/**
 *
 * @author lab_services_student
 */
public class RoadAccidentReport extends RoadAccidents {

    public RoadAccidentReport(String vehicleType, String city, int numAccidents) {
        super(vehicleType, city, numAccidents);
    }
    public void printAccidentReport() {
        System.out.println("\nVEHICLE ACCIDENT REPORT"
                + "\n**********************"
                + "\nVEHICLE TYPE: " + vehicleType + "\nCITY: "
                        + city + "\nTOTAL ACCIDENTS: " + numAccidents);
    }
    
}
