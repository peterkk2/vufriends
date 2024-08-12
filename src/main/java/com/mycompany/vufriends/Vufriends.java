/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vufriends;

/**
 *
 * @author CLIENT
 */
public class Vufriends {

    public static void main(String[] args) {
        //Array of names
        String[]names = {
            "Elena", "Thomas", "Hamiliton", "Suzie", "Phil",
            "Matt", "Alex", "Emma", "John", "James",
            "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };
        
        //Array of times corresponding to the names
        int[] times = {
            341, 273, 278, 329, 445,
            402, 388, 275, 243, 334,
            412, 393, 299, 343, 317, 265
        };
        
        //Variables to store the index of the fastest and second fastest runners
        int fastestIndex = 0;
        int secondFastestIndex = 0;
        
        //Initialize the fastest and second fastest times
        int fastestTime = Integer.MAX_VALUE;
        int secondFastestTime = Integer.MAX_VALUE;
        
        //Iterate through the times array
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastestTime) {
                //Update second fastest
                secondFastestTime = fastestTime;
                secondFastestIndex = fastestIndex;
                
                //Update fastest
                fastestTime = times[i];
                fastestIndex = i;
            } else if (times[i] < secondFastestTime) {
                //Update second fastest if better than current second fastest
                secondFastestTime = times[i];
                secondFastestIndex = i;
            }
        }
        //Print the results
        System.out.println("Fastest runner: "+ names[fastestIndex] +"-"+ fastestTime + "minutes");
        System.out.println("Second fastest runner: " + names[secondFastestIndex] + " - " + secondFastestTime + " minutes");
    }
}
