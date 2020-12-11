package application;

import java.util.ArrayList;

public class Board {
	ArrayList<Property> listOfProperties = new ArrayList<Property>();
	ArrayList<Utility> listOfUtilities = new ArrayList<Utility>();
	ArrayList<Railroad> listOfRailroads = new ArrayList<Railroad>();
	
    public Board(){
    	addAllProperties();
    	addAllUlitities();
    	addAllRailroads();
    }
	//listOfProperties.add(new Property("Virginia Ave", "pink", 160, 12));
	
	
    public void addAllRailroads() {
    	listOfRailroads.add(new Railroad("B&O. Railroad"));
    	listOfRailroads.add(new Railroad("Pennsylvania Railroad"));
    	listOfRailroads.add(new Railroad("Reading Railroad"));
    	listOfRailroads.add(new Railroad("Short Line Railroad"));
    }
    
    
    public void addAllUlitities() {
    	listOfUtilities.add(new Utility("Electric Company"));
    	listOfUtilities.add(new Utility("Water Works"));
    }
    
    
    
    public void addAllProperties() {
    	//PINK
    	listOfProperties.add(new Property("Virginia Ave", "pink", 160, 12, 100, 60, 180, 500, 700, 900));
    	listOfProperties.add(new Property("States Ave", "pink", 140, 10, 100, 50, 150, 450, 625, 750));
    	listOfProperties.add(new Property("St Charles Place", "pink", 140, 10, 100, 50, 150, 450, 625, 750));
    	
    	//LIGHT PURPLE
    	listOfProperties.add(new Property("Oriental Ave", "lightpurple", 100, 6, 50, 30, 90, 270, 400, 550));
    	listOfProperties.add(new Property("Vermont Ave", "lightpurple", 100, 6, 50, 30, 90, 270, 400, 550));
    	listOfProperties.add(new Property("Connecticut Ave", "lightpurple", 120, 8, 50, 40, 100, 300, 450, 600));
    	
    	//YELLOW
    	listOfProperties.add(new Property("Ventnor Ave", "yellow", 260, 22, 150, 110, 330, 800, 975, 1150));
    	listOfProperties.add(new Property("Atlantic Ave", "yellow", 260, 22, 150, 110, 330, 800, 975, 1150));
    	listOfProperties.add(new Property("Marvin Gardens", "yellow", 280, 24, 150, 120, 360, 850, 1025, 1200));
    	
    	//DARK BLUE
    	listOfProperties.add(new Property("Boardwalk", "darkblue", 400, 50, 200, 200, 600, 1400, 1700, 2000));
    	listOfProperties.add(new Property("Park Place", "darkblue", 350, 35, 200, 175, 500, 1100, 1300, 1500));
    	
    	//ORANGE
    	listOfProperties.add(new Property("St James Place", "orange", 180, 14, 100, 70, 200, 550, 750, 950));
    	listOfProperties.add(new Property("Tennessee Ave", "orange", 180, 14, 100, 70, 200, 550, 750, 950));
    	listOfProperties.add(new Property("New York Ave", "orange", 200, 16, 100, 80, 220, 600, 800, 1000)); //CHECK ONLINE
    	
    	//GREEN
    	listOfProperties.add(new Property("Pacific Ave", "green", 300, 26, 200, 130, 390, 900, 1100, 1275));
    	listOfProperties.add(new Property("Pennsylvania Ave", "green", 320, 28, 200, 150, 450, 1000, 1200, 1400));
    	listOfProperties.add(new Property("North Carolina Ave", "green", 300, 26, 200, 130, 390, 900, 1100, 1275));
    	
    	//DARK PURPLE
    	listOfProperties.add(new Property("Baltic Ave", "darkpurple", 60, 4, 50, 20, 60, 180, 320, 450));
    	listOfProperties.add(new Property("Mediterranean Ave", "darkpurple", 60, 2, 50, 10, 30, 90, 160, 250));
    	
    	//RED
    	listOfProperties.add(new Property("Indiana Ave", "red", 220, 18, 150, 90, 250, 700, 875, 1050));
    	listOfProperties.add(new Property("Kentucky Ave", "red", 220, 18, 150, 90, 250, 700, 875, 1050));
    	listOfProperties.add(new Property("Illinois Ave", "red", 240, 20, 150, 100, 300, 750, 925, 1050));
    }
    
    
    public ArrayList<Property> getPropertyList(){
    	return listOfProperties;
    }
    
