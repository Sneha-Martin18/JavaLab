import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Display extends Application
{
	public void start(Stage primarystage)
	{
		Button click = new Button("Click");
		Label label = new Label();

		click.setOnAction(e -> label.setText("Hello Hai") );

		VBox root = new VBox(10);
		root.getChildren().addAll(click,label);

		Scene scene= new Scene(root, 500, 400);
		primarystage.setTitle("ff");
		primarystage.setScene(scene);
		primarystage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}