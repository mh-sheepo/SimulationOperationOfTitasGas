/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sakimuzzaman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Md.Sakimuzzaman
 */
public class CustomerInfoController implements Initializable {

    @FXML
    private ComboBox<?> burnUnitComboBox;
    @FXML
    private Button submitBtnId;
    @FXML
    private Button cancelBtnId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showComboBoxitemOnCliked(ActionEvent event) {
    }

    @FXML
    private void submitBtnIdOnClicked(ActionEvent event) {
    }

    @FXML
    private void cancelBtnOnClicked(ActionEvent event) {
    }
    
}
