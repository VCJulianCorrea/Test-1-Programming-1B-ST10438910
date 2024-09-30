/* Name: Julian Jonah Correa
    Student Number: ST10438910
Programme: BCA1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicle.accident;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class RunApplication {

    
    public static void main(String[] args) {
        String vehicle;
        String cityName;
        int accidents;
        Scanner cam = new Scanner(System.in);
        System.out.println("Please enter the vehicle type in accident:");
        vehicle = cam.next();
        System.out.println("Please enter the city for vehicle accidents:");
        cityName = cam.next();
        System.out.println("Please enter total accidents for " + cityName + ": ");
        accidents = Integer.parseInt(cam.next());
        RoadAccidentReport rar = new RoadAccidentReport(vehicle, cityName, accidents);
        rar.printAccidentReport();
    }
    
}
