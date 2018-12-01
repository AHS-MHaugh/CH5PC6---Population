/**
 * Michael Haugh
 * Programming III
 * CH5PC6 - Population
 * 11-27-2018
 */


package ch5pc6;

//Declares the variables.
public class Population {
    private int startingSize;
    private double percentageIncrease;
    private int numberOfDays;
            
  //Establishes a constuctor.
    public Population (int s, double i, int d) {
        startingSize = s;
        percentageIncrease = i;
        numberOfDays = d;
    }
    
//ACCESSOR AND MUTATOR METHODS
    public void setStartNum (int s) {
        
        startingSize = s;
        
    }
    
    public void setPercentageIncrease (double pi) {
        
        percentageIncrease = pi;
        
    }
    
    public void setDayNumber (int dn){
        
    numberOfDays = dn;
    
    }
    
    public int getStartNum() {
        
        return startingSize;
        
    }
    
    //Calculates increase in precentage.
    public double getPercentageIncrease() {
        
        percentageIncrease *= 0.01;
        return percentageIncrease;
        
    }
    
    public int getDayNumber() {
        
        return numberOfDays;
    }
    
    //Calculates the daily popilation increase
    public String calculateDailyIncrease() {
        
        int dailyPopulation = startingSize;
        int dailyIncrease;
        String dailyPopulationReturn = "";
        
        
        dailyPopulationReturn = "Day 1: " + dailyPopulation;
        dailyIncrease = (int) (dailyPopulation*(percentageIncrease*0.01));
        
  //Loop is used to add more days intil the input for number of days is reached. 
        for (int i = 2; i <= numberOfDays; i++) {
            dailyPopulation += dailyIncrease;
            dailyPopulationReturn += "\n Day " + i + ":" + dailyPopulation;
        }
        
        return dailyPopulationReturn;
    }
    
}
