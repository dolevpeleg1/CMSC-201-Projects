/*
 * Class: CMSC201 
 * Instructor: Professor Ashique Tanveer
 * Description: "Complete Java Program Racing car using JavaFX Platform."
 * Due: 05/08/22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dolev Peleg
*/
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Project5 extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		// Creating a root pane
		StackPane rootPane = new StackPane();
		
		// Creating a pane to place the car on
		Pane pane = new Pane();
		
		// Creating both of the wheels, coloring them black
		Circle backWheel = new Circle(15, 145, 5);
		backWheel.setFill(Color.BLACK);
		Circle frontWheel = new Circle(35, 145, 5);
		frontWheel.setFill(Color.BLACK);
		
		// Creating the lower part of the car using a rectangle, coloring it cyan
		Rectangle lowerPart = new Rectangle(0, 130, 50, 10);
		lowerPart.setFill(Color.CYAN);
		
		// Creating the upper part of the car using a polygon, coloring it cyan
		Polygon upperPart = new Polygon(10, 130, 20, 120, 30, 120, 40, 130);
		upperPart.setFill(Color.CYAN);
		
		
		// Adding the wheels, the lower part, and the upper part of the car to the pane
		pane.getChildren().addAll(backWheel, frontWheel, lowerPart, upperPart);
		
		// Creating a pane for the button
		Pane btnPane = new Pane();
		
		// Creating a button with the text "Pause" on it
		Button pause = new Button("Pause");
		
		// Placing the button on the btnPane pane 
		pause.setLayoutX(175);
		btnPane.getChildren().add(pause);
		
		// Adding both pane and btnPane to the rootPane pane
		rootPane.getChildren().addAll(pane,btnPane);
		
		
		// Setting the Scene and showing it
		Scene scene = new Scene(rootPane, 400, 150);
		primaryStage.setTitle("Project5");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Creating a PathTransition animation with the duration of 5000 milliseconds, and a path of a straight line
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(5000));
		Line path = new Line(200, 75, 550, 75);
		pt.setPath(path);
		
		// Setting the PathTransition to the car's pane, making it run an indefinite amount of times
		pt.setNode(pane);
		pt.setCycleCount(Timeline.INDEFINITE);
		
		// Starting the PathTransition
		pt.play();
		
		// If the pause button is pressed, pause the animation
		pause.setOnMousePressed(e -> pt.pause());
		
		// If the pause button is released, continues the animation
		pause.setOnMouseReleased(e -> pt.play());
		
		rootPane.setOnKeyReleased(e ->
		{
			// If the UP arrow key is pressed, the animation's rate is increased by 0.5
			if (e.getCode() == KeyCode.UP)
			{
				pt.setRate(pt.getRate() + 0.5);
			}
			
			// If the DOWN arrow key is pressed, the animation's rate is decreased by 0.5. Minimum rate is 0.5
			else if (e.getCode() == KeyCode.DOWN && pt.getRate() > 0.5)
			{
				pt.setRate(pt.getRate() - 0.5);
			}
			
		});
	}
	
	// Creating a main method to run the program
	public static void main(String[] args) 
	{
		launch(args);
	}
}
