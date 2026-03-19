import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello JavaFX!");

        // Create Buttons
        Button btn1 = new Button("Click Me");
        Button btn2 = new Button("Reset");

        // Button Actions (Event Handling)
        btn1.setOnAction(e -> {
            label.setText("Button Clicked!");
        });

        btn2.setOnAction(e -> {
            label.setText("Hello JavaFX!");
        });

        // Layout
        VBox root = new VBox(10); // spacing = 10
        root.getChildren().addAll(label, btn1, btn2);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX Buttons Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}  

