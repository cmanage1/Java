import java.io.*;
import java.util.*;


public class MyTesting{

    public static void main(String[] args){

        int lines; int columns;
        int[] testArray;
        
        //**************************TESTING ROTATE******************************************* 
        //TEST 2 AND 2
        lines =2; columns=2;
        testArray = new int[lines*columns];
    	for(int i = 0 ; i < testArray.length; i++){
    		testArray[i] = i;
        }
        for (int i = 0; i < 4; i++) {
            Utils.rotate(lines, columns, testArray);
            System.out.println("ROT => " + java.util.Arrays.toString(testArray));
        }

        //test(2,3); NOT APPLICABLE
        //TEST 3 AND 3
        lines =3; columns=3;
        testArray = new int[lines*columns];
    	for(int i = 0 ; i < testArray.length; i++){
    		testArray[i] = i;
        }
        for (int i = 0; i < 4; i++) {
            Utils.rotate(lines, columns, testArray);
            System.out.println("ROT => " + java.util.Arrays.toString(testArray));
        }
        //3 By 3 works for whatever reason, probably cuz it was designed for 3x3

        
    	//test(4,3); NOT APPLICABLE
        //TEST 4 AND 4
        lines= 4; columns=4;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        for (int i = 0; i < 4; i++) {
            Utils.rotate(lines, columns, testArray);
            System.out.println("ROT => " + java.util.Arrays.toString(testArray));
        }

        
        /*
        //**********************TESTING V FLIP********************************************************* 
        // TEST 2 AND 2
        lines = 2;
        columns = 2;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));

        // test(2,3); NOT APPLICABLE
        lines = 2;
        columns = 3;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));

        // TEST 3 AND 3
        lines = 3;
        columns = 3;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));

        // test(4,3); NOT APPLICAble
        lines = 4;
        columns = 3;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));

        // TEST 4 AND 4
        lines = 4;
        columns = 4;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));
        Utils.verticalFlip(lines, columns, testArray);
        System.out.println("VF => " + java.util.Arrays.toString(testArray));
        
        // **********************TESTING H FLIP********************************************************
        // TEST 2 AND 2
        lines = 2;
        columns = 2;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));

        // test(2,3); NOT APPLICABLE
        lines = 2;
        columns = 3;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));

        // TEST 3 AND 3
        lines = 3;
        columns = 3;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));

        // test(4,3); NOT APPLICAble
        lines = 4;
        columns = 3;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));

        // TEST 4 AND 4
        lines = 4;
        columns = 4;
        testArray = new int[lines * columns];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));
        Utils.horizontalFlip(lines, columns, testArray);
        System.out.println("HF => " + java.util.Arrays.toString(testArray));
        */
    }


}
