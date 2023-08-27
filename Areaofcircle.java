 

package rafid.areaofcircle;
import java.util.Scanner;

 public class Areaofcircle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius= scan.nextDouble();
        double area= Math.PI*Math.pow(radius, 2);
        System.out.println("The area of the circle is "+area);
    }
 }
     
        
        
        
        
        
        
         
    
