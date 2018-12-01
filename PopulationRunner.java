/**
 * Michael Haugh
 * Programming III
 * CH5PC6 - Population
 * 11-27-2018
 */

package ch5pc6;
        
import java.util.Scanner;

public class PopulationRunner {

    //Declares the variables.
    public static void main(String[] args) {
        int startSize;
        double dailyIncrease;
        int dayNumber;
       
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Please enter population starting size: ");
        startSize = keyboard.nextInt();
        
     //Loop returns a specific statement if the population input is less than 2.
        while (startSize < 2) {
            System.out.println("Please enter a population with a value "
                    + "greater than two!:");
            startSize = keyboard.nextInt();
        }
        
        //Tells the user to enter the daily increase.
        System.out.println("Please enter daily increase: ");
        dailyIncrease = keyboard.nextDouble();
        
     //Loop returns a specific statement if the daily increase input is less than 0.
        while (dailyIncrease < 0) {
            System.out.println("Please enter a positive value for "
                    + "the daily increase!:");
            dailyIncrease = keyboard.nextDouble();
        }
        
        //Tells the user to enter the number of days.
        System.out.println("Please enter the number of days that "
                + "population will multiply:");
        dayNumber = keyboard.nextInt();
        
      //Loop returns a specific statement if the day number input is less than 0.
        while (dayNumber < 1) {
            System.out.println("Please enter a value great than one "
                    + "day!: ");
            dayNumber = keyboard.nextInt();
        }
     
      //Population constructor
        Population populationOne = new Population(startSize, dailyIncrease,
        dayNumber);
        
     //Returns the population increase for each day. 
        System.out.println(populationOne.calculateDailyIncrease());
        
    }
    
}