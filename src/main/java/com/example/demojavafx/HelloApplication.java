package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 800);
        stage.setTitle("Post-it para CallCenter");
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/com/example/demojavafx/style.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}