/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feefoapplication;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Luke Tipler
 */


public class YourClass {

    static void getStats(int[] mybigarray) {
                         
        //Median
        
        Arrays.sort(mybigarray); //sorts the array into the numerical order
        if (mybigarray.length % 2 != 0) {
           System.out.println("The median of the data set is: " +  mybigarray[mybigarray.length/2]);
        }
        else{ //uses division by 2.0 to make sure that it casts as double value
           System.out.println("The median of the data set is: " +  (mybigarray[mybigarray.length/2] + mybigarray[mybigarray.length/2-1]) );    
                   }

        System.out.println();
        
        //Mean 
        
        int sum = 0 ;
        for (int n : mybigarray){
            
            sum += n;
        }
        System.out.println("The mean of the data set is: " + ((double)sum/mybigarray.length));
        
        System.out.println();
        
        //Mode
        
        int maxNumber = -1; // Highest number in the set
        int maxApperances = -1; // Most common number
        
        //counting for loop
        for (int i = 0; i < mybigarray.length; i++){
            
            int count = 0;
            
            for (int j = 0; j < mybigarray.length; j++){
                
                if (mybigarray[i] == mybigarray[j]){
                    count++;
                }
            }
            
            if ( count > maxApperances) {
                
                maxNumber = mybigarray[i];
                maxApperances = count;
            }
            
        }
        if (maxApperances != 1){
            System.out.println("The mode of the data set is: " + maxNumber);
        }
        else
            System.out.println("The mode is not valid as no numbers repeat");
        
        System.out.println();
        
        //Range
        
        int min = mybigarray[0];
        
        //finds the last value
        int max = mybigarray[0];
          for(int i=1;i < mybigarray.length;i++){ 
            if(mybigarray[i] > max){ 
               max = mybigarray[i]; 
            } 
        }
          
        //calculates range     
        System.out.println("The range of the data set is: " + (max - min));
        
    }
    
    static void testStats(){
        int[] mybigarray = {1,2,3,4,5}; //Median - 3 Mean - 3 Mode- n/a Range- 4
        System.out.println("Median - 3 Mean - 3 Mode- n/a Range- 4");
        YourClass arrayManipulator = new YourClass(); YourClass.getStats(mybigarray);
        System.out.println(Arrays.toString(mybigarray));
        
    }
    static void testStats2(){
        int[] mybigarray = {1,2,3}; //Median - 2 Mean - 1 Mode- n/a Range- 1
        System.out.println("Median - 2 Mean - 2 Mode- n/a Range- 2");
        YourClass arrayManipulator = new YourClass(); YourClass.getStats(mybigarray);
        System.out.println(Arrays.toString(mybigarray));
            
    
    
}
    static void testStats3(){
        int[] mybigarray = {1,1,1,2,2,3,4,5,6}; //Median - 2 Mean - 2.778 Mode- 1 Range- 5
        System.out.println("Median - 2 Mean - 2.778 Mode- 1 Range- 5");
        YourClass arrayManipulator = new YourClass(); YourClass.getStats(mybigarray);
        System.out.println(Arrays.toString(mybigarray));
            
    
    
}
}

