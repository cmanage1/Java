import java.io.*;
import java.lang.*;
import java.util.*;

public class Q3_SquareArray{

	public static int[] createArray(int size) {
        int arr[]= new int[size];

        for (int i=0; i< size; i++){
            arr[i] = i*i;
        }
        return arr;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int arr[]= createArray(num);

		for (int j=0; j< num; j++){
			System.out.println("The square of "+  Integer.toString(j)
			+ " is: " + Integer.toString(arr[j]));
		}
	}
}
