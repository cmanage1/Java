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
		TicTacToeGame baseGame = new TicTacToeGame(lines, columns, winLength);


		boolean flag = true; //will be false when no playing games can be generated

		int levelCounter = 0;

		while (flag){

			LinkedList<TicTacToeGame> levels= new LinkedList<TicTacToeGame>();
			levels.add(baseGame);

			int i=0;
			while (i< levels.size() ){

				if (baseGame.valueAt(i) == CellValue.EMPTY){
					TicTacToeGame currentGame = new TicTacToeGame(baseGame, i);
					if (!(currentGame.equals(baseGame)) ){
						levels.add(currentGame);
						i++;
					}
				}

			}

			if (levels.size() == 0){
				flag = false;
			}
			else{
				res.add(levels);
				levelCounter++;
			}
		}

		return res;
	}
}
