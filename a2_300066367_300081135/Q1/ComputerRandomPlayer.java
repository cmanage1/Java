public class ComputerRandomPlayer implements Player{

    public void play(TicTacToeGame game){

        boolean check = false;

    	while(check==false){

        	int choice2 = Utils.generator.nextInt(game.lines*game.columns);

        	if (game.valueAt(choice2) != CellValue.EMPTY){

        		//System.out.println("This cell has already been played");
                ;
        	}

        	else{

        		game.play(choice2);
        		check=true;


        	}

    }

    }
}
