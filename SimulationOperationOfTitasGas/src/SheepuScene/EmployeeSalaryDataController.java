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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class EmployeeSalaryDataController implements Initializable {

    @FXML
    private TextField job_uid;
    @FXML
    private TableView<?> saleryDataView_table;
    @FXML
    private TableColumn<?, ?> name_employee;
    @FXML
    private TableColumn<?, ?> uid_employee;
    @FXML
    private TableColumn<?, ?> designation_employee;
    @FXML
    private TableColumn<?, ?> mainScale_employee;
    @FXML
    private TableColumn<?, ?> grade_employee;
    @FXML
    private TableColumn<?, ?> total_amount_employee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



    @FXML
    private void previous_button_salarydata(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DefaultDashbaord.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
    }

    @FXML
    private void salery_data_button_ac(ActionEvent event) {
    }

    @FXML
    private void view_button_salarydata(ActionEvent event) {
    }

    @FXML
    private void next_button_salarydata(ActionEvent event) {
    }
    
}