    public Property indexOfProperty(String propertyName) {
    	for(int i = 0; i < listOfProperties.size(); i++) {
    		if(listOfProperties.get(i).name.equals(propertyName)) {
    			return listOfProperties.get(i);
    		}
    	}
    	return null;
    }
    
    public Utility indexOfUtility(String utilityName) {
    	for(int i = 0; i < listOfUtilities.size(); i++) {
    		if(listOfUtilities.get(i).name.equals(utilityName)) {
    			return listOfUtilities.get(i);
    		}
    	}
    	return null;
    }
    
    public ArrayList<Railroad> getRailroadList(){
    	return listOfRailroads;
    }
    
    
    
    public Railroad indexOfRailroad(String railroadName) {
    	for(int i = 0; i < listOfRailroads.size(); i++) {
    		if(listOfRailroads.get(i).name.equals(railroadName)) {
    			return listOfRailroads.get(i);
    		}
    	}
    	return null;
    }
    
    public ArrayList<Utility> getUtilityList(){
    	return listOfUtilities;
    }
    
    
    
    public String whatsInBox(int boxLocation, Player player) {
    	if(boxLocation == 0) {
    		//STARTING POSITION, WILL NEVER REACH.
    	}else if(boxLocation == 1) {
    		return "Mediterranean Ave";
    		
    	}else if(boxLocation == 2) {
    		return "Community Chest";
    	}else if(boxLocation == 3) {
    		return "Baltic Ave";
    		
    	}else if(boxLocation == 4) {
//    		player.setMoney(player.getMoney()-200);
    		return "Income Tax";
    	}else if(boxLocation == 5) {
    		return "Reading Railroad";
    	}else if(boxLocation == 6) {
    		return "Oriental Ave";
    		
    	}else if(boxLocation == 7) {
    		return "Chance";
    	}else if(boxLocation == 8) {
    		return "Vermont Ave";
    		
    	}else if(boxLocation == 9) {
    		return "Connecticut Ave";
    		
    	}else if(boxLocation == 10) {
    		return "Visting";
    	}else if(boxLocation == 11) {
    		return "St Charles Place";
    		
    	}else if(boxLocation == 12) {
    		return "Electric Company";
    	}else if(boxLocation == 13) {
    		return "States Ave";
    		
    	}else if(boxLocation == 14) {
    		return "Virginia Ave";
    		
    	}else if(boxLocation == 15) {
    		return "Pennsylvania Railroad";
    	}else if(boxLocation == 16) {
    		return "St James Place";
    		
    	}else if(boxLocation == 17) {
    		return "Community Chance";
    	}else if(boxLocation == 18) {
    		return "Tennessee Ave";
    		
    	}else if(boxLocation == 19) {
    		return "New York Ave";
    		
    	}else if(boxLocation == 20) {
    		return "Free Parking";
    	}else if(boxLocation == 21) {
    		return "Kentucky Ave";
    		
    	}else if(boxLocation == 22) {
    		return "Chance";
    	}else if(boxLocation == 23) {
    		return "Indiana Ave";
    		
    	}else if(boxLocation == 24) {
    		return "Illinois Ave";
    		
    	}else if(boxLocation == 25) {
    		return "B&O. Railroad";
    	}else if(boxLocation == 26) {
    		return "Atlantic Ave";
    		
    	}else if(boxLocation == 27) {
    		return "Ventmore Ave";
    		
    	}else if(boxLocation == 28) {
    		return "Water Works";
    	}else if(boxLocation == 29) {
    		return "Marvin Gardens";
    		
    	}else if(boxLocation == 30) {
    		return "GO TO JAIL";
    	}else if(boxLocation == 31) {
    		return "Pacific Ave";
    		
    	}else if(boxLocation == 32) {
    		return "North Carolina Ave";
    		
    	}else if(boxLocation == 33) {
    		return "Community Chest";
    	}else if(boxLocation == 34) {
    		return "Pennsylvania Ave";
    		
    	}else if(boxLocation == 35) {
    		return "Short Line Railroad";
    	}else if(boxLocation == 36) {
    		return "Chance";
    	}else if(boxLocation == 37) {
    		return "Park Place";
    		
    	}else if(boxLocation == 38) {
    		player.setMoney(player.getMoney()-75);
    		return "Luxury Tax";
    	}else if(boxLocation == 39) {
    		return "Boardwalk";
    		
    	}else if(boxLocation == 40) {
    		return "GO";
    	}
    	return "";
    }
    
}
