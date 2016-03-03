import java.util.Scanner;

/**
 * The purpose of this program is to provide a main
 * method that eads in values for label, radius,
 * height. After the values have been read in,
 * main creates a Cylinder object and then
 * prints the object.
 * Project 04.
 * 
 * @author Trisha Sengupta - section 001
 * @version 9/24/2015
 */
 
public class CylinderApp {

   /**
    * Prompts user to enter label, radius, and 
    * height and then Cylinder object should be 
    * created and printed.
    *
    * @param args Command line arguments (not used).
    */
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String label = "";
      double radius = 0.0;
      double height = 0.0;
      
      
      // prints results
      System.out.print("Enter label, radius, and height for a cylinder."
                         + "\n\tlabel: ");
                         
      // prompts user for label                   
      label = scan.nextLine();
       
      // prints radius 
      System.out.print("\tradius: ");
       
      // prompts user for radius 
      radius = Double.parseDouble(scan.nextLine());
      
      // prints height 
      System.out.print("\theight: ");
      
      // prompts user for height 
      height = Double.parseDouble(scan.nextLine());
      
      // creates Cylinder object 
      Cylinder c = new Cylinder(label, radius, height);
      
      // prints toString 
      System.out.print(c.toString());
      
   
   
   }   
   
   
}