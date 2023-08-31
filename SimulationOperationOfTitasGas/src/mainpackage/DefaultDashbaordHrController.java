/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class DefaultDashbaordHrController implements Initializable {

    @FXML
    private Button homeButtonOnClick;
    private BorderPane borderPaneHr;
    @FXML
    private BorderPane boarderPaneHr;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   /* private void setScene(String name) {
        Parent borderCenter;
        try {
            borderCenter = FXMLLoader.load(getClass().getResource(name+".fxml"));
            borderPaneHr.setCenter(borderCenter);
        } catch (IOException ex) {
            Logger.getLogger(DefaultDashbaordHrController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/

   
    @FXML    private void logoutButtonOnClick(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("DefaultDashboardLogin.fxml"));
        Scene scene2 = new Scene(loginScene);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("Test");
        
        stg2.show();
    }

     @FXML    
    private void button1OnClick(ActionEvent event) throws IOException {
        
        
        Parent loginScene2 = FXMLLoader.load(getClass().getResource("AddNewEmployeeScene.fxml"));
        
        Scene scene2 = new Scene(loginScene2);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Companys");
        
        stg2.show();
    }
    
    
    @FXML
    private void button2OnClick(ActionEvent event)throws IOException {
        
        Parent s3 = FXMLLoader.load(getClass().getResource("AnnouncementNoticeScene.fxml"));
        Scene scene2 = new Scene(s3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show();
    } 

    @FXML
    private void button3OnClick(ActionEvent event) throws IOException {
        Parent loginScene3 = FXMLLoader.load(getClass().getResource("GeneratePayrollSheetScene.fxml"));
        Scene scene2 = new Scene(loginScene3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show(); {
        
     
    }
    }
    

    @FXML
    private void button4OnClick(ActionEvent event) throws IOException {
        Parent loginScene3 = FXMLLoader.load(getClass().getResource("EmployeeRecordScene.fxml"));
        Scene scene2 = new Scene(loginScene3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show(); {
        
     
    }
    }

    @FXML
    private void button5OnClick(ActionEvent event) throws IOException {
        Parent loginScene3 = FXMLLoader.load(getClass().getResource("ActiveEmployeeScene.fxml"));
        Scene scene2 = new Scene(loginScene3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show(); {
        
     
    }
    }

    @FXML
    private void button6OnClick(ActionEvent event) throws IOException {
        Parent loginScene3 = FXMLLoader.load(getClass().getResource("AssignTrainingProgramScene.fxml"));
        Scene scene2 = new Scene(loginScene3);
       
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        
        stg2.show(); {
        
     
    }
    }

    @FXML
    private void button7OnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("AddCompliantScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
       
    }

    @FXML
    private void button8OnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LeaveGrantRejectScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
       
    }

    @FXML
    private void homeButtonOnClick(ActionEvent event) {
        borderPaneHr.setCenter(null);
        
    }

    
}
