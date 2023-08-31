/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class DefaultDashboardLoginController implements Initializable {

    @FXML
    private TextField usernameTextField;
    @FXML
    private ComboBox<String> comboBoxUserType;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Label systemDateLabel;
    @FXML
    private Label systemTimeLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        comboBoxUserType.getItems().addAll("Managing Director", "Customer", "Accountant", "Customer Support", "Head Of HR", "Maintenance Engineer", "Operations Manager", "Procurement and Inventory Control Manager");
        comboBoxUserType.setValue("Head Of HR");
        updateDateTimeLabel();
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {

        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String userType = comboBoxUserType.getValue();

        // Reading from user list from the binary file created in signup page
        File file = new File("user.bin");
        List<User> userList = null;

        if (file.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                userList = (List<User>) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
            }
        }
        boolean isUserVerified = false;

        if (userList != null) {
            for (User user : userList) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)
                        && user.getUserType().equals(userType)) {
                    isUserVerified = true;
                    break;
                }
            }
        }
        if (isUserVerified) {
            String fxmlPath = "";

            switch (userType) {
                case "Managing Director":
                    fxmlPath = "/Sakimuzzaman/DefaultDashbaord.fxml";
                    break;
                case "Customer":
                    fxmlPath = "/Sakimuzzaman/CustomerDashboard.fxml";
                    break;
                case "Accountant":
                    fxmlPath = "/SheepuScene/DefaultDashbaord.fxml";
                    break;
                case "Customer Support":
                    fxmlPath = "/SheepuScene/DefaultDashbaordofCC.fxml";
                    break;
                case "Head Of HR":
                    fxmlPath = "/mainpackage/DefaultDashboardHr.fxml";
                    break;
                case "Maintenance Engineer":
                    fxmlPath = "/mainpackage/DefaultDashboardMe.fxml";
                    break;
                case "Operations Manager":
                    fxmlPath = "/momo/DefaultDashbaord07.fxml";
                    break;
                case "Procurement and Inventory Control Manager":
                    fxmlPath = "/momo/DefaultDashbaord08.fxml";
                    break;
            }

            Parent parent = FXMLLoader.load(getClass().getResource(fxmlPath));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle(userType + " Dashboard");
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Invalid credentials");
            alert.setContentText("Please enter valid credentials.");
            alert.showAndWait();
        }
    }

    // Load the corresponding scene
    /* if (isUserVerified) {
            if (userType.equals("Managing Director")) {
                Parent managingDirectorParent = FXMLLoader.load(getClass().getResource("/sakimuzzaman/DefaultDashbaord.fxml"));
                Scene managingDirectorScene = new Scene(managingDirectorParent);
                Stage managingDirectorStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                managingDirectorStage.setScene(managingDirectorScene);
                managingDirectorStage.setTitle("Managing Director Dashboard");
                managingDirectorStage.show();
            } else if (userType.equals("Customer")) {
                Parent customerParent = FXMLLoader.load(getClass().getResource("/sakimuzzaman/CustomerDashboard.fxml"));
                Scene customerScene = new Scene(customerParent);
                Stage customerStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                customerStage.setScene(customerScene);
                customerStage.setTitle("Customer Dashboard");
                customerStage.show();
            } else if (userType.equals("Accountant")) {
                Parent accountantParent = FXMLLoader.load(getClass().getResource("/SheepuScene/DefaultDashbaord.fxml"));
                Scene accountantScene = new Scene(accountantParent);
                Stage accountantStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                accountantStage.setScene(accountantScene);
                accountantStage.setTitle("Accountant Dashboard");
                accountantStage.show();
            } else if (userType.equals("Customer Support")) {
                Parent customerParent = FXMLLoader.load(getClass().getResource("/SheepuScene/DefaultDashbaordofCC.fxml"));
                Scene customerScene = new Scene(customerParent);
                Stage customerStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                customerStage.setScene(customerScene);
                customerStage.setTitle("Customer Support Dashboard");
                customerStage.show();
            } else if (userType.equals("Head Of HR")) {
                Parent headOfHrParent = FXMLLoader.load(getClass().getResource("/mainpackage/DefaultDashboardHr.fxml"));
                Scene hRScene = new Scene(headOfHrParent);
                Stage hrStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                hrStage.setScene(hRScene);
                hrStage.setTitle("Head Of HR Dashboard");
                hrStage.show();

            } else if (userType.equals("Maintenance Engineer")) {
                Parent headOfHrParent = FXMLLoader.load(getClass().getResource("/mainpackage/DefaultDashboardMe.fxml"));
                Scene mEScene = new Scene(headOfHrParent);
                Stage mEStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                mEStage.setScene(mEScene);
                mEStage.setTitle("Maintenance Engineer Dashboard");
                mEStage.show();
            } else if (userType.equals("Operations Manager")) {
                Parent accountantParent = FXMLLoader.load(getClass().getResource("/momo/DefaultDashbaord07.fxml"));
                Scene oMScene = new Scene(accountantParent);
                Stage oMStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                oMStage.setScene(oMScene);
                oMStage.setTitle("Operations Manager Dashboard");
                oMStage.show();

            } else if (userType.equals("Procurement and Inventory Control Manager")) {
                Parent headOfHrParent = FXMLLoader.load(getClass().getResource("/mainpackage/DefaultDashboardHr.fxml"));
                Scene pAIScene = new Scene(headOfHrParent);
                Stage pAIStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                pAIStage.setScene(pAIScene);
                pAIStage.setTitle("Procurement and Inventory Control Manager Dashboard");
                pAIStage.show();
            }

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Invalid credentials");
            alert.setContentText("Please enter valid credentials.");
            alert.showAndWait();
        }
     */
    //Old code to switch scenes
    /*Parent scene2Parent = FXMLLoader.load(getClass().getResource("DefaultDashboardHr.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        
        
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();
       
    }
     */

    @FXML
        private void exitButtonOnclick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
        private void signupButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("SignupScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);

        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();

    }

    public void updateDateTimeLabel() {

        DateTimeFormatter setFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        String stringCurrentDateAndTime = currentDateAndTime.format(setFormat);
        systemDateLabel.setText(stringCurrentDateAndTime);

        //changing time formate to am/pm, or 24 hr format
        DateTimeFormatter setTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime currentTimeOnly = LocalDateTime.now();
        String stringCurrentTime = currentTimeOnly.format(setTimeFormat);
        systemTimeLabel.setText(stringCurrentTime);
    }

    @FXML
    private void aboutUsButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("/mainpackage/AboutUs.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("Photgraphy About US");
        stg2.show();

    }
}