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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LeaveofAbsenceController implements Initializable {

    @FXML
    private Button LeaveOfAbsense;
    @FXML
    private DatePicker fromStart;
    @FXML
    private DatePicker ToEnd;
    @FXML
    private TextField reason;
    @FXML
    private TextField totalDays;
    @FXML
    private TextField joiningDate;
    @FXML
    private Button genereteLeave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonActionClick(ActionEvent event) {
    }

    @FXML
    private void handleButtonActionGenerteLeave(ActionEvent event) {
    }

    

    @FXML
    private void previous_button_leave_accounts(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DefaultDashbaord.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
    
}
