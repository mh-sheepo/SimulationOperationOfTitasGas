/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sakimuzzaman;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class DefaultDashbaordController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("/mainpackage/DefaultDashboardLogin.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();

    }
    
}
