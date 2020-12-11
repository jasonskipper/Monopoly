package application;
import java.util.ArrayList;

import javafx.scene.image.ImageView;  
public class Player {

	ArrayList<Property> listOfProperties = new ArrayList<Property>();
	ArrayList<Railroad> listOfRailroads = new ArrayList<Railroad>();
	ArrayList<Utility> listOfUtilities = new ArrayList<Utility>();
	
	int money = 1500;
	int totalMoney; // Just the value of everything owned.
	String shape;
	ImageView playerImage = new ImageView();
	int boxLocation;
	
	boolean isInJail;
	int jailTurns;
	
	
	public Player(String shape){
		this.shape = shape;
	}
	
	public int getJailTurns() {
		return jailTurns;
	}
	public void setJailTurns(int turns) {
		jailTurns = turns;
	}
	
	public boolean getIsInJail() {
		return isInJail;
	}
	public void setIsInJail(boolean inJail) {
		isInJail = inJail;
	}
	
	public int getProperty() {
		return listOfProperties.size();
	}
	
	public void addProperty(Property property) {
		listOfProperties.add(property);
		
	}
	
	public void addRailroad(Railroad railroad) {
		listOfRailroads.add(railroad);
	}
	
	public int getRailroad(){
		return listOfRailroads.size();	
	}
	
	public void addUtility(Utility utility) {
		listOfUtilities.add(utility);
	}
	
	public int getUtility(){
		return listOfUtilities.size();	
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public ImageView getPlayerImage() {
		return playerImage;
	}
	
	public void setPlayerImage(ImageView playerImage) {
		this.playerImage = playerImage;
	}
	
	public int getBoxLocation() {
		return boxLocation;
	}
	
	public void setBoxLocation(int boxLoc) {
		if(boxLoc>40) {
			boxLoc = boxLoc - 40;
			money += 200;
		}
		
		boxLocation = boxLoc;
		System.out.println(boxLocation);
//		boxLocation = 30;
	}
	
	public int getNetWorth() {
		return money + totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	
}
