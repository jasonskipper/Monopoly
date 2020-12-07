package pa3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Dice;
import application.Player;
import application.Property;
import application.Railroad;
import application.Utility;


public class TestCases {

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
