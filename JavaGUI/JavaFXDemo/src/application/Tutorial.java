package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
 
public class Tutorial extends Application {

    @Override
    public void start(Stage window) {
        window.setTitle("Hello World!");
        window.show();
    }

    public static void main(String[] args) {
        launch(Tutorial.class);
    }
}
 
 

