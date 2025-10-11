package exercise2;
import javax.swing.*;
import java.util.Random;

public class Lotto {

    //array to hold intergers values 1-9 (empty)
    private int [] lNumbers; //just sets up the array to exist

    // use constructor to populate array with random numbers
    public Lotto (){//constructor for lotto class: initalizes variables for class
        lNumbers = new int[3]; //three different slots for array numbers slot1/slot2/slot3
        Random randomNumberGen = new Random(); //just a number generator

        for (int i=0; i< lNumbers.length; i++){
            //0 = starting loop number - i = loop - i is equal or less than 3 loops = unless 3 slots filled, keeping counting
            lNumbers[i] = randomNumberGen.nextInt(9) + 1;
            //number array generates random num nextInt = truly random - generates num starting at 0-8 so you must + 1 = 1-9
        }
    }
    //method to return array
    public int[] numGet(){
        return lNumbers.clone(); // copy of array with independent values to protect original lotto nums
    }

    @Override // just corrects how it prints
    public String toString() {
        return lNumbers[0]+" " + lNumbers[1] + " " + lNumbers[2];
    }


} //LOTTO END BRACKET
