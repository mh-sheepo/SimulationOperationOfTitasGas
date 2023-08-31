/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheepuScene;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LeaveofAbsenceCCController implements Initializable {

    @FXML
    private AnchorPane leave_of_absense_label_cc;
    @FXML
    private DatePicker fromStart_cc;
    @FXML
    private DatePicker toEnd_cc;
    @FXML
    private TextField reason_cc;
    @FXML
    private TextField totalDays_cc;
    @FXML
    private TextField joiningDate_cc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    @FXML
    private void next_leaveOfabsense_button(ActionEvent event) {
    }

    @FXML
    private void previous_leaveOfabsense_button(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DefaultDashbaordofCC.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void leaveOfAbsense(ActionEvent event) {
    }

    @FXML
    private void handleButtonActionGenereteLeave(ActionEvent event) {
    }
    
}
