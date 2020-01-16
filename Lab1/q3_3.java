import java.util.*;

public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		// Your code here
		int arr[]= new int[11];
		int i=0;
		while (i< arr.length){
			if (i==indexToInsert){
				arr[i] = valueToInsert;
				i= i+2;
			}
			else i++;
		return arr;
	}

	public static void main(String[] args){
		// Your code here
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array before insertion:");
		for (int i=0; i<arr1.length ; i++){
			System.out.println(arr1[i]);
		}
		int index= 4;
		int value= 56;
		int arr2[] = insertIntoArray(arr1,index,value);
		System.out.println("Array after insertion of " +Integer.toString(value)
				   +" position " + Integer.toString(index) );
		for (int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}	
	}
}
