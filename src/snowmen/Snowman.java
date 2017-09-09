package snowmen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Vlado on 06.09.2017.
 */
public class Snowman extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(700);
        primaryStage.setHeight(700);
        primaryStage.setTitle("Snowman");

        Pane root = new Pane();


        TextField countField = new TextField();
        countField.setTranslateX(10);
        countField.setTranslateY(10);


        Button button = new Button("Generate Snowman");
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setOnMouseClicked(event -> {
            int count = Integer.parseInt(countField.getText());
                    root.getChildren().clear();
                    root.getChildren().addAll(Circles.generateCircles(count));
                    root.getChildren().addAll(button);
                });

            root.getChildren().addAll(button, countField);
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
