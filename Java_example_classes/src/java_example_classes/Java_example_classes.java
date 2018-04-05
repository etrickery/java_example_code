/*
 * Eric Pfister
 * ericspfister@gmail.com
 * 
 */
package java_example_classes;

/**
 *
 * @author ericpfister
 */

//imports
import java.util.Scanner;


public class Java_example_classes {

    /**
     * @param args the command line arguments
     */
    
    //number of vehicles input by user
    static int numberOfCars = 10;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Vehicle object to collect input
        Vehicles[] vehicles = new Vehicles[numberOfCars];
            
        int userSelection = 0;
    
        while(userSelection != 4){
            
            
            switch (userSelection){
                case 0:
                    userSelection = displayMenu(vehicles);
                    break;
                case 1:
                    //add vehicle
                    userSelection = 0;
                    vehicles = addVehicle(vehicles);
                    break;
                case 2:
                    //edit vehicle
                    userSelection = 0;
                    
                    break;
                case 3:
                    //delete vehicle
                    userSelection = 0;
                    
                    break;
                case 4:
                    //exit application
                    
                    break;
                    
            }
              
        }
    
    }
    
   
    
    static Vehicles[] addVehicle(Vehicles[] vehicles){
        
        //clear the console
        System.out.println("\\033[H\\033[2J");
        System.out.flush();
        
        int whichVehicle = vehicles.length+1;
        
        //instance of scanner to capture input
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter the vehicle year:\n");
        
        vehicles[].setVehicleYear(scanner.nextInt());
        
        System.out.println("Enter the vehicle make:\n");
        
        vehicles[vehicles.length+1].setVehicleMake(scanner.next());

        System.out.println("Enter the vehicle model:\n");
        
        vehicles[vehicles.length+1].setVehicleModel(scanner.next());


        
        return vehicles;
    }
    
    
    
    static int displayMenu(Vehicles[] vehicles){
        
        //clear the console
        System.out.println("\\033[H\\033[2J");
        System.out.flush();
        
        //instance of scanner to capture input
        Scanner scanner = new Scanner(System.in);
        
        //if there are vehicles entered, display them
        if (vehicles.length > 0){
            
            System.out.println("User entered vehicles:\n");
            
            //display the vehicles (upto ten)
            for (int i = 1; i < vehicles.length+1; i++){
                System.out.println(i + ". " + vehicles[i].getVehicleYear() + " " + vehicles[i].getVehicleMake() + " " + vehicles[i].getVehicleModel() + "\n");
            }
            
        }
        
        //menuitems array
        String[] menuItems = new String[4];
        
        //create menu
        System.out.println("Choose an option:\n");
        
        menuItems[0] = "add vehicle";
        menuItems[1] = "edit vehicle";
        menuItems[2] = "delete vehicle";
        menuItems[3] = "exit";
        
        for (int i = 1; i < menuItems.length+1; i++){
            System.out.println(i + ". " + menuItems[i]);
        }
        
        System.out.println("Enter your selection: ");
        
        int userMenuSelection = scanner.nextInt();
        
        if (userMenuSelection >= 1 && userMenuSelection <= 4){
            return userMenuSelection;
        }else{
            System.out.println("Please enter a selection from the menu: ");
            return 0;
        }
        
    }
    
}
