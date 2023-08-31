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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class U6GenerateRequisitionSceneController implements Initializable {

    @FXML
    private TextField productNameTextId;
    @FXML
    private Label employeeRequisitionNameTextLabel;
    @FXML
    private Label requisitionNameLabel;
    @FXML
    private DatePicker requsitionDatePicker;
    @FXML
    private ComboBox<?> LocationComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent loginScene3 = FXMLLoader.load(getClass().getResource("DefaultDashboardMe.fxml"));
        Scene scene2 = new Scene(loginScene3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show(); {
        
     
    }
    }

    @FXML
    private void generateRequsitionButtonOnClick(ActionEvent event){
    }
    
}
