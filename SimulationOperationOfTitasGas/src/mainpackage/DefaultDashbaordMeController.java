/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class DefaultDashbaordMeController implements Initializable {

    @FXML
    private BorderPane boarderPaneMe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void button1OnClick(ActionEvent event) {
    }

    @FXML
    private void button2OnClick(ActionEvent event) {
    }

    @FXML
    private void button3OnClick(ActionEvent event) {
    }

    @FXML
    private void button4OnClick(ActionEvent event) {
    }

    @FXML
    private void button5OnClick(ActionEvent event) {
    }

    @FXML
    private void button6OnClick(ActionEvent event) {
    }

    @FXML
    private void button7OnClick(ActionEvent event) {
    }

    @FXML
    private void button8OnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void homeButtonOnClick(ActionEvent event) {
        boarderPaneMe.setCenter(null);
        
    }
    
}
