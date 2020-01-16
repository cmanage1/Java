import java.util.*;

public class Q6{
	public static void main(String[] args){

		double grades[]= new double[10];
		Scanner input= new Scanner(System.in);
		for (int i=0; i< 10; i++){
			grades[i] = input.nextDouble();
		}

		System.out.println("Average: " + Double.toString(calculateAverage(grades))
		+ "\nMedian: " +Double.toString(calculateMedian(grades))
		+ "\nNumber Failed: " + Integer.toString(calculateNumberFailed(grades))
		+ "\nNumber Passed: " + Integer.toString(calculateNumberPassed(grades)));

	}

	public static double calculateAverage(double[] notes){
		double num=0.0;
		for (int i=0; i< notes.length; i++){
			num+= notes[i];
		}
		return num/notes.length;
	}

	public static double calculateMedian(double[] notes){
		boolean sorted = false;
		double temp;
		//typical bubble sort
		while (sorted!= true){
			sorted = true;
			for (int i=0; i<notes.length-1 ; i++){
				if (notes[i] > notes[i+1]){
					temp = notes[i];
					notes[i] = notes[i+1];
					notes[i+1]=temp;
					sorted = false;
				}
			}
		}
		//using 5th and 6th element to calculate mean
		return (notes[4] + notes[5])/2 ;

	}

	public static int calculateNumberFailed(double[] notes){
		int counter=0;
		for (int i=0; i< notes.length;i++){
			if (notes[i] <50.0) counter++;
		}
		return counter;
	}

	public static int calculateNumberPassed(double[] notes){
		int counter=0;
		for (int i=0; i< notes.length;i++){
			if (notes[i] >=50.0) counter++;
		}
		return counter;
	}
}
