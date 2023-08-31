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
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ViewReceivedPaymentsController implements Initializable {

    @FXML
    private ListView<?> ViewPaymentsRecordsLabel;
    @FXML
    private Button receivedPayments;
    @FXML
    private TableColumn<?, ?> date_of_payment;
    @FXML
    private TableColumn<?, ?> payment_perpous;
    @FXML
    private TableColumn<?, ?> transaction_no;
    @FXML
    private TableColumn<?, ?> payment_method;
    @FXML
    private TableColumn<?, ?> uid_no;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void previous_button_receivedPay(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DefaultDashbaord.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
        
    }

    @FXML
    private void receivedPayments_button(ActionEvent event) {
    }

    @FXML
    private void todaysRecord_button(ActionEvent event) {
    }

    @FXML
    private void monthlyRecords_button(ActionEvent event) {
    }

    @FXML
    private void details_button(ActionEvent event) {
    }

    @FXML
    private void next_button_receivedPay(ActionEvent event) {
    }
    
}
