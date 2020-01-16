import java.util.*;

public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		// Your code here
		int newArray[]= new int[beforeArray.length+1];
		int i=0;
		while (i< newArray.length){
			if (i==indexToInsert){
				newArray[i] = valueToInsert;
				i= i+2;
			}
			else{
			newArray[i] = beforeArray[i];
			i++;
			}
		}
		return newArray;
	}

	public static void main(String[] args){
		// Your code here
		int arr1[]= {1,5,4,7,9,6};
		System.out.println("Array before insertion:");
		for (int i=0; i<arr1.length ; i++){
			System.out.println(arr1[i]);
		}
		int index= 3;
		int value= 15;
		int arr2[] = insertIntoArray(arr1,index,value);
		System.out.println("Array after insertion of " +Integer.toString(value)
				   +" position " + Integer.toString(index) );
		for (int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}	
	}
}
