import java.util.LinkedList;

public class ListOfGamesGenerator {


   /**
	* generates all different games for the specified
	* parameters. Each game is recorded only once.
	* once a game is finished, it is not extended further
	* @param lines
    *  the number of lines in the game
    * @param columns
    *  the number of columns in the game
    * @param sizeWin
    *  the number of cells that must be aligned to win.
    * @return
    * a list of lists of game instances, ordered by levels
  	*/
	public static LinkedList<LinkedList<TicTacToeGame>> generateAllGames(int lines, int columns, int winLength){

		LinkedList<LinkedList<TicTacToeGame>> res= new LinkedList<LinkedList<TicTacToeGame>>();


		for (int i=0; i<= lines*columns; i++){
			LinkedList<TicTacToeGame> games= new LinkedList<TicTacToeGame>();
			TicTacToeGame baseGame = new TicTacToeGame(lines, columns, winLength);

			for (int j=0; j< (lines*columns); j++){

				TicTacToeGame currentGame = new TicTacToeGame(baseGame, j);
				//System.out.println(currentGame);

				games.add(currentGame);

			}
			//System.out.println("This is the end of level" + Integer.toString(i) );
			res.add(games);
		}

		return res;
	}
}
