import java.io.*;
import java.util.*;


public class MyTesting{

    public static void main(String[] args){
        //TESTING Rotate
        int [] testArray = new int[]{1,2,3,4,5,6,7,8,9};

        String stringArray = Arrays.toString(testArray);
        /*System.out.println("Original Array: " + stringArray);


        System.out.println("Now testing rotatefunction R");
        Utils.rotate(3,3,testArray);
        stringArray = Arrays.toString(testArray);
        System.out.println("Rotated Array: " + stringArray);


        System.out.println("Now testing rotate function RR");
        Utils.rotate(3,3,testArray);
        stringArray = Arrays.toString(testArray);
        System.out.println("Rotated Array: " + stringArray);


        System.out.println("Now testing function RRR");
        Utils.rotate(3,3,testArray);
        stringArray = Arrays.toString(testArray);
        System.out.println("Rotated Array: " + stringArray);


        System.out.println("Now testing function H ");
        Utils.rotate(3,3,testArray);
        stringArray = Arrays.toString(testArray);
        System.out.println("Rotated Array: " + stringArray);
        */

        testArray = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; //4x4
        stringArray = Arrays.toString(testArray);
        System.out.println("Original Array: " + stringArray);

        System.out.println("Now testing function H ");
        Utils.horizontalFlip(4,4,testArray);
        stringArray = Arrays.toString(testArray);
        System.out.println("Fliped Across H axis Array: " + stringArray);


    }


}
