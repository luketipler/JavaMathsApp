/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feefoapplication;

import static feefoapplication.YourClass.testStats;
import static feefoapplication.YourClass.testStats2;
import static feefoapplication.YourClass.testStats3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
        
        
public class FeefoApplication {
    

    

    public static void main(String[] args) {
        Scanner arraySize = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter array size ");
        int size = arraySize.nextInt();  // Read user input
        int[] mybigarray = generateSomeHugeArray(size);// {1,2,3,4,5,6,7,7,7,8,9,7}; 
        YourClass arrayManipulator = new YourClass(); YourClass.getStats(mybigarray);
        System.out.println(Arrays.toString(mybigarray));
        
        //test classes
        System.out.println("Test classes");
        testStats();
        System.out.println();
        testStats2();
        System.out.println();
        testStats3();

        
    }

    private static int[] generateSomeHugeArray(int size) {
        Random r = new Random();
        // can make the size if you want
        int[] data = new int[size];
        for(int i = 0 ; i < data.length; i++){
            int n = r.nextInt(101);
            data[i] = n;
        }
        return data;
    }
    
    


        
        
    }
    
   
    


    
