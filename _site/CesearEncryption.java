import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CesearEncryption extends Application{

	private Pane pane = new Pane();
	private Scene scene = new Scene(pane, 700, 500);
	
	private TextArea areaToEncrypt = new TextArea();
	private TextArea areaEncrypted = new TextArea();
	
	private ObservableList<Integer> shifts = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7,
			8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
	final ComboBox combo = new ComboBox(shifts);
	
	private Label label = new Label("Pick Shift:");
	private Button encrypt = new Button("Encrypt Text!");
	private String answer = "";
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		addItems();
		addShiftOptions();
		setButtonAction();
		
		primaryStage.setTitle("Ceaser Encryption");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void setButtonAction()
	{
		encrypt.setOnAction(e ->{
			stuff();
			areaEncrypted.setText("");
			areaEncrypted.setText(answer);
			answer = "";
		});
	}
	
	public void addShiftOptions()
	{
		label.setTranslateX(350);
		label.setTranslateY(40);
		
		combo.setTranslateX(350);
		combo.setTranslateY(70);
		combo.setValue("Shift");
		
		encrypt.setTranslateX(350);
		encrypt.setTranslateY(110);
		
		pane.getChildren().addAll(combo, label, encrypt);
	}
	
	public void addItems()
	{
		areaToEncrypt.setPrefWidth(300);
		areaToEncrypt.setTranslateX(10);
		areaToEncrypt.setTranslateY(10);
		areaToEncrypt.setText("Enter a phrase, sentece or paragraph.");
		areaToEncrypt.setWrapText(true);
		
		areaEncrypted.setPrefWidth(300);
		areaEncrypted.setTranslateX(10);
		areaEncrypted.setTranslateY(270);
		areaEncrypted.setWrapText(true);
		areaEncrypted.setEditable(false);
		
		pane.getChildren().addAll(areaToEncrypt, areaEncrypted);
	}
	
	public void stuff()
	{
		int shift = (int) combo.getValue();
		String sentence = areaToEncrypt.getText().toString();
		
		String encoded[] = encode(shift, sentence);
		
		for(int i = 0; i < encoded.length; i++)
		{
			answer = answer + encoded[i];
		}
	}
	
	
	public String[] encode(int shift, String sentence)
	{
		String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String encodeAlphabet[] = new String[26];
		
		int counter = shift - 1;
		
		for(int i = 0; i < encodeAlphabet.length; i++)
		{
			if(counter != 25)
			{
				encodeAlphabet[i] = alphabet[counter];
				counter++;
			}
			else if((counter == 25) && (i != 25))
			{
				counter = 0;
				encodeAlphabet[i] = alphabet[counter];
				counter++;
			}
			
		}
		
		String encodedSentence[] = new String[sentence.length()];
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == 'a')
			{
				encodedSentence[i] = encodeAlphabet[0];
			}
			else if(sentence.charAt(i) == 'b')
			{
				encodedSentence[i] = encodeAlphabet[1];
			}
			else if(sentence.charAt(i) == 'c')
			{
				encodedSentence[i] = encodeAlphabet[2];
			}
			else if(sentence.charAt(i) == 'd')
			{
				encodedSentence[i] = encodeAlphabet[3];
			}
			else if(sentence.charAt(i) == 'e')
			{
				encodedSentence[i] = encodeAlphabet[4];
			}
			else if(sentence.charAt(i) == 'f')
			{
				encodedSentence[i] = encodeAlphabet[5];
			}
			else if(sentence.charAt(i) == 'g')
			{
				encodedSentence[i] = encodeAlphabet[6];
			}
			else if(sentence.charAt(i) == 'h')
			{
				encodedSentence[i] = encodeAlphabet[7];
			}
			else if(sentence.charAt(i) == 'i')
			{
				encodedSentence[i] = encodeAlphabet[8];
			}
			else if(sentence.charAt(i) == 'j')
			{
				encodedSentence[i] = encodeAlphabet[9];
			}
			else if(sentence.charAt(i) == 'k')
			{
				encodedSentence[i] = encodeAlphabet[10];
			}
			else if(sentence.charAt(i) == 'l')
			{
				encodedSentence[i] = encodeAlphabet[11];
			}
			else if(sentence.charAt(i) == 'm')
			{
				encodedSentence[i] = encodeAlphabet[12];
			}
			else if(sentence.charAt(i) == 'n')
			{
				encodedSentence[i] = encodeAlphabet[13];
			}
			else if(sentence.charAt(i) == 'o')
			{
				encodedSentence[i] = encodeAlphabet[14];
			}
			else if(sentence.charAt(i) == 'p')
			{
				encodedSentence[i] = encodeAlphabet[15];
			}
			else if(sentence.charAt(i) == 'q')
			{
				encodedSentence[i] = encodeAlphabet[16];
			}
			else if(sentence.charAt(i) == 'r')
			{
				encodedSentence[i] = encodeAlphabet[17];
			}
			else if(sentence.charAt(i) == 's')
			{
				encodedSentence[i] = encodeAlphabet[18];
			}
			else if(sentence.charAt(i) == 't')
			{
				encodedSentence[i] = encodeAlphabet[19];
			}
			else if(sentence.charAt(i) == 'u')
			{
				encodedSentence[i] = encodeAlphabet[20];
			}
			else if(sentence.charAt(i) == 'v')
			{
				encodedSentence[i] = encodeAlphabet[21];
			}
			else if(sentence.charAt(i) == 'w')
			{
				encodedSentence[i] = encodeAlphabet[22];
			}
			else if(sentence.charAt(i) == 'x')
			{
				encodedSentence[i] = encodeAlphabet[23];
			}
			else if(sentence.charAt(i) == 'y')
			{
				encodedSentence[i] = encodeAlphabet[24];
			}
			else if(sentence.charAt(i) == 'z')
			{
				encodedSentence[i] = encodeAlphabet[25];
			}
			else if(sentence.charAt(i) == ' ')
			{
				encodedSentence[i] = " ";
			}
			else
			{
				 String character = Character.toString(sentence.charAt(i));
				 encodedSentence[i] = character;
			}
			
		}
		
		return encodedSentence;
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
}
