import java.util.*;

public class Q2{

	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
        int i= input.nextInt();
        if (i% 5 == 0 && i %3 == 0){
            System.out.println("FizzBuzz");
        }
        else if ( i % 5 ==0){
            System.out.println("Buzz");
        }

	}

}
