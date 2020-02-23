public class ComputerRandomPlayer implements Player{

    public void play(TicTacToeGame game){

    	while(check==false){

    	int choice2 = generator.nextInt(games.lines*game.columns);

    	if (choice2 < 0 || choice2 >= (games.lines*games.columns)){

    		System.out.println("The value should be between 1 and" + (games.lines*games.columns));

    	}

    	else if (game.valueAt(choice2) != CellValue.EMPTY){

    		System.out println("This cell has already been played");
    	}

    	else{

    		game.play(choice2);
    		check=true;


    	}

    }

    }
}


