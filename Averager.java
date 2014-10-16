/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author <your name here>
* @version <date you finished the code>
*
*/

import java.util.Scanner;

public class Averager {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double totalNumbers = 0;
      double enterNumbers = 0;
      System.out.println("Enter a number you would like to find the mean of.");
      double addNumbers = scnr.nextDouble();
         while (addNumbers != -1) { 
            totalNumbers = totalNumbers + addNumbers;
            enterNumbers = enterNumbers + 1;
            System.out.println("Enter another number or -1 to exit");
            addNumbers = scnr.nextDouble();
            }
            
            System.out.println("Average of numbers: "+totalNumbers / enterNumbers);
         
         }
 }         
            
           
