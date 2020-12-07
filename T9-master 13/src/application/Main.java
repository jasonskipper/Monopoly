package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		playerNumPopUp(primaryStage);
//		try {
		      //Creating an image 
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void setXY(int xone, int yone, ImageView image) {
		image.setX(xone);
		image.setY(yone);
		image.setFitHeight(13); 
		image.setFitWidth(13); 

	}
	
	public static void setXY(int xone, int yone, Text text) {
		text.setX(xone);
		text.setY(yone);

	}
	
	public static void monopolyBoard(Stage primaryStage, ArrayList<Player> playerShapes) {
		
		//Find operating system that user is using so that we can follow a directory path correctly
		  int operatingSystem = System.getProperty("os.name").toLowerCase().indexOf("win");
		  //Decide what slashes we are using.
		  String slashes;
		  if(operatingSystem == 0) {	//USER IS ON WINDOWS OPERATING SYSTEM
			  slashes = "\\";
		  }else {
			  slashes = "/";
		  }
		  
		  //Get all images needed
		  Image boardImage = null;
		  Image square = null;
		  Image diamond = null;
		  Image triangle = null;
		  Image circle = null;

		  try {
			  	square =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"square.png"));
			  	diamond =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"diamond.png"));
			  	triangle =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"triangle.png"));
			  	circle =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"circle.png"));
				boardImage = new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"monopboardv2.png"));
				
				
		  } catch (FileNotFoundException e) {
			e.printStackTrace();
		  }  
	      
	      
	      ImageView boardView = new ImageView(boardImage);
	      ImageView squareView = new ImageView(square); 
	      ImageView diamondView = new ImageView(diamond); 
	      ImageView triangleView = new ImageView(triangle); 
	      ImageView circleView = new ImageView(circle);
	      
	      
	      Image house = null;
	  	  Image hotel = null;
	      
	      
			try {
			house =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"house.png"));
			hotel =new Image(new FileInputStream(System.getProperty("user.dir")+slashes+"src"+slashes+"application"+slashes+"hotel.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		      Group root = new Group(); 
		      
		ArrayList<Text> houseHotelText = new ArrayList<Text>();  
		    
		//BOTTOM
		ImageView houseMediterraneanAveView = new ImageView(house);
	    ImageView hotelMediterraneanAveView = new ImageView(hotel);
	    setXY(710, 750, houseMediterraneanAveView);
	    setXY(710, 730, hotelMediterraneanAveView);
	    
	    Text houseMediterraneanAveText =  new Text("0");
			houseHotelText.add(houseMediterraneanAveText);
	    Text hotelMediterraneanAveText =  new Text("0");
	    	houseHotelText.add(hotelMediterraneanAveText);
	    setXY(730, 763, houseMediterraneanAveText);
	    setXY(730, 743, hotelMediterraneanAveText);

		ImageView houseBalticAveView = new ImageView(house);
	    ImageView hotelBalticAveView = new ImageView(hotel);
	    setXY(610, 750, houseBalticAveView);
	    setXY(610, 730, hotelBalticAveView);
	    
	    Text houseBalticAveText =  new Text("0");
			houseHotelText.add(houseBalticAveText);
	    Text hotelBalticAveText =  new Text("0");
	    	houseHotelText.add(hotelBalticAveText);
	    setXY(630, 763, houseBalticAveText);
		setXY(630, 743, hotelBalticAveText);
	    
	    
		ImageView houseOrientalAveView = new ImageView(house);
	    ImageView hotelOrientalAveView = new ImageView(hotel);
	    setXY(475, 750, houseOrientalAveView);
	    setXY(475, 730, hotelOrientalAveView);
	    
	    Text houseOrientalAveText =  new Text("0");
			houseHotelText.add(houseOrientalAveText);
		Text hotelOrientalAveText =  new Text("0");
			houseHotelText.add(hotelOrientalAveText);
		setXY(495, 763, houseOrientalAveText);
		setXY(495, 743, hotelOrientalAveText);
		    

		ImageView houseVermontAveView = new ImageView(house);
	    ImageView hotelVermontAveView = new ImageView(hotel);
	    setXY(383, 750, houseVermontAveView);
	    setXY(383, 730, hotelVermontAveView);
	    
	    Text houseVermontAveText =  new Text("0");
			houseHotelText.add(houseVermontAveText);
		Text hotelVermontAveText =  new Text("0");
			houseHotelText.add(hotelVermontAveText);
		setXY(403, 763, houseVermontAveText);
		setXY(403, 743, hotelVermontAveText);

	    
	    ImageView houseConnecticutAveView = new ImageView(house);
	    ImageView hotelConnecticutAveView = new ImageView(hotel);
	    setXY(335, 750, houseConnecticutAveView);
	    setXY(335, 730, hotelConnecticutAveView);
	    
	    Text houseConnecticutAveText =  new Text("0");
			houseHotelText.add(houseConnecticutAveText);
		Text hotelConnecticutAveText =  new Text("0");
			houseHotelText.add(hotelConnecticutAveText);
		setXY(355, 763, houseConnecticutAveText);
		setXY(355, 743, hotelConnecticutAveText);

	    
	    
	    //LEFT
		ImageView houseStCharlesPlaceView = new ImageView(house);
	    ImageView hotelStCharlesPlaceView = new ImageView(hotel);
	    setXY(150, 570, houseStCharlesPlaceView);
	    setXY(150, 550, hotelStCharlesPlaceView);
	    
	    Text houseStCharlesPlaceText =  new Text("0");
			houseHotelText.add(houseStCharlesPlaceText);
		Text hotelStCharlesPlaceText =  new Text("0");
			houseHotelText.add(hotelStCharlesPlaceText);
		setXY(135, 583, houseStCharlesPlaceText);
		setXY(135, 563, hotelStCharlesPlaceText);
	    
		ImageView houseStatesAveView = new ImageView(house);
	    ImageView hotelStatesAveView = new ImageView(hotel);
	    setXY(150, 482, houseStatesAveView);
	    setXY(150, 462, hotelStatesAveView);
	    
	    Text houseStatesAveText =  new Text("0");
			houseHotelText.add(houseStatesAveText);
		Text hotelStatesAveText =  new Text("0");
			houseHotelText.add(hotelStatesAveText);
		setXY(135, 495, houseStatesAveText);
		setXY(135, 475, hotelStatesAveText);
	    
		ImageView houseVirginiaAveView = new ImageView(house);
	    ImageView hotelVirginiaAveView = new ImageView(hotel);
	    setXY(150, 440, houseVirginiaAveView);
	    setXY(150, 420, hotelVirginiaAveView);
	    
	    Text houseVirginiaAveText =  new Text("0");
			houseHotelText.add(houseVirginiaAveText);
		Text hotelVirginiaAveText =  new Text("0");
			houseHotelText.add(hotelVirginiaAveText);
		setXY(135, 453, houseVirginiaAveText);
		setXY(135, 433, hotelVirginiaAveText);

		ImageView houseStJamesPlaceView = new ImageView(house);
	    ImageView hotelStJamesPlaceView = new ImageView(hotel);
	    setXY(150, 350, houseStJamesPlaceView);
	    setXY(150, 330, hotelStJamesPlaceView);
	    
	    Text houseStJamesPlaceText =  new Text("0");
			houseHotelText.add(houseStJamesPlaceText);
		Text hotelStJamesPlaceText =  new Text("0");
			houseHotelText.add(hotelStJamesPlaceText);
		setXY(135, 363, houseStJamesPlaceText);
		setXY(135, 343, hotelStJamesPlaceText);
	    
	    ImageView houseTennesseeAveView = new ImageView(house);
	    ImageView hotelTennesseeAveView = new ImageView(hotel);
	    setXY(150, 270, houseTennesseeAveView);
	    setXY(150, 250, hotelTennesseeAveView);
	    
	    Text houseTennesseeAveText =  new Text("0");
			houseHotelText.add(houseTennesseeAveText);
		Text hotelTennesseeAveText =  new Text("0");
			houseHotelText.add(hotelTennesseeAveText);
		setXY(135, 283, houseTennesseeAveText);
		setXY(135, 263, hotelTennesseeAveText);
	    
	    ImageView houseNewYorkAveView = new ImageView(house);
	    ImageView hotelNewYorkAveView = new ImageView(hotel);
	    setXY(150, 230, houseNewYorkAveView);
	    setXY(150, 210, hotelNewYorkAveView);
	    
	    Text houseNewYorkAveText =  new Text("0");
			houseHotelText.add(houseNewYorkAveText);
		Text hotelNewYorkAveText =  new Text("0");
			houseHotelText.add(hotelNewYorkAveText);
		setXY(135, 243, houseNewYorkAveText);
		setXY(135, 223, hotelNewYorkAveText);
	    
		
		
	    //TOP  
		ImageView houseKentuckyAveView = new ImageView(house);
	    ImageView hotelKentuckyAveView = new ImageView(hotel);
	    setXY(335, 57, houseKentuckyAveView);
	    setXY(335, 37, hotelKentuckyAveView);  
	    
	    Text houseKentuckyAveText =  new Text("0");
			houseHotelText.add(houseKentuckyAveText);
		Text hotelKentuckyAveText =  new Text("0");
			houseHotelText.add(hotelKentuckyAveText);
		setXY(355, 68, houseKentuckyAveText);
		setXY(355, 48, hotelKentuckyAveText);
	    
	    ImageView houseIndianaAveView = new ImageView(house);
	    ImageView hotelIndianaAveView = new ImageView(hotel);
	    setXY(430, 57, houseIndianaAveView);
	    setXY(430, 37, hotelIndianaAveView);  
	    
	    Text houseIndianaAveText =  new Text("0");
			houseHotelText.add(houseIndianaAveText);
		Text hotelIndianaAveText =  new Text("0");
			houseHotelText.add(hotelIndianaAveText);
		setXY(450, 68, houseIndianaAveText);
		setXY(450, 48, hotelIndianaAveText);
	    
	    ImageView houseIllinoisAveView = new ImageView(house);
	    ImageView hotelIllinoisAveView = new ImageView(hotel);
	    setXY(475, 57, houseIllinoisAveView);
	    setXY(475, 37, hotelIllinoisAveView);
	    
	    Text houseIllinoisAveText =  new Text("0");
			houseHotelText.add(houseIllinoisAveText);
		Text hotelIllinoisAveText =  new Text("0");
			houseHotelText.add(hotelIllinoisAveText);
		setXY(495, 68, houseIllinoisAveText);
		setXY(495, 48, hotelIllinoisAveText);
	    
	    ImageView houseAtlanticAveView = new ImageView(house);
	    ImageView hotelAtlanticAveView = new ImageView(hotel);
	    setXY(560, 57, houseAtlanticAveView);
	    setXY(560, 37, hotelAtlanticAveView);
	    
	    Text houseAtlanticAveText =  new Text("0");
			houseHotelText.add(houseAtlanticAveText);
		Text hotelAtlanticAveText =  new Text("0");
			houseHotelText.add(hotelAtlanticAveText);
		setXY(580, 68, houseAtlanticAveText);
		setXY(580, 48, hotelAtlanticAveText);
	    
	    ImageView houseVentnorAveView = new ImageView(house);
	    ImageView hotelVentnorAveView = new ImageView(hotel);
	    setXY(610, 57, houseVentnorAveView);
	    setXY(610, 37, hotelVentnorAveView);
	    
	    Text houseVentnorAveText =  new Text("0");
			houseHotelText.add(houseVentnorAveText);
		Text hotelVentnorAveText =  new Text("0");
			houseHotelText.add(hotelVentnorAveText);
		setXY(630, 68, houseVentnorAveText);
		setXY(630, 48, hotelVentnorAveText);
	    
	    ImageView houseMarvinGardensView = new ImageView(house);
	    ImageView hotelMarvinGardensView = new ImageView(hotel);
	    setXY(710, 57, houseMarvinGardensView);
	    setXY(710, 37, hotelMarvinGardensView);
	    
	    Text houseMarvinGardensText =  new Text("0");
			houseHotelText.add(houseMarvinGardensText);
		Text hotelMarvinGardensText =  new Text("0");
			houseHotelText.add(hotelMarvinGardensText);
		setXY(730, 68, houseMarvinGardensText);
		setXY(730, 48, hotelMarvinGardensText);
	    



	    //RIGHT
	    ImageView housePacificAveView = new ImageView(house);
	    ImageView hotelPacificAveView = new ImageView(hotel);
	    setXY(922, 230, housePacificAveView);
	    setXY(922, 210, hotelPacificAveView);
	    
	    Text housePacificAveText =  new Text("0");
			houseHotelText.add(housePacificAveText);
		Text hotelPacificAveText =  new Text("0");
			houseHotelText.add(hotelPacificAveText);
		setXY(942, 240, housePacificAveText);
		setXY(942, 220, hotelPacificAveText);
	    
	    ImageView houseNorthCarolinaAveView = new ImageView(house);
	    ImageView hotelNorthCarolinaAveView = new ImageView(hotel);
	    setXY(922, 270, houseNorthCarolinaAveView);
	    setXY(922, 250, hotelNorthCarolinaAveView);
	    
	    Text houseNorthCarolinaAveText =  new Text("0");
			houseHotelText.add(houseNorthCarolinaAveText);
		Text hotelNorthCarolinaAveText =  new Text("0");
			houseHotelText.add(hotelNorthCarolinaAveText);
		setXY(942, 280, houseNorthCarolinaAveText);
		setXY(942, 260, hotelNorthCarolinaAveText);
	    
		ImageView housePennsylvaniaAveView = new ImageView(house);
	    ImageView hotelPennsylvaniaAveView = new ImageView(hotel);
	    setXY(922, 350, housePennsylvaniaAveView);
	    setXY(922, 330, hotelPennsylvaniaAveView);
	    
	    Text housePennsylvaniaAveText =  new Text("0");
			houseHotelText.add(housePennsylvaniaAveText);
		Text hotelPennsylvaniaAveText =  new Text("0");
			houseHotelText.add(hotelPennsylvaniaAveText);
		setXY(942, 360, housePennsylvaniaAveText);
		setXY(942, 340, hotelPennsylvaniaAveText);

		ImageView houseParkPlaceView = new ImageView(house);
	    ImageView hotelParkPlaceView = new ImageView(hotel);
	    setXY(922, 482, houseParkPlaceView);
	    setXY(922, 462, hotelParkPlaceView);
	    
	    Text houseParkPlaceText =  new Text("0");
			houseHotelText.add(houseParkPlaceText);
		Text hotelParkPlaceText =  new Text("0");
			houseHotelText.add(hotelParkPlaceText);
		setXY(942, 492, houseParkPlaceText);
		setXY(942, 472, hotelParkPlaceText);
	    
		ImageView houseBoardWalkView = new ImageView(house);
	    ImageView hotelBoardWalkView = new ImageView(hotel);
	    setXY(922, 570, houseBoardWalkView);
	    setXY(922, 550, hotelBoardWalkView);
	    
	    Text houseBoardWalkText =  new Text("0");
			houseHotelText.add(houseBoardWalkText);
		Text hotelBoardWalkText =  new Text("0");
			houseHotelText.add(hotelBoardWalkText);
		setXY(942, 580, houseBoardWalkText);
		setXY(942, 560, hotelBoardWalkText);
	    
	    
	   
	    
	      Rectangle players = new Rectangle();
	      //root.getChildren().add(players);
	      //Put the players in the order shapes are chosen on the left side. Player 1 is first, player 2 is second, etc...
		  Text playerOneMoney=new Text("1500");
		  playerOneMoney.setX(70);
		  playerOneMoney.setY(180);
		  Text playerTwoMoney=new Text("1500");
		  playerTwoMoney.setX(70);
		  playerTwoMoney.setY(280);
		  Text playerThreeMoney=new Text("1500");
		  playerThreeMoney.setX(70);
		  playerThreeMoney.setY(380);
		  Text playerFourMoney=new Text("1500");
		  playerFourMoney.setX(70);
		  playerFourMoney.setY(480);
		  
		  
	      int current=0;
	      while(current<playerShapes.size()) {
	    	  if(current == 0) {
	    		  root.getChildren().add(playerOneMoney);
	    		  if(playerShapes.get(current).getShape().equals("square")) {
	    			  playerShapes.get(current).setPlayerImage(new ImageView(square));
	    			  System.out.println(playerShapes.get(0).getShape().equals("square"));
	    			  root.getChildren().add(squareView);
	    			  squareView.setX(70); 
	    			  squareView.setY(130); 
	    		  }else if(playerShapes.get(current).getShape().equals("diamond")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(diamond));
	    			  root.getChildren().add(diamondView);
	    			  diamondView.setX(70); 
	    			  diamondView.setY(130); 
	    		  }else if(playerShapes.get(current).getShape().equals("triangle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(triangle));
	    			  root.getChildren().add(triangleView);
	    			  triangleView.setX(70); 
	    			  triangleView.setY(130); 
	    		  }else if(playerShapes.get(current).getShape().equals("circle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(circle));
	    			  root.getChildren().add(circleView);
	    			  circleView.setX(70); 
	    			  circleView.setY(130); 
	    		  }
	    	  }else if(current==1) {
	    		  root.getChildren().add(playerTwoMoney);
	    		  if(playerShapes.get(current).getShape().equals("square")) {
	    			  playerShapes.get(current).setPlayerImage(new ImageView(square));
	    			  root.getChildren().add(squareView);
	    			  squareView.setX(70); 
	    			  squareView.setY(230); 
	    		  }else if(playerShapes.get(current).getShape().equals("diamond")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(diamond));
	    			  root.getChildren().add(diamondView);
	    			  diamondView.setX(70); 
	    			  diamondView.setY(230); 
	    		  }else if(playerShapes.get(current).getShape().equals("triangle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(triangle));
	    			  root.getChildren().add(triangleView);
	    			  triangleView.setX(70); 
	    			  triangleView.setY(230); 
	    		  }else if(playerShapes.get(current).getShape().equals("circle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(circle));
	    			  root.getChildren().add(circleView);
	    			  circleView.setX(70); 
	    			  circleView.setY(230); 
	    		  }
	    	  }else if(current==2) {
	    		  root.getChildren().add(playerThreeMoney);
	    		  if(playerShapes.get(current).getShape().equals("square")) {
	    			  root.getChildren().add(squareView);
	    			  playerShapes.get(current).setPlayerImage(new ImageView(square));
	    			  squareView.setX(70); 
	    			  squareView.setY(330); 
	    		  }else if(playerShapes.get(current).getShape().equals("diamond")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(diamond));
	    			  root.getChildren().add(diamondView);
	    			  diamondView.setX(70); 
	    			  diamondView.setY(330); 
	    		  }else if(playerShapes.get(current).getShape().equals("triangle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(triangle));
	    			  root.getChildren().add(triangleView);
	    			  triangleView.setX(70); 
	    			  triangleView.setY(330); 
	    		  }else if(playerShapes.get(current).getShape().equals("circle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(circle));
	    			  root.getChildren().add(circleView);
	    			  circleView.setX(70); 
	    			  circleView.setY(330); 
	    		  }
	    	  }else if(current==3) {
	    		  root.getChildren().add(playerFourMoney);
	    		  if(playerShapes.get(current).getShape().equals("square")) {
	    			  playerShapes.get(current).setPlayerImage(new ImageView(square));
	    			  root.getChildren().add(squareView);
	    			  squareView.setX(70); 
	    			  squareView.setY(430); 
	    		  }else if(playerShapes.get(current).getShape().equals("diamond")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(diamond));
	    			  root.getChildren().add(diamondView);
	    			  diamondView.setX(70); 
	    			  diamondView.setY(430); 
	    		  }else if(playerShapes.get(current).getShape().equals("triangle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(triangle));
	    			  root.getChildren().add(triangleView);
	    			  triangleView.setX(70); 
	    			  triangleView.setY(430); 
	    		  }else if(playerShapes.get(current).getShape().equals("circle")){
	    			  playerShapes.get(current).setPlayerImage(new ImageView(circle));
	    			  root.getChildren().add(circleView);
	    			  circleView.setX(70); 
	    			  circleView.setY(430); 
	    		  }
	    	  }
	    	  current++;
	      }
	      
	      //Setting the position of the image 
	      boardView.setX(170); 
	      boardView.setY(74); 
	      
	      //setting the fit height and width of the image view 
	      boardView.setFitHeight(750); 
	      boardView.setFitWidth(750); 
	      
	      //Setting the preserve ratio of the image view 
	      boardView.setPreserveRatio(true);  
		  //System.out.println(playerShapes);
//		BorderPane root = new BorderPane();

	      Text text = new Text();      
	      text.setX(395); 
	      text.setY(270); 
	      text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
	      text.setText("Monopoly!"); 
		
//		if(playerShapes.contains("circle")) {
//			root.getChildren().add(circleView);
//		} 
//		if(playerShapes.contains("triangle")) {
//			root.getChildren().add(triangleView);
//		}
//		if(playerShapes.contains("square")) {
//			root.getChildren().add(squareView);
//		}
//		if(playerShapes.contains("diamond")) {
//			root.getChildren().add(diamondView);
//		}

		
	      
	    //Setting the properties of the rectangle 
		
		players.setX(25.0f); 
		players.setY(75.0f); 
		players.setWidth(125.0f); 
		players.setHeight(600.0f);    
	     
		//THIS IS HOW WE WILL RELOCATE THE PLAYERS!!!
		//imageView.relocate(50.0f,100.0f);
	      

		
		//START GAME HERE!!!!!!!!!!!

	      //Setting the image view 
//	      ImageView playerSquareView = new ImageView(square); 
//	      ImageView playerDiamondView = new ImageView(diamond); 
//	      ImageView playerTriangleView = new ImageView(triangle); 
//	      ImageView playerCircleView = new ImageView(circle); 



	      root.getChildren().add(boardView);
	      
		    root.getChildren().add(houseMediterraneanAveView);
		    root.getChildren().add(houseMediterraneanAveText);
		    root.getChildren().add(hotelMediterraneanAveText);
		    root.getChildren().add(hotelMediterraneanAveView);
		    
		    root.getChildren().add(houseBalticAveView);
		    root.getChildren().add(houseBalticAveText);
		    root.getChildren().add(hotelBalticAveText);
		    root.getChildren().add(hotelBalticAveView);
		    
		    root.getChildren().add(houseOrientalAveView);
		    root.getChildren().add(hotelOrientalAveView);
		    root.getChildren().add(houseOrientalAveText);
		    root.getChildren().add(hotelOrientalAveText);
		    
		    root.getChildren().add(houseVermontAveView);
		    root.getChildren().add(hotelVermontAveView);
		    root.getChildren().add(houseVermontAveText);
		    root.getChildren().add(hotelVermontAveText);
		    
		    root.getChildren().add(houseConnecticutAveView);
		    root.getChildren().add(hotelConnecticutAveView);
		    root.getChildren().add(houseConnecticutAveText);
		    root.getChildren().add(hotelConnecticutAveText);
		    
		    root.getChildren().add(houseStCharlesPlaceView);
		    root.getChildren().add(hotelStCharlesPlaceView);
		    root.getChildren().add(houseStCharlesPlaceText);
		    root.getChildren().add(hotelStCharlesPlaceText);
		    
		    root.getChildren().add(houseStatesAveView);
		    root.getChildren().add(hotelStatesAveView);
		    root.getChildren().add(houseStatesAveText);
		    root.getChildren().add(hotelStatesAveText);
		    
		    root.getChildren().add(houseVirginiaAveView);
		    root.getChildren().add(hotelVirginiaAveView);
		    root.getChildren().add(houseVirginiaAveText);
		    root.getChildren().add(hotelVirginiaAveText);

		    root.getChildren().add(houseStJamesPlaceView);
		    root.getChildren().add(hotelStJamesPlaceView);
		    root.getChildren().add(houseStJamesPlaceText);
		    root.getChildren().add(hotelStJamesPlaceText);
		    
		    
		    root.getChildren().add(houseTennesseeAveView);
		    root.getChildren().add(hotelTennesseeAveView);
		    root.getChildren().add(houseTennesseeAveText);
		    root.getChildren().add(hotelTennesseeAveText);
		    
		    root.getChildren().add(houseNewYorkAveView);
		    root.getChildren().add(hotelNewYorkAveView);
		    root.getChildren().add(houseNewYorkAveText);
		    root.getChildren().add(hotelNewYorkAveText);
		    
		    
		    
		    
		    root.getChildren().add(houseKentuckyAveView);
		    root.getChildren().add(hotelKentuckyAveView);
		    root.getChildren().add(houseKentuckyAveText);
		    root.getChildren().add(hotelKentuckyAveText);
		    
		    root.getChildren().add(houseIndianaAveView);
		    root.getChildren().add(hotelIndianaAveView);
		    root.getChildren().add(houseIndianaAveText);
		    root.getChildren().add(hotelIndianaAveText);
		    
		    root.getChildren().add(houseIllinoisAveView);
		    root.getChildren().add(hotelIllinoisAveView);
		    root.getChildren().add(houseIllinoisAveText);
		    root.getChildren().add(hotelIllinoisAveText);
		    
		    root.getChildren().add(houseAtlanticAveView);
		    root.getChildren().add(hotelAtlanticAveView);
		    root.getChildren().add(houseAtlanticAveText);
		    root.getChildren().add(hotelAtlanticAveText);
		    
		    root.getChildren().add(houseVentnorAveView);
		    root.getChildren().add(hotelVentnorAveView);
		    root.getChildren().add(houseVentnorAveText);
		    root.getChildren().add(hotelVentnorAveText);
		    
		    root.getChildren().add(houseMarvinGardensView);
		    root.getChildren().add(hotelMarvinGardensView);
		    root.getChildren().add(houseMarvinGardensText);
		    root.getChildren().add(hotelMarvinGardensText);
		    
		    
		    
		    root.getChildren().add(housePacificAveView);
		    root.getChildren().add(hotelPacificAveView);
		    root.getChildren().add(housePacificAveText);
		    root.getChildren().add(hotelPacificAveText);
		    
		    root.getChildren().add(houseNorthCarolinaAveView);
		    root.getChildren().add(hotelNorthCarolinaAveView);
		    root.getChildren().add(houseNorthCarolinaAveText);
		    root.getChildren().add(hotelNorthCarolinaAveText);
		    
		    root.getChildren().add(housePennsylvaniaAveView);
		    root.getChildren().add(hotelPennsylvaniaAveView);
		    root.getChildren().add(housePennsylvaniaAveText);
		    root.getChildren().add(hotelPennsylvaniaAveText);
		    
		    root.getChildren().add(houseParkPlaceView);
		    root.getChildren().add(hotelParkPlaceView);
		    root.getChildren().add(houseParkPlaceText);
		    root.getChildren().add(hotelParkPlaceText);
		    
		    root.getChildren().add(houseBoardWalkView);
		    root.getChildren().add(hotelBoardWalkView);
		    root.getChildren().add(houseBoardWalkText);
		    root.getChildren().add(hotelBoardWalkText);
		    
		    
		    


		    
		   

	      int counter=0;
	      ArrayList<String> shapePlayers = new ArrayList<String>();
	      while(counter<playerShapes.size()) {
	    	  shapePlayers.add(playerShapes.get(counter).getShape());
	    	  counter++;
	      }
	      
			if(shapePlayers.contains("circle")) {
				root.getChildren().add(playerShapes.get(shapePlayers.indexOf("circle")).getPlayerImage());
				
				playerShapes.get(shapePlayers.indexOf("circle")).getPlayerImage().setX(895); 
				playerShapes.get(shapePlayers.indexOf("circle")).getPlayerImage().setY(700); 
				playerShapes.get(shapePlayers.indexOf("circle")).getPlayerImage().setFitHeight(15); 
				playerShapes.get(shapePlayers.indexOf("circle")).getPlayerImage().setFitWidth(15); 
				//root.getChildren().add(squareView);
			} 
			if(shapePlayers.contains("triangle")) {
				root.getChildren().add(playerShapes.get(shapePlayers.indexOf("triangle")).getPlayerImage());
				playerShapes.get(shapePlayers.indexOf("triangle")).getPlayerImage().setX(760); 
				playerShapes.get(shapePlayers.indexOf("triangle")).getPlayerImage().setY(700); 
				playerShapes.get(shapePlayers.indexOf("triangle")).getPlayerImage().setFitHeight(15); 
				playerShapes.get(shapePlayers.indexOf("triangle")).getPlayerImage().setFitWidth(15); 
				//root.getChildren().add(triangleView);
			}
			if(shapePlayers.contains("square")) {
				root.getChildren().add(playerShapes.get(shapePlayers.indexOf("square")).getPlayerImage());
				playerShapes.get(shapePlayers.indexOf("square")).getPlayerImage().setX(895);
				playerShapes.get(shapePlayers.indexOf("square")).getPlayerImage().setY(600); 
				playerShapes.get(shapePlayers.indexOf("square")).getPlayerImage().setFitHeight(15); 
				playerShapes.get(shapePlayers.indexOf("square")).getPlayerImage().setFitWidth(15); 
				 //root.getChildren().add(squareView);
			}
			if(shapePlayers.contains("diamond")) {
				root.getChildren().add(playerShapes.get(shapePlayers.indexOf("diamond")).getPlayerImage());
				playerShapes.get(shapePlayers.indexOf("diamond")).getPlayerImage().setX(760); 
				playerShapes.get(shapePlayers.indexOf("diamond")).getPlayerImage().setY(600); 
				playerShapes.get(shapePlayers.indexOf("diamond")).getPlayerImage().setFitHeight(15); 
				playerShapes.get(shapePlayers.indexOf("diamond")).getPlayerImage().setFitWidth(15); 
				//root.getChildren().add(diamondView);
			}
			 Button diceRoll = new Button();
			 root.getChildren().add(diceRoll);
			 
			Text timer = new Text("Timer: 0\nGame ends at 300 seconds");
			timer.setX(25);
			timer.setY(25);
			 root.getChildren().add(timer);
			 Timer timeIt = new Timer();
			 TimerTask task = new TimerTask() {
				 public void run() {
					 secondsPassed++;
					 timer.setText("Timer: "+String.valueOf(secondsPassed)+"\nGame ends at 300 seconds");
					 if(secondsPassed==300) {
						 timeIt.cancel();
						 
//						 Group endBox = new Group();
//						 Text endText = new Text("Game has finished!");
//						 Button endButton = new Button("end");
//						 
//						 endButton.setLayoutX(75);
//						 endButton.setLayoutY(75);
//						 endText.setX(50);
//						 endText.setY(50);
//						 
//						 
//						 endButton.setOnAction(e->{
//							 //primaryStage.hide();
//							 
//						 });
//						  Stage stage = new Stage();
//				          Scene scene = new Scene(endBox,400,200);
//						  stage.setScene(scene);
//						  stage.show();
						 
					 }
					 
					 
				 }
			 };
			 timeIt.scheduleAtFixedRate(task, 1000, 1000);

			 
		
			//PLAYERS MUST ROLL DICE TO DECIDE WHO GOES FIRST.
			
			//START TAKING THE TURNS HERE!

			
			 
			 diceRoll.setText("ROLL DICE");
		      root.getChildren().add(text);
			 diceRoll.setLayoutX(515);
			 diceRoll.setLayoutY(315);
			Board board = new Board();
			turns(0, playerShapes, diceRoll, root, board, playerOneMoney, playerTwoMoney, playerThreeMoney, playerFourMoney, houseHotelText);
	         
			//imageview.relocate(x,y) to move player to new place.
			//make method that takes in an integer and places the image at the location.
	 		Scene scene = new Scene(root,980,780);
		    primaryStage.setTitle("Monopoly!"); 
			scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	 static int secondsPassed;
	 
	public static void turns(int currentPlayer, ArrayList<Player> listOfPlayers, Button diceRoll, Group root, Board board, Text one, Text two, Text three, Text four, ArrayList<Text> houseHotelText) {
		int[] currPlayer = {currentPlayer};
		
		if(secondsPassed==300) {
			root.getChildren().remove(diceRoll);
			
			int currentHigh = 0;

			ArrayList<Player> winTie = new ArrayList<Player>();
			for(int i = 0; i<listOfPlayers.size();i++) {
				if(listOfPlayers.get(i).getNetWorth()>currentHigh) {
					currentHigh=listOfPlayers.get(i).getNetWorth();
					for(int j=0; j<winTie.size();j++) {
						winTie.remove(j);
					}
					winTie.add(listOfPlayers.get(i));
				}else if(listOfPlayers.get(i).getNetWorth()==currentHigh) {
					winTie.add(listOfPlayers.get(i));
				}
			}
			 Text endText = new Text();
			if(winTie.size()<=1) {
				endText.setText("Game has finished!\n Player "+String.valueOf(listOfPlayers.indexOf(winTie.get(0))+1)+" HAS WON!");
			}else {
				String allPlayersWin ="";
				for(int i =0; i<winTie.size();i++) {
					allPlayersWin += " "+String.valueOf(listOfPlayers.indexOf(winTie.get(i))+1);
				}
					
				endText.setText("Game has finished!\n Players"+ allPlayersWin +" HAS WON!");
			}
			
			 endText.setX(500);
			 endText.setY(350);
			root.getChildren().add(endText);
			
		}
		
		
		if(currPlayer[0] == listOfPlayers.size()) {
			currPlayer[0]= 0;
			currentPlayer=0;
		}
		
		

        Group turnBox = new Group();
		 diceRoll.setOnAction(e->{
			 Dice diceOne = new Dice();
			 Dice diceTwo = new Dice();
			  Stage stage = new Stage();
			  stage.setTitle("TURN RESULT");
			  diceOne.roll();
			  diceTwo.roll();
			  Label moved=new Label("Player has a rolled a " + diceOne.getNumber() + " and " + diceTwo.getNumber() + " = " + String.valueOf(diceOne.getNumber()+diceTwo.getNumber()));
	          
			 if(listOfPlayers.get(currPlayer[0]).getIsInJail()) {
				 listOfPlayers.get(currPlayer[0]).setJailTurns(listOfPlayers.get(currPlayer[0]).getJailTurns()-1);
				 if(listOfPlayers.get(currPlayer[0]).getJailTurns() == 0) {
					 listOfPlayers.get(currPlayer[0]).setIsInJail(false);
				 }
				 currPlayer[0]++;
				 turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
				 return;
				 
			 }
			  

			 
			  
	          //GET AND SET BOX LOCATION OF CURRENT PLAYER
	          int temp = listOfPlayers.get(currPlayer[0]).getBoxLocation() + diceOne.getNumber()+diceTwo.getNumber();
	          listOfPlayers.get(currPlayer[0]).setBoxLocation(temp);
	          
	          //CHANGE X AND Y OF PLAYER ON BOARD
	          movePlayer(listOfPlayers.get(currPlayer[0]));
	          
	          Label numPlayers=new Label("Player "+ String.valueOf(currPlayer[0]+1) +" landed on:"+ board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0])));
	          
			  if(board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))) != null) { //Is it a property at box location?
				  if(board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).ownedByPlayer()) {
					  //PAY RENT
					  
					  if(board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).getPlayer() == listOfPlayers.get(currPlayer[0])) {
						  //CURRENT PLAYER OWNS THE PROPERTY!

						  if(board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).getHotelNum()!=1) {
							  if(board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).getHouseNum()<4) {
								  Button addHouse = new Button("Add House");
								  addHouse.setLayoutX(120);
								  addHouse.setLayoutY(150);
								  Button ignore = new Button("continue");
								  ignore.setLayoutX(220);
								  ignore.setLayoutY(150);
								  turnBox.getChildren().add(ignore);
								  turnBox.getChildren().add(addHouse);
								  addHouse.setOnAction(ee->{
									  Property propertyHere= board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0])));
									  propertyHere.setHouseNum(propertyHere.getHouseNum()+1);
									  updateTextHouseHotel(houseHotelText, propertyHere, "house");
									  stage.hide();
									  currPlayer[0]++;
							 		  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
								  });
								  ignore.setOnAction(ee->{
									  stage.hide();
									  currPlayer[0]++;
							 		  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
								  });
								
							  }else {
								  Button addHotel = new Button("Add Hotel");
								  addHotel.setLayoutX(130);
								  addHotel.setLayoutY(150);
								  Button ignore = new Button("continue");
								  ignore.setLayoutX(220);
								  ignore.setLayoutY(150);
								  turnBox.getChildren().add(ignore);
								  turnBox.getChildren().add(addHotel);
								  addHotel.setOnAction(ee->{
									  Property propertyHere= board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0])));
									  propertyHere.setHotelNum(propertyHere.getHotelNum()+1);
									  propertyHere.setHouseNum(0);
									  updateTextHouseHotel(houseHotelText, propertyHere, "hotel");
									  stage.hide();
									  currPlayer[0]++;
							 		  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
								  });
								  ignore.setOnAction(ee->{
									  stage.hide();
									  currPlayer[0]++;
							 		  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
								  });
							  }
						  }else {
							  
						
				 		  
				 		  Button continuee = new Button("Continue");	 
						  continuee.setLayoutX(200);
						  continuee.setLayoutY(150);
						  turnBox.getChildren().add(continuee);
						  continuee.setOnAction(ee->{
							  currPlayer[0]++;
							  stage.hide();
					 		  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
						  });
						  
						  }
