/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class AddNewClientsController implements Initializable {

    @FXML
    private TextField mothernameID;
    @FXML
    private TextField presentAdd;
    @FXML
    private TextField nameId;
    @FXML
    private TextField fathernameID;
    @FXML
    private TextField lineID;
    @FXML
    private TextField wilingtouseID;
    @FXML
    private TextField mobileID;
    @FXML
    private TextField permanentADD;
    @FXML
    private TextField nidID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonOnClickaddclientsubmit(MouseEvent event) {
    }
    
}
