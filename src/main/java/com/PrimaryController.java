package com;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        // App.setRoot("secondary");
        FXMLLoader loader=new FXMLLoader(getClass().getResource("secondary.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,700);
        stage.setScene(scene);
        stage.show();
        

        SecondaryController secondaryController=loader.getController();
        secondaryController.trop();
    }
}
