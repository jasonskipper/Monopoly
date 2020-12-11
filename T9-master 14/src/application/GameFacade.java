

package application;

import java.util.ArrayList;

	public class GameFacade {
		private ArrayList<Player> playerList;
		private Board board;
		private Dice diceOne;
		private Dice diceTwo;
		
		public GameFacade(){
			playerList = new ArrayList<Player>();
			board = new Board();
			diceOne = new Dice();	
			diceTwo = new Dice();
		}
		
		
		public void createPlayer(String shape) {
			playerList.add(new Player(shape));
		}
		
		public Player getPlayer(int index) {
			return playerList.get(index);
		}
		
		public ArrayList<Player> getPlayerList(){
			return playerList;
		}
		
		public Board getBoard() {
			return board;
		}
		
		public Dice getDiceOne() {
			return diceOne;
		}
		
		public Dice getDiceTwo() {
			return diceTwo;
		}

		
	}


