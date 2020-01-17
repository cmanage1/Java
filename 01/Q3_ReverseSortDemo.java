import java.util.*;

public class Q3_ReverseSortDemo {

	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.print(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){

		Arrays.sort(values);
		char temp = 't';
		//Swapping first element with last element
		//for half the array...
		//If there is uneven letters, middle gets ignored
		//which is fine...

		for(int i=0; i < values.length/2 ; i++){
			temp = values[i];
			values[i] = values[values.length -1 -i];
			values[values.length-1-i] = temp;
		}
	}

}
