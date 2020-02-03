
/**
 * The class <b>TicTacToeGame</b> is the
 * class that implements the Tic Tac Toe Game.
 * It contains the grid and tracks its progress.
 * It automatically maintain the current state of
 * the game as players are making moves.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */
public class TicTacToeGame {

// FINISH THE VARIABLE DECLARATION
   /**
	* The board of the game, stored as a one dimension array.
	*/
	CellValue[] board;

   /**
	* level records the number of rounds that have been
	* played so far.
	*/
	int level;

   /**
	* gameState records the current state of the game.
	*/
	GameState gameState;

   /**
	* lines is the number of lines in the grid
	*/
	int lines;

   /**
	* columns is the number of columns in the grid
	*/
	int columns;


   /**
	* sizeWin is the number of cell of the same type
	* that must be aligned to win the game
	*/
	int sizeWin;


   /**
	* default constructor, for a game of 3x3, which must
	* align 3 cells
	*/
	public TicTacToeGame(){
		lines = 3;
		columns = 3;
		sizeWin =3;
		level= 0;

		gameState = GameState.PLAYING;
		board = new CellValue[9];

		for (int i=0; i<9;i++){
			board[i] = CellValue.EMPTY;
		}

	}

   /**
	* constructor allowing to specify the number of lines
	* and the number of columns for the game. 3 cells must
	* be aligned.
   	* @param lines
    *  the number of lines in the game
    * @param columns
    *  the number of columns in the game
  	*/
	public TicTacToeGame(int lines, int columns){
		this.lines = lines;
		this.columns= columns;
		sizeWin = 3;
		level=0;

		gameState = GameState.PLAYING;
		this.board = new CellValue[lines*columns];
		for (int i=0; i< (lines*columns) ; i++){
			board[i] = CellValue.EMPTY;
		}

	}

   /**
	* constructor allowing to specify the number of lines
	* and the number of columns for the game, as well as
	* the number of cells that must be aligned to win.
   	* @param lines
    *  the number of lines in the game
    * @param columns
    *  the number of columns in the game
    * @param sizeWin
    *  the number of cells that must be aligned to win.
  	*/
	public TicTacToeGame(int lines, int columns, int sizeWin){
		this.lines= lines;
		this.columns= columns;
		this.sizeWin = sizeWin;
		level = 0;

		gameState = GameState.PLAYING;
		board= new CellValue[lines*columns];
		for (int i=0; i<(lines*columns);i++){
			board[i] = CellValue.EMPTY;
		}

	}
   /**
	* getter for the variable lines
	* @return
	* 	the value of lines
	*/
	public int getLines(){
		return lines;
	}

   /**
	* getter for the variable columns
	* @return
	* 	the value of columns
	*/
	public int getColumns(){
		return columns;
	}

   /**
	* getter for the variable level
	* @return
	* 	the value of level
	*/
	public int getLevel(){
		return level;
	}

  	/**
	* getter for the variable sizeWin
	* @return
	* 	the value of sizeWin
	*/
	public int getSizeWin(){
		return sizeWin;
	}

   /**
	* getter for the variable gameState
	* @return
	* 	the value of gameState
	*/
	public GameState getGameState(){
		return gameState;
	}

   /**
	* returns the cellValue that is expected next,
	* in other word, which played (X or O) should
	* play next.
	* This method does not modify the state of the
	* game.
	* @return
    *  the value of the enum CellValue corresponding
    * to the next expected value.
  	*/
	public CellValue nextCellValue(){
		if (level%2==0) return CellValue.X;
		else return CellValue.O;
	}

   /**
	* returns the value  of the cell at
	* index i.
	* If the index is invalid, an error message is
	* printed out. The behaviour is then unspecified
   	* @param i
    *  the index of the cell in the array board
    * @return
    *  the value at index i in the variable board.
  	*/
	public CellValue valueAt(int i) {
		return board[i];
	}

   /**
	* This method is called when the next move has been
	* decided by the next player. It receives the index
	* of the cell to play as parameter.
	* If the index is invalid, an error message is
	* printed out. The behaviour is then unspecified
	* If the chosen cell is not empty, an error message is
	* printed out. The behaviour is then unspecified
	* If the move is valide, the board is updated, as well
	* as the state of the game.
	* To faciliate testing, is is acceptable to keep playing
	* after a game is already won. If that is the case, the
	* a message should be printed out and the move recorded.
	* the  winner of the game is the player who won first
   	* @param i
    *  the index of the cell in the array board that has been
    * selected by the next player
  	*/
	public void play(int i) {
		if (i>= board.length || i<0){
			System.out.println("Value should be between " +
			(board.length - (board.length-1))+" and "+board.length);
		}
		else if (valueAt(i) != CellValue.EMPTY){
			System.out.println("The cell has already been played");
		}
		else if (valueAt(i) == CellValue.EMPTY){
			if (level%2==0) {
				board[i] = CellValue.X;
				nextCellValue();
				setGameState(i);
				level++;
			}
			else {
				board[i]= CellValue.O;
				nextCellValue();
				setGameState(i);
				level++;
			}
		}

	}


   /**
	* A helper method which updates the gameState variable
	* correctly after the cell at index i was just set in
	* the method play(int i)
	* The method assumes that prior to setting the cell
	* at index i, the gameState variable was correctly set.
	* it also assumes that it is only called if the game was
	* not already finished when the cell at index i was played
	* (i.e. the game was playing). Therefore, it only needs to
	* check if playing at index i has concluded the game, and if
	* set the oucome correctly
	*
   	* @param i
    *  the index of the cell in the array board that has just
    * been set
  	*/
	private void setGameState(int i){

		CellValue topRight = valueAt(i);
		int topRightCell=1;

		CellValue topLeft = valueAt(getColumns());

		//Win row
		//Win column
		//Win diagonal
		
	}
   /**
	* Returns a String representation of the game matching
	* the example provided in the assignment's description
	*
   	* @return
    *  String representation of the game
  	*/
	public String toString(){
		CellValue[][] arr = new CellValue[lines][columns];
		for (int i=0; i< lines;i++ ){
			for (int j=0; j< columns ; j++){
				arr[i][j] = board[(lines*j)+i];
				}
		}

		int temp=0;
		String res= "";

		for (int i=0; i< lines; i++){
			res+="\n";
			for (int j=0; j<columns; j++){
				temp+=1;
				if (temp%columns == 0){
					res += arr[j][i] +" ";
				}
				else{
					res += arr[j][i] +"|";
				}
			}
			res+="\n";
			res+= "--".repeat(columns) ;
 		}
		return res;
	}

}
