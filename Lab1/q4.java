import java.util.Scanner;

public class VotingRight{

    public static void main(String[] args){

        System.out.println("How old are you? ");
        Scanner input = new Scanner(System.in);
        int age= input.nextInt();

        if (age>=18){
            System.out.println("You have the right to vote!");
        }
        else{
            System.out.println("You have the right to vote in "
            + Integer.toString(18-age) + " years.");
        }
    }
}
