import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main_Screen extends Application{
	
	GridPane gridPane = new GridPane();
	Pane pane = new Pane();
	Scene scene = new Scene(pane, 220, 180);
	
	String operation = "";
	double number1;
	double number2;
	
	Button one = new Button("1");
	Button two = new Button("2");
	Button three = new Button("3");
	Button four = new Button("4");
	Button five = new Button("5");
	Button six = new Button("6");
	Button seven = new Button("7");
	Button eight = new Button("8");
	Button nine = new Button("9");
	Button zero = new Button("0");
	Button dec = new Button(" .");
	
	TextField screen = new TextField("");
	
	Button add = new Button("+");
	Button subtract = new Button("- ");
	Button multiply = new Button("* ");
	Button divide = new Button(" /");
	Button equals = new Button("=");
	Button clear = new Button("c");
	
	Button empty_1 = new Button("");
	Button empty_2 = new Button("");
	Button empty_3 = new Button("  ");
	Button empty_4 = new Button("  ");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		add_Buttons();
		add_Screen();
		click_Buttons();
		
		gridPane.setTranslateY(72);
		pane.getChildren().add(gridPane);
		stage.setResizable(false);
		stage.setTitle("My Simple Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	public void add_Screen()
	{
		screen.setMinHeight(70);
		screen.setMinWidth(220);
		screen.setEditable(false);
		pane.getChildren().add(screen);
	}

	public void add_Buttons()
	{
		GridPane.setRowIndex(one, 1);
		GridPane.setColumnIndex(one, 1);
		GridPane.setRowIndex(two, 1);
		GridPane.setColumnIndex(two, 2);
		GridPane.setRowIndex(three, 1);
		GridPane.setColumnIndex(three, 3);
		GridPane.setRowIndex(four, 2);
		GridPane.setColumnIndex(four, 1);
		GridPane.setRowIndex(five, 2);
		GridPane.setColumnIndex(five, 2);
		GridPane.setRowIndex(six, 2);
		GridPane.setColumnIndex(six, 3);
		GridPane.setRowIndex(seven, 3);
		GridPane.setColumnIndex(seven, 1);
		GridPane.setRowIndex(eight, 3);
		GridPane.setColumnIndex(eight, 2);
		GridPane.setRowIndex(nine, 3);
		GridPane.setColumnIndex(nine, 3);
		GridPane.setRowIndex(zero, 4);
		GridPane.setColumnIndex(zero, 2);
		GridPane.setRowIndex(empty_1, 4);
		GridPane.setColumnIndex(empty_1, 1);
		GridPane.setRowIndex(empty_2, 4);
		GridPane.setColumnIndex(empty_2, 3);
		GridPane.setRowIndex(empty_3, 2);
		GridPane.setColumnIndex(empty_3, 4);
		GridPane.setRowIndex(empty_4, 4);
		GridPane.setColumnIndex(empty_4, 4);
	
		GridPane.setRowIndex(clear, 1);
		GridPane.setColumnIndex(clear, 4);
		GridPane.setRowIndex(add, 1);
		GridPane.setColumnIndex(add, 6);
		GridPane.setRowIndex(subtract, 2);
		GridPane.setColumnIndex(subtract, 6);
		GridPane.setRowIndex(multiply, 3);
		GridPane.setColumnIndex(multiply, 6);
		GridPane.setRowIndex(divide, 4);
		GridPane.setColumnIndex(divide, 6);
		GridPane.setRowIndex(equals, 3);
		GridPane.setColumnIndex(equals, 4);
		
		one.setPrefWidth(55);
		two.setPrefWidth(55);
		three.setPrefWidth(55);
		four.setPrefWidth(55);
		five.setPrefWidth(55);
		six.setPrefWidth(55);
		seven.setPrefWidth(55);
		eight.setPrefWidth(55);
		nine.setPrefWidth(55);
		zero.setPrefWidth(55);
		
		empty_1.setPrefWidth(55);
		empty_2.setPrefWidth(55);
		
		gridPane.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine, zero, add, equals,
				subtract, clear, multiply, divide, empty_1, empty_2, empty_3, empty_4);
	}
	
	public void click_Buttons()
	{
		one.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "1");
		});
		
		two.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "2");
		});
		
		three.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "3");
		});
		
		four.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "4");
		});
		
		five.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "5");
		});
		
		six.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "6");
		});
		seven.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "7");
		});
		eight.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "8");
		});
		nine.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "9");
		});
		zero.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + "0");
		});
		dec.setOnAction(e ->{
			String aphend = screen.getText().toString();
			
			screen.setText(aphend + ".");
		});
		
		
		add.setOnAction(e ->{
			String aphend = screen.getText().toString();
			number1 = Integer.parseInt(aphend);
			operation = "+";
			screen.setText("");
		});
		
		subtract.setOnAction(e ->{
			String aphend = screen.getText().toString();
			number1 = Integer.parseInt(aphend);
			operation = "-";
			screen.setText("");
		});
		multiply.setOnAction(e ->{
			String aphend = screen.getText().toString();
			number1 = Integer.parseInt(aphend);
			operation = "*";
			screen.setText("");
		});
		
		divide.setOnAction(e ->{
			String aphend = screen.getText().toString();
			number1 = Integer.parseInt(aphend);
			operation = "/";
			screen.setText("");
		});
		
		
		equals.setOnAction(e ->{
			String aphend = screen.getText().toString();
			number2 = Integer.parseInt(aphend);
			screen.setText("");
			DoOperations number = new DoOperations();
			
			if(operation.equals("+"))
			{
				double answer = number.add(number1, number2);
				aphend = Double.toString(answer);
				screen.setText(aphend);
				operation = "";
				number1 = answer;
			}
			if(operation.equals("-"))
			{
				double answer = number.subtract(number1, number2);
				aphend = Double.toString(answer);
				screen.setText(aphend);
				operation = "";
				number1 = answer;
			}
			if(operation.equals("*"))
			{
				double answer = number.multiply(number1, number2);
				aphend = Double.toString(answer);
				screen.setText(aphend);
				operation = "";
				number1 = answer;
			}
			if(operation.equals("/"))
			{
				double answer = number.divide(number1, number2);
				aphend = Double.toString(answer);
				screen.setText(aphend);
				operation = "";
				number1 = answer;
			}
			
			
		});
		
		clear.setOnAction(e ->{
			screen.setText("");
		});
	}
	
	
	
	
   public static void main(String [] args)
	{
		Application.launch(args);
	}
}