//						 
						  
					  }else {
					  
					  
					  Player tempPlayer = board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).chargeRent(listOfPlayers.get(currPlayer[0]));
					  int tempIntPlayer = listOfPlayers.indexOf(tempPlayer);
					  
					  if(currPlayer[0]==0 ){
						  one.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==1) {
						  two.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==2) {
						  three.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==3) {
						  four.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }
					  
					  if(tempIntPlayer==0 ){
						  one.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==1) {
						  two.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==2) {
						  three.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==3) {
						  four.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }

					  System.out.println("OWNED");
					  Button continueButton = new Button();
			          continueButton.setText("continue");
			          continueButton.setLayoutX(130);
			          continueButton.setLayoutY(150);
			          continueButton.setOnAction(ee->{
			        	  System.out.println("CONTINUED");
			        	  stage.hide();
			        	  currPlayer[0]++;
			 			 turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
			          });
			          turnBox.getChildren().add(continueButton);
					  }
				  }else {
					  //BUY OR PASS PROPERTY
					  Button buy = new Button("BUY");
					  buy.setLayoutX(150);
					  buy.setLayoutY(150);
					  Button pass = new Button("PASS");	 
					  pass.setLayoutX(200);
					  pass.setLayoutY(150);
					  turnBox.getChildren().add(buy);
					  turnBox.getChildren().add(pass);
					  buy.setOnAction(a->{
						  System.out.println("BOUGHT");
						  stage.hide();
						  board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).purchase(listOfPlayers.get(currPlayer[0]));
						  listOfPlayers.get(currPlayer[0]).addProperty(board.indexOfProperty(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(), listOfPlayers.get(currPlayer[0]))));
						  if(currPlayer[0]==0) {
							  one.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==1) {
							  two.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==2) {
							  three.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==3) {
							  four.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }
						  currPlayer[0]++;
						  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
					  });
					  pass.setOnAction(aa->{
						  System.out.println("PASSED");
						  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
						  stage.hide();
						  currPlayer[0]++;
					  });
				  }
				  
			  }else if(board.indexOfUtility(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))) != null){ //Is it a utility at box location?
				  if(board.indexOfUtility(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).ownedByPlayer()) {
					  //PAY RENT
					  int mult = board.indexOfUtility(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).getPlayer().getUtility();
					  Player tempPlayer = board.indexOfUtility(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).chargeRent(listOfPlayers.get(currPlayer[0]), diceOne.getNumber() + diceTwo.getNumber(), mult);	
					  
					  if(currPlayer[0]==0 ){
						  one.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==1) {
						  two.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==2) {
						  three.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==3) {
						  four.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }
					  
					  int tempIntPlayer = listOfPlayers.indexOf(tempPlayer);
					  
					  if(tempIntPlayer==0 ){
						  one.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==1) {
						  two.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==2) {
						  three.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==3) {
						  four.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }
					  
					  System.out.println("OWNED");
					  Button continueButton = new Button();
			          continueButton.setText("continue");
			          continueButton.setLayoutX(130);
			          continueButton.setLayoutY(150);
			          continueButton.setOnAction(ee->{
			        	  System.out.println("CONTINUED");
			        	  stage.hide();
			        	  currPlayer[0]++;
			 			 turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
			          });
			          turnBox.getChildren().add(continueButton);
				  }else {
					  //BUY OR PASS PROPERTY
					  Button buy = new Button("BUY");
					  buy.setLayoutX(150);
					  buy.setLayoutY(150);
					  Button pass = new Button("PASS");	 
					  pass.setLayoutX(200);
					  pass.setLayoutY(150);
					  turnBox.getChildren().add(buy);
					  turnBox.getChildren().add(pass);
					  buy.setOnAction(a->{
						  System.out.println("BOUGHT");
						  stage.hide();
						  board.indexOfUtility(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).purchase(listOfPlayers.get(currPlayer[0]));
						  listOfPlayers.get(currPlayer[0]).addUtility(board.indexOfUtility(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(), listOfPlayers.get(currPlayer[0]))));
						  if(currPlayer[0]==0) {
							  one.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==1) {
							  two.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==2) {
							  three.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==3) {
							  four.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }
						  currPlayer[0]++;
						  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
					  });
					  pass.setOnAction(aa->{
						  System.out.println("PASSED");
						  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
						  stage.hide();
						  currPlayer[0]++;
					  });
				  }
			  }
			  else if(board.indexOfRailroad(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))) != null) { //is it a railroad at this box location
				  if(board.indexOfRailroad(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).ownedByPlayer()) {
					  //PAY RENT
					  int mult = board.indexOfRailroad(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0]))).getPlayer().getRailroad();
					  Player tempPlayer = board.indexOfRailroad(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(), listOfPlayers.get(currPlayer[0]))).chargeRent(listOfPlayers.get(currPlayer[0]), mult);
					  
					  if(currPlayer[0]==0 ){
						  one.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==1) {
						  two.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==2) {
						  three.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }else if(currPlayer[0]==3) {
						  four.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
					  }
					  
					  int tempIntPlayer = listOfPlayers.indexOf(tempPlayer);
					  
					  if(tempIntPlayer==0 ){
						  one.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==1) {
						  two.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==2) {
						  three.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }else if(tempIntPlayer==3) {
						  four.setText(String.valueOf(listOfPlayers.get(tempIntPlayer).getMoney()));
					  }
					  
					  System.out.println("OWNED");
					  Button continueButton = new Button();
			          continueButton.setText("continue");
			          continueButton.setLayoutX(130);
			          continueButton.setLayoutY(150);
			          continueButton.setOnAction(ee->{
			        	  System.out.println("CONTINUED");
			        	  stage.hide();
			        	  currPlayer[0]++;
			 			 turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
			          });
			          turnBox.getChildren().add(continueButton);
				  }else {
					  //BUY OR PASS PROPERTY
					  Button buy = new Button("BUY");
					  buy.setLayoutX(150);
					  buy.setLayoutY(150);
					  Button pass = new Button("PASS");	 
					  pass.setLayoutX(200);
					  pass.setLayoutY(150);
					  turnBox.getChildren().add(buy);
					  turnBox.getChildren().add(pass);
					  buy.setOnAction(a->{
						  System.out.println("BOUGHT");
						  stage.hide();
						  board.indexOfRailroad(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(), listOfPlayers.get(currPlayer[0]))).purchase(listOfPlayers.get(currPlayer[0]));
					      listOfPlayers.get(currPlayer[0]).addRailroad(board.indexOfRailroad(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(), listOfPlayers.get(currPlayer[0]))));
						  if(currPlayer[0]==0) {
							  one.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==1) {
							  two.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==2) {
							  three.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }else if(currPlayer[0]==3) {
							  four.setText(String.valueOf(listOfPlayers.get(currPlayer[0]).getMoney()));
						  }
						  currPlayer[0]++;
						  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
					  });
					  pass.setOnAction(aa->{
						  System.out.println("PASSED");
						  currPlayer[0]++;
						  turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
						  stage.hide();
					  });
				  }
		      }else if(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0])).equals("Income Tax")) {
		    	  Button tenPercent = new Button("%10");
		    	  tenPercent.setLayoutX(150);
		    	  tenPercent.setLayoutY(150);
				  Button twoHundred = new Button("$200");	 
				  twoHundred.setLayoutX(200);
				  twoHundred.setLayoutY(150);
				  turnBox.getChildren().add(tenPercent);
				  turnBox.getChildren().add(twoHundred);
				  tenPercent.setOnAction(a->{
					  stage.hide();
					int netWorth = listOfPlayers.get(currPlayer[0]).getNetWorth();
					listOfPlayers.get(currPlayer[0]).setMoney(listOfPlayers.get(currPlayer[0]).getMoney() + ((int)(netWorth * .1)));
					  currPlayer[0]++;
					turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
				  });
				  twoHundred.setOnAction(a->{
					  stage.hide();
					  currPlayer[0]++;
					listOfPlayers.get(currPlayer[0]).setMoney(listOfPlayers.get(currPlayer[0]).getMoney() - 200);
					turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
				  });
				  
		      }else if(board.whatsInBox(listOfPlayers.get(currPlayer[0]).getBoxLocation(),listOfPlayers.get(currPlayer[0])).equals("GO TO JAIL")) {
				  Player playerHere =  listOfPlayers.get(currPlayer[0]);
		    	  
				  playerHere.setBoxLocation(10);
				  playerHere.setJailTurns(3);
				  
					if(playerHere.getShape().equals("diamond")) {
						playerHere.getPlayerImage().relocate(230, 600);
					}else if(playerHere.getShape().equals("triangle")) {
						playerHere.getPlayerImage().relocate(230, 660);
					}else if(playerHere.getShape().equals("circle")) {
						playerHere.getPlayerImage().relocate(312, 660);
					}else if(playerHere.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
						playerHere.getPlayerImage().relocate(312, 600);
					}
					
					Button continueButton = new Button();
					continueButton.setText("continue");
			          continueButton.setLayoutX(130);
			          continueButton.setLayoutY(150);
			          continueButton.setOnAction(ee->{
			        	  stage.hide();
			        	  currPlayer[0]++;
			 			 turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
			          });
			          turnBox.getChildren().add(continueButton);

				  
		      } else {
		 	         Button continueButton = new Button();
			          continueButton.setText("continue");
			          continueButton.setLayoutX(130);
			          continueButton.setLayoutY(150);
			          continueButton.setOnAction(ee->{
			        	  System.out.println("CONTINUED");
			        	  stage.hide();
			        	  currPlayer[0]++;
			 			 turns(currPlayer[0], listOfPlayers, diceRoll, root, board, one, two, three, four, houseHotelText);
			          });
			          turnBox.getChildren().add(continueButton);
			  }
	          numPlayers.setLayoutY(25);
	          

	          
