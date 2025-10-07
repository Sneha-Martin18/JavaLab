import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class Clear extends Application
{
	public void start(Stage primarystage)
	{
		TextField text = new TextField();
		Label label= new Label();
		Button showbutton = new Button("Show");
		Button clearbutton = new Button("Clear");

		showbutton.setOnAction(e ->  label.setText(text.getText()));
		clearbutton.setOnAction(e -> {
									text.clear();
									label.setText("");});
		VBox root = new VBox(10);
		root.getChildren().addAll(text, label, showbutton,clearbutton);

		Scene scene = new Scene(root, 500, 600);
		primarystage.setTitle("SHOWANDCLEAR");
		primarystage.setScene(scene);
		primarystage.show();
	}
	public static void main (String[] args)
	{
		launch(args);
	}
}
