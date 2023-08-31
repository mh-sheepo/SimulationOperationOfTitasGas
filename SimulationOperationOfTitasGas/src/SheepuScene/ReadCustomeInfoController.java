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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ReadCustomeInfoController implements Initializable {

    @FXML
    private TextField uniqueID;
    @FXML
    private TableColumn<?, ?> uid_info;
    @FXML
    private TableColumn<?, ?> meterno_info;
    @FXML
    private TableColumn<?, ?> name_info;
    @FXML
    private TableColumn<?, ?> address_info;
    @FXML
    private TableColumn<?, ?> phone_no;
    @FXML
    private TableColumn<?, ?> line_category;
    @FXML
    private TableColumn<?, ?> zone_info;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



    @FXML
    private void nextCinfo(ActionEvent event) {
        
        
        
    }

    @FXML
    private void previousCinfo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DefaultDashbaordofCC.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
    }

    @FXML
    private void read_customer_info(ActionEvent event) {
    }

    @FXML
    private void submit_button(ActionEvent event) {
    }
    
}
