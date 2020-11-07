package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color; 
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; 

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
		     Rectangle board = new Rectangle();
		     Rectangle players = new Rectangle();
		     board.setFill(Color.BURLYWOOD);
		     board.setStroke(Color.BLACK);
		      Text text = new Text();      
		      text.setX(250); 
		      text.setY(50); 
		      text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
		      text.setText("Monopoly!"); 
			Group root = new Group(board, players, text); 
			Scene scene = new Scene(root,800,700);

		      
		    //Setting the properties of the rectangle 
			board.setX(175.0f); 
			board.setY(75.0f); 
			board.setWidth(600.0f); 
			board.setHeight(600.0f);    
			
			players.setX(25.0f); 
			players.setY(75.0f); 
			players.setWidth(125.0f); 
			players.setHeight(600.0f);    
		      
		      
		    primaryStage.setTitle("Monopoly!"); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
