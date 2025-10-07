import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label (initially empty)
        Label label = new Label();

        // Create a button
        Button button = new Button("Click Me");

        // Add action to the button
        button.setOnAction(e -> label.setText("Hello JavaFX"));

        // Layout
        VBox root = new VBox(10); // spacing = 10
        root.getChildren().addAll(button, label);

        // Scene
        Scene scene = new Scene(root, 300, 200);

        // Stage setup
        primaryStage.setTitle("JavaFX Hello App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
