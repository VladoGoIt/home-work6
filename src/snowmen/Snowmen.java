package snowmen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Vlado on 06.09.2017.
 */
public class Snowmen extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(700);
        primaryStage.setHeight(700);
        primaryStage.setTitle("Snowmen");

        Pane root = new Pane();


        Button button = new Button();
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setText("Enter");
        button.setOnMouseClicked(event -> {
                    root.getChildren().clear();
                    root.getChildren().addAll(Circles.generateCircles(10));
                    root.getChildren().addAll(button);
                });

            Scene scene = new Scene(root);
            root.getChildren().addAll(button);
            primaryStage.setScene(scene);
            primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
