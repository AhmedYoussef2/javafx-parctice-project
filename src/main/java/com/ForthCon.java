package com;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ForthCon {
    
    // @FXML 
    Image myimage=new Image(getClass().getResourceAsStream("po/giraffe.jpg"));
    @FXML
    ImageView  kon;
    @FXML
    Button fg;
           
    @FXML
    public void switchToP(ActionEvent event)  throws IOException{
        // App.setRoot("secondary");
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("primary.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root,600,700);
        // stage.setScene(scene);
        // stage.show();
       
    }
    public void mk(){
        kon.setImage(myimage);
    }
}
