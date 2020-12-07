package application;

import java.lang.Math;

public class Utility {
	
	boolean mortgage = false;
	String name;
	Player owned;
	int price = 150;
	int rent = 25;
	
	public Utility(String name) {
		this.name = name;
	}
	
	
	public void purchase(Player player) {
		owned = player;
		player.setMoney(player.getMoney()-price);
		player.setTotalMoney(player.getTotalMoney()+price);
	}
	
	Player chargeRent(Player currentPlayer, int mult, int dice) {
		if(!mortgage){
			if(mult < 2){
				currentPlayer.setMoney(currentPlayer.getMoney() - dice * 4);
				owned.setMoney(owned.getMoney() + dice * 4);
			}else{
				currentPlayer.setMoney(currentPlayer.getMoney() - dice * 10);
				owned.setMoney(owned.getMoney() + dice * 10);
			}
		}
		return owned;
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
	
	Player getPlayer() {
		return owned;
	}
	
}
