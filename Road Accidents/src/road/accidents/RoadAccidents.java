/* Name: Julian Jonah Correa
   Student Number: ST10438910
Programme:BCA1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package road.accidents;

import java.util.Scanner;


public class RoadAccidents {

    
    public static void main(String[] args) {
        int[][] accidents = new int[2][3];
        int[] total = new int[3];
        String output;
        Scanner cam = new Scanner(System.in);
        System.out.println("--------------------------------------------------"
                + "\nROAD ACCIDENT ASSISTANT"
                + "\n-------------------------------------------------------");
        System.out.println("Please enter the number of car accidents in Cape Town: ");
        accidents[0][0] = Integer.parseInt(cam.next());
        System.out.println("Please enter the number of motorbike accidents in Cape Town: ");
        accidents[1][0] = Integer.parseInt(cam.next());
        System.out.println("Please enter the number of car accidents in Cape Town: ");
        accidents[0][1] = Integer.parseInt(cam.next());
        System.out.println("Please enter the number of motorbike accidents in Cape Town: ");
        accidents[1][1] = Integer.parseInt(cam.next());
        System.out.println("Please enter the number of car accidents in Cape Town: ");
        accidents[0][2] = Integer.parseInt(cam.next());
        System.out.println("Please enter the number of motorbike accidents in Cape Town: ");
        accidents[1][2] = Integer.parseInt(cam.next());
        System.out.println("-----------------------------------------------------"
                + "\n#ROAD ACCIDENT REPORT#"
                + "\n---------------------------------------------------------"
                + "\nCITY\tCAR\tMOTORBIKE");
        for (int i = 0; i < 3; i++) {
            output = "";
            switch(i) {
                case 0: output = "Cape Town";
                case 1: output = "Johannesburg";
                case 2: output = "Port Elizabeth";
            }
            for (int j = 0; j < 2; j++) {
                output = output + "\t" + accidents[j][i];
            }
            System.out.println(output);
        }
        System.out.println("-----------------------------------------------------"
                + "\nROAD ACCIDENT TOTALS IN EACH CITY"
                + "\n----------------------------------------------------");
        for (int i = 0; i < 3; i++) {
           total[i] = accidents[0][i] + accidents[1][i]; 
        }
        System.out.println("Cape Town\t" + total[0]);
        System.out.println("Johannesburg\t" + total[1]);
        System.out.println("Port Elizabeth\t" + total[2]);
        if ((total[0] > total[1]) && (total[0] > total[2])) {
            System.out.println("\nCITY WITH THE MOST ACCIDENTS: Cape Town");
        } else if ((total[2] > total[1]) && (total[2] > total[0])) {
            System.out.println("\nCITY WITH THE MOST ACCIDENTS: Port Elizabeth");
        } else {
            System.out.println("\nCITY WITH THE MOST ACCIDENTS: Johannesburg");
        }
    }
    
}