//	          int test = 10;
//	          movePlayer(listOfPlayers.get(0), test);
//	          movePlayer(listOfPlayers.get(1), test);
//	          movePlayer(listOfPlayers.get(2), test);
//	          movePlayer(listOfPlayers.get(3), test);
	          
	          //listOfPlayers.get(0).getPlayerImage().relocate(200, 200);
	          //NEED TO ACCESS SOMEWHERE THE VALUE OF WHAT THE BOARD BOX IS
	          	//NEED INTEGER VALUE OF EACH BOX ON BOARD
	          	//EACH BOX HOLDS A STRING VALUE DESCRIBING WHAT IT IS -> PROPERTY, ETC..
	          	//STRING VALUE OF WHAT PROPERTY IT ACTUALLY IS, THE NAME.
	          	//MONEY AMOUNT NEED TO PURCHASE
	          
	          //NEED TO KNOW WHERE ALL X AND Y CORDS ARE OF EACH BOX FOR PLAYER MOVEMENT ON BOARD!
	          
	 

	          turnBox.getChildren().add(moved);
	          turnBox.getChildren().add(numPlayers);

	          
	          Scene scene = new Scene(turnBox,400,200);
			  stage.setScene(scene);
			  stage.show();
			  
	  
		 });
		 
	}
	
	
