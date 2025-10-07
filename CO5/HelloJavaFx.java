import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFx extends Application
{
	@Override 
	public void start(Stage primarystage)
	{
		Button button = new Button("Click Here");
		button.setOnAction(e -> label.setText("Hello JavaFX"));

		Label label = new Label();

		Scene scene = new Scene(root, 300, 400);

		primarystage.setTitle("JAVAFX");
		primarystage.setScene(scene);
		primarystage.show();	

	}

public static void main(String[] args)
{
	launch(args);
}
}