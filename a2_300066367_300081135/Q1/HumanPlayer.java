import java.util.*;
public class HumanPlayer implements Player{

    public void play(TicTacToeGame game){


    	/*
    	HumanPlayer is a class which implements the interface Player. In its implementation of the method play, it first
checks that the game is indeed playable (and prints out an error message is that is not the case), and then queries
the user for a valid input, reusing the code that was in the main of the class TicTacToe of assignment 1. Once such
an input has been provided, it plays in on the game and returns.
*/

    	
    	Scanner input = new Scanner(System.in);
    	int choice1 = input.nextInt();
        choice1--;
        boolean check = false;

    	while (check==false){

        	if (choice1 < 0 || choice1 >= (game.lines*game.columns)){

            	System.out.println("The value should be between 1 and " + (game.lines*game.columns));
                break;

            }

            else if (game.valueAt(choice1) != CellValue.EMPTY){

            	System.out.println("This cell has already been played.");
                break;
            }

            else{


            	game.play(choice1);
            	check=true;

            }

        }
    }
}
