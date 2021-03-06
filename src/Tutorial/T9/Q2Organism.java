/*
2. Define a class Organism. The class contains the initial size of the organism and the growth rate. Create a constructor to initialize the instance variables. Then, define a class Animal. Animal is an organism that has extra instance variable which is the amount of eating need. Create a constructor to initialize the instance variable and a method to display the Animal instance variables. 
 */
package Tutorial.T9;

import java.util.Random;

public class Q2Organism {
    
    private int size;
    private double growthRate;
    private Random r = new Random();
    
    public Q2Organism(){
        size = 1 + r.nextInt(100);
        growthRate = Math.round(r.nextDouble()*100000)/100.0;
    }

    @Override
    public String toString() {
        return "\nSize : " + size + "\nGrowth Rate : " + growthRate;
    }
    
    
    
    
}
