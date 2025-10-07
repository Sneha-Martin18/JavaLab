import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorSwitcher extends Application {

    // Model: the two colors and a StringProperty for the current color name
    private final Color color1 = Color.RED;
    private final Color color2 = Color.BLUE;
    private final StringProperty currentColorName = new SimpleStringProperty("RED");

    @Override
    public void start(Stage stage) {
        // Rectangle (UI)
        Rectangle rect = new Rectangle(200, 120, color1);

        // Label bound to currentColorName (binding requirement)
        Label colorLabel = new Label();
        colorLabel.textProperty().bind(currentColorName);

        // ToggleButton
        ToggleButton toggleButton = new ToggleButton("Switch Color");
        // When button is clicked, swap rectangle fill and update the StringProperty
        toggleButton.setOnAction(e -> {
            if (rect.getFill().equals(color1)) {
                rect.setFill(color2);
                currentColorName.set("BLUE");
            } else {
                rect.setFill(color1);
                currentColorName.set("RED");
            }
        });

        // Layout
        VBox root = new VBox(12, rect, toggleButton, colorLabel);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 20;");

        stage.setScene(new Scene(root, 360, 300));
        stage.setTitle("Color Switcher (Simple)");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
