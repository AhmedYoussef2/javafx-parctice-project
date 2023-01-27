package com;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SecondaryController {

    @FXML
    Label l1;
    @FXML
    private void switchToThird(ActionEvent event) throws IOException {
        // App.setRoot("primary");
        FXMLLoader loader=new FXMLLoader(getClass().getResource("thrid.fxml"));
        Parent root=loader.load();

        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root,600,700);
        stage.setScene(scene);
        stage.show();
        
    }
    public void trop(){
     l1.setText("qqqqqqqqqqqqqqqqq");
    }
}