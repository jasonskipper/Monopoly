package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Property {

	String name;
	String color;
	int price;
	int rent;
	int rentH1;
	int rentH2;
	int rentH3;
	int rentH4;
	int rentH5;
	int currRent;
	int hPrice;
	int rentLv;
	Player owned;
	boolean mortgage;
	int houses;
	int hotels;
	
//	Image house = null;
//	Image hotel = null;
	  
	
	public Property(String name, String color, int price, int rent, int hPrice, int rentH1, int rentH2, int rentH3, int rentH4, int rentH5){
		this.name = name;
		this.color = color;
		this.price = price;
		this.rent = rent;
		this.rentH1 = rentH1;
		this.rentH2 = rentH2;
		this.rentH3 = rentH3;
		this.rentH4 = rentH4;
		this.rentH5 = rentH5;
		this.hPrice = hPrice;
		this.rentLv = rentLv;
		currRent = rent;
		rentLv = 0;
		mortgage = false;
		
//		 int operatingSystem = System.getProperty("os.name").toLowerCase().indexOf("win");
//		  //Decide what slashes we are using.
//		  String slashes;
//		  if(operatingSystem == 0) {	//USER IS ON WINDOWS OPERATING SYSTEM
//			  slashes = "\\";
//		  }else {
//			  slashes = "/";
//		  }
//		
//		try {
//			house =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"house.png"));
//			hotel =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"hotel.png"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		ImageView houseView = new ImageView(house);
//	    ImageView hotelView = new ImageView(hotel);
	}
	
	
	public void purchase(Player player) {
		owned = player;
		player.setMoney(player.getMoney()-price);
		player.setTotalMoney(player.getTotalMoney()+price);
	}
	
	Player chargeRent(Player currentPlayer) {
		if(!mortgage){
			currentPlayer.setMoney(currentPlayer.getMoney()-currRent);
			owned.setMoney(owned.getMoney()+currRent);
			System.out.println(currentPlayer.getMoney());
			System.out.println(owned.getMoney());
			System.out.println("RENTED!~!!!@#@!@#!@!@!@#");
		}
		return owned;
	}
	
	public int getHouseNum() {
		return houses;
	}
	
	public void setHouseNum(int num) {
		houses=num;
	}
	
	public int getHotelNum() {
		return hotels;
	}
	
	public void setHotelNum(int num) {
		hotels=num;
	}
	
	void mortgageProperty(){
		mortgage = true;
		owned.setMoney(owned.getMoney()+price/2);
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean ownedByPlayer() {
		if(owned!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	public Player getPlayer() {
		return owned;
	}
	
	void upgradeRent() {
		switch(rentLv){
			case 0:
				currRent = rentH1;
				rentLv++;
				break;
			case 1:
				currRent = rentH2;
				rentLv++;
				break;
			case 2:
				currRent = rentH3;
				rentLv++;
				break;
			case 3:
				currRent = rentH4;
				rentLv++;
				break;
			case 4:
				currRent = rentH5;
				rentLv++;
				break;
			case 5:
				break;
		}
		owned.setMoney(owned.getMoney()-hPrice);				
	}
	
	
	
}