//	public static void relocateSpot(ImageView image) {
//		image.relocate(300,300);
//		image.setFitHeight(15); 
//		image.setFitWidth(15); 
//		
//	}
	
	
	public static void movePlayer(Player player) {
		int boxNumber = player.getBoxLocation();
		if(boxNumber == 40) { //BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 700);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 600);
			}
		}else if(boxNumber == 39) { //UP ONE FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 550);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 570);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 570);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 550);
			}
			
		}else if(boxNumber == 38) { //UP TWO FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 503);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 523);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 523);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 503);
			}
		}else if(boxNumber == 37) { //UP THREE FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 463);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 483);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 483);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 463);
			}
		}else if(boxNumber == 36) { //UP FOUR FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 422);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 442);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 442);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 422);
			}
		}else if(boxNumber == 35) { //UP FIVE FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 378);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 398);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 398);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 378);
			}
		}else if(boxNumber == 34) { //UP SIX FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 334);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 354);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 354);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 334);
			}
		}else if(boxNumber == 33) { //UP SEVEN FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 291);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 311);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 311);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 291);
			}
		}else if(boxNumber == 32) { //UP EIGHT FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 250);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 270);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 270);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 250);
			}
		}else if(boxNumber == 31) { //UP NINE FROM BOTTOM RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 210);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 230);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 230);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 210);
			}
		}else if(boxNumber == 30) { //TOP RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(895, 85);
			}
		}else if(boxNumber == 29) { //LEFT ONE FROM TOP RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(705, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(705, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(735, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(735, 85);
			}
		}else if(boxNumber == 28) { //LEFT TWO FROM TOP RIGHT
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(657, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(657, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(685, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(685, 85);
			}
		}else if(boxNumber == 27) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(610, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(610, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(635, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(635, 85);
			}
		}else if(boxNumber == 26) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(565, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(565, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(585, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(585, 85);
			}
		}else if(boxNumber == 25) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(520, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(520, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(540, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(540, 85);
			}
		}else if(boxNumber == 24) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(475, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(475, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(495, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(495, 85);
			}
		}else if(boxNumber == 23) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(430, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(430, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(450, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(450, 85);
			}
		}else if(boxNumber == 22) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(385, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(385, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(405, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(405, 85);
			}
		}else if(boxNumber == 21) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(340, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(340, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(360, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(360, 85);
			}
		}else if(boxNumber == 20) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 85);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 185);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 185);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 85);
			}
		}else if(boxNumber == 19) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 210);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 230);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 230);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 210);
			}
		}else if(boxNumber == 18) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 250);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 270);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 270);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 250);
			}
		}else if(boxNumber == 17) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 291);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 311);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 311);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 291);
			}
		}else if(boxNumber == 16) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 334);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 354);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 354);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 334);
			}
		}else if(boxNumber == 15) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 378);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 398);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 398);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 378);
			}
		}else if(boxNumber == 14) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 422);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 442);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 442);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 422);
			}
		}else if(boxNumber == 13) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 463);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 483);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 483);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 463);
			}
		}else if(boxNumber == 12) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 503);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 523);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 523);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 503);
			}
		}else if(boxNumber == 11) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 550);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 570);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 570);
			}else if(player.getShape().equals("square")) {
				player.getPlayerImage().relocate(312, 550);
			}
		}else if(boxNumber == 10) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(180, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(180, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(312, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(250, 700);
			}
		}else if(boxNumber == 9) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(340, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(340, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(360, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(360, 600);
			}
		}else if(boxNumber == 8) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(385, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(385, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(405, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(405, 600);
			}
		}else if(boxNumber == 7) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(430, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(430, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(450, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(450, 600);
			}
		}else if(boxNumber == 6) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(475, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(475, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(495, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(495, 600);
			}
		}else if(boxNumber == 5) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(520, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(520, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(540, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(540, 600);
			}
		}else if(boxNumber == 4) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(565, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(565, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(585, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(585, 600);
			}
		}else if(boxNumber == 3) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(610, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(610, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(635, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(635, 600);
			}
		}else if(boxNumber == 2) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(657, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(657, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(685, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(685, 600);
			}
		}else if(boxNumber == 1) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(705, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(705, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(735, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(735, 600);
			}
		}else if(boxNumber == 0) {
			if(player.getShape().equals("diamond")) {
				player.getPlayerImage().relocate(760, 600);
			}else if(player.getShape().equals("triangle")) {
				player.getPlayerImage().relocate(760, 700);
			}else if(player.getShape().equals("circle")) {
				player.getPlayerImage().relocate(895, 700);
			}else if(player.getShape().equals("square")) {  //UPDATE TO BE OUTSIDE OF THE JAIL!!!
				player.getPlayerImage().relocate(895, 600);
			}
		}
	}
	
	
	public static void playerNumPopUp(Stage primaryStage) {
		  int[] numArray = {1};
		  
		  Stage stage = new Stage();
		  stage.setTitle("# of players?!");
		  
          Label numPlayers=new Label("Number of players (2-4): ");  
          TextField tf1=new TextField();  
          Button b = new Button("Submit");  
      	  ArrayList<Player> players = new ArrayList<Player>();
          b.setOnAction(e->{
        	  stage.hide();
        	  playerSelect(Integer.parseInt(tf1.getText()),numArray,primaryStage, players);
        	  });  
          
          GridPane root2 = new GridPane();  
          root2.addRow(0, numPlayers,tf1);  
          root2.addRow(1, b);  
          
          stage.setScene(new Scene(root2,300,75));
          stage.show();
	}
	
	public static void playerSelect(int playersNum, int[] current, Stage primaryStage, ArrayList<Player> players) {
		 if(playersNum<current[0]) {
			 monopolyBoard(primaryStage, players);
			 return;
		 }
		 Stage stage = new Stage();
         stage.setTitle("Choose Shape!");
         Label numPlayers=new Label("Player "+current[0]+", choose your shape.");  
         
         Button circle = new Button("Circle");  
         Button triangle = new Button("Triangle");  
         Button square = new Button("Square");  
         Button diamond = new Button("Diamond");  
        
         GridPane root2 = new GridPane();  
         
         root2.addRow(0, numPlayers);  
         root2.addRow(1, circle);  
         root2.addRow(2, triangle);  
         root2.addRow(3, square);  
         root2.addRow(4, diamond);  
         
         stage.setScene(new Scene(root2,200,150));
         stage.show();
         circle.setOnAction(e->{
	        //players.add("circle");
        	players.add(new Player("circle"));
	        stage.hide();
	        current[0]++;
	        playerSelect(playersNum, current,primaryStage, players);
         });  
         triangle.setOnAction(e->{
	        //players.add("triangle");
        	players.add(new Player("triangle"));
	        stage.hide();
	        current[0]++;
	        playerSelect(playersNum, current,primaryStage, players);
         });  
         square.setOnAction(e->{
	        //players.add("square");
        	players.add(new Player("square"));
	        stage.hide();
	        current[0]++;
	        playerSelect(playersNum, current,primaryStage, players);
         });  
         diamond.setOnAction(e->{
	        //players.add("diamond");
        	players.add(new Player("diamond"));
	        stage.hide();
	        current[0]++;
	        playerSelect(playersNum, current,primaryStage, players);
         });  
	}
	
	static void updateTextHouseHotel(ArrayList<Text> allText, Property property, String hotelOrHouse) {
		String name = property.getName();
		String houses = String.valueOf(property.getHouseNum());
		String hotels = String.valueOf(property.getHotelNum());
		if(name.equals("Mediterranean Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(0).setText(houses);
			}else {
				allText.get(1).setText(hotels);
				allText.get(0).setText(String.valueOf(0));
			}	
		}else if(name.equals("Baltic Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(2).setText(houses);
			}else {
				allText.get(3).setText(hotels);
				allText.get(2).setText(String.valueOf(0));
			}	
		}else if(name.equals("Oriental Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(4).setText(houses);
			}else {
				allText.get(5).setText(hotels);
				allText.get(4).setText(String.valueOf(0));
			}	
		}else if(name.equals("Vermont Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(6).setText(houses);
			}else {
				allText.get(7).setText(hotels);
				allText.get(6).setText(String.valueOf(0));
			}	
		}else if(name.equals("Connecticut Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(8).setText(houses);
			}else {
				allText.get(9).setText(hotels);
				allText.get(8).setText(String.valueOf(0));
			}	
		}
		
		
		//TO BE FINISHED.
		else if(name.equals("St Charles Place")) {     // ADD AT LINE 1690 MAIN
			if(hotelOrHouse.equals("house")) {
				allText.get(10).setText(houses);
			}else {
				allText.get(11).setText(hotels);
				allText.get(10).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("States Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(12).setText(houses);
			}else {
				allText.get(13).setText(hotels);
				allText.get(12).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Virginia Ave")) {
			if(hotelOrHouse.equals("house")) {
		allText.get(14).setText(houses);
			}else {
				allText.get(15).setText(hotels);
				allText.get(14).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("St James Place")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(16).setText(houses);
			}else {
				allText.get(17).setText(hotels);
				allText.get(16).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Tennessee Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(18).setText(houses);
			}else {
				allText.get(19).setText(hotels);
				allText.get(18).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("New York Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(20).setText(houses);
			}else {
				allText.get(21).setText(hotels);
				allText.get(20).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Kentucky Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(22).setText(houses);
			}else {
				allText.get(23).setText(hotels);
				allText.get(22).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Indiana Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(24).setText(houses);
			}else {
				allText.get(25).setText(hotels);
				allText.get(24).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Atlantic Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(26).setText(houses);
			}else {
				allText.get(27).setText(hotels);
				allText.get(26).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Ventnor Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(28).setText(houses);
			}else {
				allText.get(29).setText(hotels);
				allText.get(28).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Marvin Gardens")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(30).setText(houses);
			}else {
				allText.get(31).setText(hotels);
				allText.get(30).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Pacific Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(32).setText(houses);
			}else {
				allText.get(33).setText(hotels);
				allText.get(32).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("North Carolina Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(34).setText(houses);
			}else {
				allText.get(35).setText(hotels);
				allText.get(34).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Pennsylvania Ave")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(36).setText(houses);
			}else {
				allText.get(37).setText(hotels);
				allText.get(36).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Park Place")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(38).setText(houses);
			}else {
				allText.get(39).setText(hotels);
				allText.get(38).setText(String.valueOf(0));
			}	
		}
		else if(name.equals("Boardwalk")) {
			if(hotelOrHouse.equals("house")) {
				allText.get(40).setText(houses);
			}else {
				allText.get(41).setText(hotels);
				allText.get(40).setText(String.valueOf(0));
			}	
		}


	}
	
	
	
}
