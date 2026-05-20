// Find Simple Interest

import java.util.Scanner;

public class Q8 {
  public static void main(String args[]){
    System.out.println("\n***** Simple Interest *****\n");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Principal amount: ");
    float amt = sc.nextFloat();

    System.out.print("Enter the Rate of Interest(%): ");
    float rate = sc.nextFloat();

    System.out.print("Enter the Time(In Years): ");
    int time = sc.nextInt();

    System.out.print("\n\n You have entered: \n Principle Amount: INR " + amt + 
    " \n Rate of Interest: " + rate + "% \n Time: " + time + " yrs\n");

    //Calculation

    float SI = (amt * rate * time) / 100;

    System.out.println("\n Simple Interest: INR " + SI );

    sc.close();

  }
}  

