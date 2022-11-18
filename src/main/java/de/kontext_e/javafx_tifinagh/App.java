package de.kontext_e.javafx_tifinagh;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application {

    private static final String MESSAGE = "Hello World! " + "ⴰⵎⴰⵟⴰⴼ";

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(MESSAGE);

        Label label = new Label(MESSAGE);

        Button button = new Button();
        button.setText("Say "+ MESSAGE);
        button.setOnAction(event -> System.out.println(MESSAGE));

        // try any font here: Arial, Consolas, Times New Roman...
        Font font = Font.font("Arial", FontWeight.NORMAL, 15);
        button.setFont(font);
        label.setFont(font);

        StackPane root = new StackPane();
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, button);
        root.getChildren().addAll(vBox);
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }
}
