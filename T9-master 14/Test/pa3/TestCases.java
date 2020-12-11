package pa3;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import application.Board;
import application.Dice;
import application.GameFacade;
import application.Player;
import application.Property;
import application.Railroad;
import application.Utility;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class TestCases {

	
		@Test
		void testFacadeClass() {
			GameFacade facade = new GameFacade();
			assertEquals(facade.getBoard().getUtilityList().size(), 2);
			
			facade.createPlayer("Triangle");
			assertEquals(facade.getPlayer(0).getShape(), "Triangle");
		}
		
	
	
		@Test
		void testPropertyRent() {
			Player player = new Player("Triangle");
			Player playerTwo = new Player("Square");
			
			Property property = (new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900));
			property.purchase(player);
			
			property.chargeRent(playerTwo);
			
			assertEquals(player.getMoney(), 1352);
			assertEquals(playerTwo.getMoney(), 1488);
			
			property.mortgageProperty();
			assertEquals(player.getMoney(), 1432);
			
			property.upgradeRent();
			assertEquals(player.getMoney(), 1332);
			
			property.upgradeRent();
			assertEquals(player.getMoney(), 1232);
			
			property.upgradeRent();
			assertEquals(player.getMoney(), 1132);
			
			property.upgradeRent();
			assertEquals(player.getMoney(), 1032);
			
			property.upgradeRent();
			assertEquals(player.getMoney(), 932);
		}
		
		
		@Test
		void testUtilityRent() {
			Player player = new Player("Triangle");
			Player playerTwo = new Player("Square");
			
			Utility property = (new Utility("Electric Company"));
			property.purchase(player);
			
			property.chargeRent(playerTwo, 2, 5);
			
			assertEquals(player.getMoney(), 1400);
			assertEquals(playerTwo.getMoney(), 1450);
			
			property.chargeRent(playerTwo, 1, 5);
			
			assertEquals(player.getMoney(), 1420);
			assertEquals(playerTwo.getMoney(), 1430);
			
			property.mortgageProperty();
			assertEquals(player.getMoney(), 1495);
			
			assertEquals(property.getPlayer(),player);
			
		}
		
		
		@Test
		void testRailroadRent() {
			Player player = new Player("Triangle");
			Player playerTwo = new Player("Square");
			
			assertEquals(player.getNetWorth(), 1500);
			
			  int operatingSystem = System.getProperty("os.name").toLowerCase().indexOf("win");
			  //Decide what slashes we are using.
			  String slashes;
			  if(operatingSystem == 0) {	//USER IS ON WINDOWS OPERATING SYSTEM
				  slashes = "\\";
			  }else {
				  slashes = "/";
			  }
			  
			  Image triangle = null;

			  try {
				  triangle =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"triangle.png"));
			  } catch (FileNotFoundException e) {
				e.printStackTrace();
			  }
			  
			  ImageView imageview = new ImageView(triangle);
			  player.setPlayerImage(imageview);
			  assertEquals(player.getPlayerImage(), imageview);
			
			  
			  
			
			Railroad property = (new Railroad("B&O. Railroad"));
			property.purchase(player);
			
			property.chargeRent(playerTwo, 1);
			
			assertEquals(player.getMoney(), 1350);
			assertEquals(playerTwo.getMoney(), 1450);
			
			
			property.mortgageProperty();
			assertEquals(player.getMoney(), 1450);
			
			assertEquals(property.getPlayer(),player);
			
		}
	
		@Test
		void getAddPropertyUtilityRailroad() {
			Player player = new Player("Triangle");
			
			Property property = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
			Utility utility = new Utility("Electric Company");
			Railroad railroad = new Railroad("B&O. Railroad");
			
			player.addProperty(property);
			player.addUtility(utility);
			player.addRailroad(railroad);
			
			assertEquals(player.getProperty(), 1);
			assertEquals(player.getUtility(), 1);
			assertEquals(player.getRailroad(), 1);
			
		}
		
	
		@Test
		void testAddAndGetAllRailroadsPropertyUtility() {
			Board board = new Board();
			board.getRailroadList().clear();
			board.getRailroadList().add(new Railroad("B&O. Railroad"));
			board.getRailroadList().add(new Railroad("Pennsylvania Railroad"));
			
			board.getUtilityList().clear();
			board.getUtilityList().add(new Utility("Electric Company"));
			board.getUtilityList().add(new Utility("Water Works"));
			
			board.getPropertyList().clear();
			board.getPropertyList().add(new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900));
			board.getPropertyList().add(new Property("States Ave", "pink", 140, 10, 100, 50, 150, 450, 625, 750));
	    	
			System.out.println(board.getRailroadList().size());
			
			assertEquals(board.getRailroadList().size(), 2);
			assertEquals(board.getUtilityList().size(), 2);
			assertEquals(board.getPropertyList().size(), 2);
			
	    	assertEquals(board.indexOfRailroad("B&O. Railroad").getName(), "B&O. Railroad");
	    	assertEquals(board.indexOfUtility("Electric Company").getName(), "Electric Company");
	    	assertEquals(board.indexOfProperty("Virginia Ave").getName(), "Virginia Ave");
	    	
	    	Player player = new Player("Triangle");
	    	
	    	assertEquals(board.whatsInBox(0,player), "");
	    	assertEquals(board.whatsInBox(1,player), "Mediterranean Ave");
	    	assertEquals(board.whatsInBox(2,player), "Community Chest");
	    	assertEquals(board.whatsInBox(3,player), "Baltic Ave");
	    	assertEquals(board.whatsInBox(4,player), "Income Tax");
	    	assertEquals(board.whatsInBox(5,player), "Reading Railroad");
	    	assertEquals(board.whatsInBox(6,player), "Oriental Ave");
	    	assertEquals(board.whatsInBox(7,player), "Chance");
	    	assertEquals(board.whatsInBox(8,player), "Vermont Ave");
	    	assertEquals(board.whatsInBox(9,player), "Connecticut Ave");
	    	assertEquals(board.whatsInBox(10,player), "Visting");
	    	assertEquals(board.whatsInBox(11,player), "St Charles Place");
	    	assertEquals(board.whatsInBox(12,player), "Electric Company");
	    	assertEquals(board.whatsInBox(13,player), "States Ave");
	    	assertEquals(board.whatsInBox(14,player), "Virginia Ave");
	    	assertEquals(board.whatsInBox(15,player), "Pennsylvania Railroad");
	    	assertEquals(board.whatsInBox(16,player), "St James Place");
	    	assertEquals(board.whatsInBox(17,player), "Community Chance");
	    	assertEquals(board.whatsInBox(18,player), "Tennessee Ave");
	    	assertEquals(board.whatsInBox(19,player), "New York Ave");
	    	assertEquals(board.whatsInBox(20,player), "Free Parking");
	    	assertEquals(board.whatsInBox(21,player), "Kentucky Ave");
	    	assertEquals(board.whatsInBox(22,player), "Chance");
	    	assertEquals(board.whatsInBox(23,player), "Indiana Ave");
	    	assertEquals(board.whatsInBox(24,player), "Illinois Ave");
	    	assertEquals(board.whatsInBox(25,player), "B&O. Railroad");
	    	assertEquals(board.whatsInBox(26,player), "Atlantic Ave");
	    	assertEquals(board.whatsInBox(27,player), "Ventmore Ave");
	    	assertEquals(board.whatsInBox(28,player), "Water Works");
	    	assertEquals(board.whatsInBox(29,player), "Marvin Gardens");
	    	assertEquals(board.whatsInBox(30,player), "GO TO JAIL");
	    	assertEquals(board.whatsInBox(31,player), "Pacific Ave");
	    	assertEquals(board.whatsInBox(32,player), "North Carolina Ave");
	    	assertEquals(board.whatsInBox(33,player), "Community Chest");
	    	assertEquals(board.whatsInBox(34,player), "Pennsylvania Ave");
	    	assertEquals(board.whatsInBox(35,player), "Short Line Railroad");
	    	assertEquals(board.whatsInBox(36,player), "Chance");
	    	assertEquals(board.whatsInBox(37,player), "Park Place");
	    	assertEquals(board.whatsInBox(38,player), "Luxury Tax");
	    	assertEquals(board.whatsInBox(39,player), "Boardwalk");
	    	assertEquals(board.whatsInBox(40,player), "GO");
	    	
	    	board.getPropertyList().clear();
	    	board.getUtilityList().clear();
	    	board.getRailroadList().clear();
	    	
	    	assertEquals(board.indexOfRailroad("B&O. Railroad"), null);
	    	assertEquals(board.indexOfUtility("Electric Company"), null);
	    	assertEquals(board.indexOfProperty("Virginia Ave"), null);
	    	
	    	
		}
		
	
		@Test
		void testGetNumberDice() {
			Dice diceRoll = new Dice();
			System.out.println(diceRoll.getNumber());
			int numDiceRoll = diceRoll.roll();
			
			if(numDiceRoll == 1) {
				assertEquals(1, numDiceRoll);
			}else if(numDiceRoll == 2) {
				assertEquals(2, numDiceRoll);
			}else if(numDiceRoll == 3) {
				System.out.println("hello");
				assertEquals(3, numDiceRoll);
			}else if(numDiceRoll == 4) {
				assertEquals(4, numDiceRoll);
			}else if(numDiceRoll == 5) {
				assertEquals(5, numDiceRoll);
			}else if(numDiceRoll == 6) {
				assertEquals(6, numDiceRoll);
			}else {
			fail();
			}
		}
		
		@Test
		void testRoll() {
			Dice diceRoll = new Dice();
			if(diceRoll.getNumber() == 1) {
				assertEquals(1, diceRoll.getNumber());
			}else if(diceRoll.getNumber() == 2) {
				assertEquals(2, diceRoll.getNumber());
			}else if(diceRoll.getNumber() == 3) {
				assertEquals(3, diceRoll.getNumber());
			}else if(diceRoll.getNumber() == 4) {
				assertEquals(4, diceRoll.getNumber());
			}else if(diceRoll.getNumber() == 5) {
				assertEquals(5, diceRoll.getNumber());
			}else if(diceRoll.getNumber() == 6) {
				assertEquals(6, diceRoll.getNumber());
			}else {
			fail();
			}
		}
		
		
		@Test
		void testGetSetMoneyPlayer() {
			Player newPlayer = new Player("Circle");
			newPlayer.setMoney(1700);
			assertEquals(1700, newPlayer.getMoney());
		}
	
		
		@Test
		void testGetSetShape() {
			Player newPlayer = new Player("Circle");
			newPlayer.setShape("Triangle");
			assertEquals("Triangle", newPlayer.getShape());
		}
		
		@Test
		void testGetSetBoxLocation() {
			Player newPlayer = new Player("Circle");
			newPlayer.setBoxLocation(5);
			assertEquals(5, newPlayer.getBoxLocation());
			newPlayer.setBoxLocation(41);
			assertEquals(1, newPlayer.getBoxLocation());
		}
	
		@Test
		void testGetSetJailTurns() {
			Player newPlayer = new Player("Circle");
			newPlayer.setJailTurns(2);
			assertEquals(2, newPlayer.getJailTurns());
		}
	
		@Test
		void testGetSetIsInJail() {
			Player newPlayer = new Player("Circle");
			newPlayer.setIsInJail(false);
			assertEquals(false, newPlayer.getIsInJail());
		}
		
		@Test
		void testPurchasePropertyGetPlayer() {
			Player newPlayer = new Player("Circle");
			Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
			newProperty.purchase(newPlayer);
			assertEquals("Circle", newProperty.getPlayer().getShape());
		}
		
		
		@Test
		void testGetSetHouse() {
			Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
			newProperty.setHouseNum(3);
			assertEquals(3, newProperty.getHouseNum());
		}
		
		@Test
		void testGetSetHotels() {
			Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
			newProperty.setHotelNum(1);
			assertEquals(1, newProperty.getHotelNum());
		}
		
		@Test
		void testOwnedByPlayer() {
		Player newPlayer = new Player("Circle");
		Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
		Railroad newRailRoad = new Railroad("Pennsylvania Railroad");
		Utility newUtility = new Utility("Electric Company");
		newProperty.purchase(newPlayer);
		newRailRoad.purchase(newPlayer);
		newUtility.purchase(newPlayer);
		assertEquals(true, newProperty.ownedByPlayer());
		assertEquals(true, newRailRoad.ownedByPlayer());
		assertEquals(true, newUtility.ownedByPlayer());
		
		}
		
		@Test
		void testOwnedByPlayerFalse() {
		Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
		Railroad newRailRoad = new Railroad("Pennsylvania Railroad");
		Utility newUtility = new Utility("Electric Company");
		assertEquals(false, newProperty.ownedByPlayer());
		assertEquals(false, newRailRoad.ownedByPlayer());
		assertEquals(false, newUtility.ownedByPlayer());
		}
		
		@Test
		void testGetPrice() {
		Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
		Railroad newRailRoad = new Railroad("Pennsylvania Railroad");
		Utility newUtility = new Utility("Electric Company");
		assertEquals(160, newProperty.getPrice());
		assertEquals(150, newUtility.getPrice());
		assertEquals(200, newRailRoad.getPrice());
		}
		
		@Test
		void testGetName() {
		Property newProperty = new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900);
		Railroad newRailRoad = new Railroad("Pennsylvania Railroad");
		Utility newUtility = new Utility("Electric Company");

		assertEquals("Virginia Ave", newProperty.getName());
		assertEquals("Pennsylvania Railroad", newRailRoad.getName());
		assertEquals("Electric Company", newUtility.getName());
		}
		

}
