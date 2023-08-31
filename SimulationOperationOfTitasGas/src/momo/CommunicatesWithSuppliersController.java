/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momo;

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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Momo
 */
public class CommunicatesWithSuppliersController implements Initializable {

    @FXML
    private TextArea textarea;
    @FXML
    private Button sendfxid;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void previous_button(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DefaultDashbaord08.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void next_button(ActionEvent event) throws IOException {
       
    }

    @FXML
    private void logout_button(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("/mainpackage/DefaultDashboardLogin.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
    }
    
}
