/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class AddCompliantSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewComplaintsRecordOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("ViewEmployeeComplaintRecordScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
       
    }

    @FXML
    private void showComplaintsRecordSceneOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("EmployeeAddComplaintScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
       
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("DefaultDashboardHr.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
       
    }
    
}
