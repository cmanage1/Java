import java.util.LinkedList;


public class ComputerMenacePlayer extends Player {

	//in contructor make the beads
	//in play manipulate the beads and 
	private LinkedList<LinkedList<MenaceTicTacToeGame>>> allList; 

	public ComputerMenacePlayer(){
		super()

		allGames = new LinkedList<LinkedList<>();


	}

	public void play(TicTacToeGame game){
		
		if (game.getLevel() == game.lines * game.columns) {
			throw new IllegalArgumentException("Game is finished already!");
		}


	}



}