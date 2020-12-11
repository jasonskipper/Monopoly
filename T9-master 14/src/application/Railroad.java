package application;

import java.lang.Math;

public class Railroad {
	int rent = 25;
	int price = 200;
	boolean mortgage = false;
	String name;
	Player owned;
	
	public Railroad(String name) {
		this.name = name;
	}
	
	
	public void purchase(Player player) {
		owned = player;
		player.setMoney(player.getMoney()-price);
		player.setTotalMoney(player.getTotalMoney()+price);
	}
	
	public Player chargeRent(Player currentPlayer, int mult) {
		if(!mortgage){
			currentPlayer.setMoney((int)(currentPlayer.getMoney()-rent*Math.pow(2, mult)));
			owned.setMoney((int)(owned.getMoney()+rent*Math.pow(2, mult)));
		}
		return owned;
	}
	
	public void mortgageProperty(){
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
}
