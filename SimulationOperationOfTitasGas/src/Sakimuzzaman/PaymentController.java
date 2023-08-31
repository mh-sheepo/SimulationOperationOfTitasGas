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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Md.Sakimuzzaman
 */
public class PaymentController implements Initializable {

    @FXML
    private TextField customerId;
    @FXML
    private TextField creditCardId;
    @FXML
    private TextField cardPinId;
    @FXML
    private Button goBackid;
    @FXML
    private Button submitBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackBtnOnClicked(ActionEvent event) {
    }

    @FXML
    private void submitBtnOnClicked(ActionEvent event) {
    }
    
}
