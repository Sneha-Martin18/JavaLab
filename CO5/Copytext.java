import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Copytext extends Application
{
	@Override
	public void start(Stage primarystage)
	{
		TextField input = new TextField();
		TextField output = new TextField();
		output.setEditable(false);

		Button button = new Button("SUBMIT");

		button.setOnAction(e -> 
		{		
			String text = input.getText();
			output.setText(text);
		});

		VBox root = new VBox(30);
		root.getChildren().addAll(input, output,button);

		Scene scene = new Scene(root, 500, 600);


		primarystage.setTitle("COPY&DISPLAY");
		primarystage.setScene(scene);
		primarystage.show();

		}
		public static void main (String [] args)
		{
			launch(args);
		}


}