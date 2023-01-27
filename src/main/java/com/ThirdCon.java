package com;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// import javafx.scene.image.Image;

public class ThirdCon {
    // Image myimage=new Image(getClass().getResourceAsStream("elephant.png"));

    @FXML
    private void switchToPrimary(ActionEvent event) throws IOException {
        // App.setRoot("secondary");
        FXMLLoader loader=new FXMLLoader(getClass().getResource("forth.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,700);
        stage.setScene(scene);
        stage.show();
    
        ForthCon forthCon=loader.getController();
        forthCon.mk();

        
}
}