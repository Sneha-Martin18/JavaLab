import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Add extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create RadioButtons
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        // Group them so only one can be selected
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        // Label to show result
        Label result = new Label("Select your gender");

        // Listener for selection
        genderGroup.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                RadioButton selected = (RadioButton) newVal;
                result.setText("You selected: " + selected.getText());
            }
        });

        // Layout
        VBox root = new VBox(10, male, female, result);

        // Scene
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Gender Selection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
