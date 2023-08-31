/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheepuScene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ViewBalanceSheets1Controller implements Initializable {

    @FXML
    private ListView<?> AccountBalSheetLabel;
    @FXML
    private Button showDetails;
    @FXML
    private TableColumn<?, ?> total_assets;
    @FXML
    private TableColumn<?, ?> total_current_assets;
    @FXML
    private TableColumn<?, ?> liabities_button;
    @FXML
    private TableColumn<?, ?> companyEquity_button;
    @FXML
    private TableColumn<?, ?> current_balance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showDetails_button(ActionEvent event) {
    }

    @FXML
    private void next_button_ac(ActionEvent event) {
    }

    @FXML
    private void previous_button_ac(ActionEvent event) {
    }
    
}
