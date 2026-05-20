// Convert Celsius to Fahrenheit

import java.util.Scanner;

class Q7 {
  public static void main(String args[]){
    System.out.println("\n ***** Celsius to Fahrenheit ***** \n");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature in Celsius: ");
    float cel = sc.nextFloat();

    System.out.print("Your Entered Choice is : " + cel + " °C");

    //Calculation
    float fah = ((cel * 9/5) + 32);

    System.out.println("\n\nConverted to Fahrenheit...");
    System.out.print( cel + " °C is equal to " + fah + " °F" );

    sc.close();
  }
  
}
