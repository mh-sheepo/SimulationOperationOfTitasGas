/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class AnnouncementNoticeSceneController implements Initializable {

    @FXML
    private TextArea announcementTextArea;
    @FXML
    private DatePicker noticeDatePicker;
    @FXML
    private Label announcementOutputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        
        //set currenttime and date to notice datepicker
        noticeDatePicker.setValue(currentDate);
        
    }    

    @FXML
    private void submitNoticeOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        
        Parent s3 = FXMLLoader.load(getClass().getResource("DefaultDashboardHr.fxml"));
        Scene scene2 = new Scene(s3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show();
    } 
            
}
