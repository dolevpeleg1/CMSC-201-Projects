/*
 * Class: CMSC201 
 * Instructor: Professor Ashique Tanveer
 * Description: "Plot the sine and cosine functions. Write a program that plots the sine function in red and cosine in blue"
 * Due: 04/24/22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dolev Peleg
*/
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;

// Creating a the Project4_Part2 class, extending the Application superclass
public class Project4_Part2 extends Application
{
	// Overriding the start method
	@Override
	public void start(Stage primaryStage)
	{
		// Creating a new Pane to place the graph on
		Pane pane = new Pane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		// Creating the X and Y axis
		Line xAxis = new Line(10, 100, 390, 100);
		Line yAxis = new Line(200, 10, 200, 200);
		
		// Creating the arrow on the right of the x axis
		Polyline xArrow = new Polyline(380, 90, 390, 100, 380, 110);
		
		// Creating the arrow on the right of the x axis
		Polyline YArrow = new Polyline(190, 20, 200, 10, 210, 20);
		
		// Creating the scale and placing the points on the x axis
		Text minus3PI = new Text(40, 115, "-3\u03c0");
		Text minus2PI = new Text(90, 115, "-2\u03c0");
		Text minusPI = new Text(140, 115, "-\u03c0");
		Text zero = new Text(200, 115, "0");
		Text PI = new Text(250, 115, "\u03c0");
		Text plus2PI = new Text(300, 115, "2\u03c0");
		Text plus3PI = new Text(345, 115, "3\u03c0");
		
		// Creating the X and Y symbols
		Text xSymbol = new Text(370, 80, "X");
		Text ySymbol = new Text(220, 20, "Y");
		
		// Creating the sine graph, coloring it red
		Polyline sineGraph = new Polyline();
	    ObservableList<Double> list1 = sineGraph.getPoints();
	    double scaleFactor1 = 50;
	    for (int x = -170; x <= 170; x++) 
	    {
	    	list1.add(x + 200.0); 
	    	list1.add(100 - scaleFactor1 * Math.sin((x / 100.0) * 2 * Math.PI));
	    }
		sineGraph.setStroke(Color.RED);
	    
	    // Creating the cosine graph, coloring it blue
	    Polyline cosineGraph = new Polyline();
	    ObservableList<Double> list2 = cosineGraph.getPoints();
	    double scaleFactor2 = 50;
	    for (int x = -170; x <= 170; x++) 
	    {
	    	list2.add(x + 200.0); 
	    	list2.add(100 - scaleFactor2 * Math.cos((x / 100.0) * 2 * Math.PI));
	    }
	    cosineGraph.setStroke(Color.BLUE);
	    
	    
	    // Adding all the nodes to the pane
	    pane.getChildren().addAll(sineGraph,cosineGraph, xAxis, yAxis, xArrow, YArrow, minus3PI,minus2PI, minusPI,
	    		zero, PI, plus2PI, plus3PI, xSymbol, ySymbol);
	    
	    
	    // Creating a Scene and adding the pain on top of it
		Scene scene = new Scene(pane, 400, 250);
		primaryStage.setTitle("Project4");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	// Creating a main method to launch the application
	public static void main(String[] args)
	{
		launch(args);
	}
}
