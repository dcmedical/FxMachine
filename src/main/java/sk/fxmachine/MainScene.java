package sk.fxmachine;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainScene extends Application {

    @FXML
    private TextField urlTextField;

    @Override
    public void start(Stage stage) throws Exception {
        //TODO using: https://reqbin.com/
        System.out.println("Application is running");
        FXMLLoader loader = new FXMLLoader(MainScene.class.getResource("MainScene.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onSendButtonAction() {
        //TODO implement action
    }

    public void onResetButtonAction() {
        //TODO implement action
    }
}
