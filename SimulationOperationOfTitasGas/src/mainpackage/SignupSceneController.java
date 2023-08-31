/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class SignupSceneController implements Initializable {

    @FXML
    private TextField nameTextId;
    @FXML
    private TextField passwordTextId;
    @FXML
    private ComboBox<String> signupComboBox;

    private List<User> userList;
    private File file;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        signupComboBox.getItems().addAll("Managing Director", "Customer", "Accountant", "Customer Support", "Head Of HR", "Maintenance Engineer", "Operations Manager", "Procurement and Inventory Control Manager");
    signupComboBox.setValue("Customer");

    file = new File("user.bin");
    if (file.exists()) {
        
        //object to file write . read inputstream write outputstream
        
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            
            userList = (List<User>) inputStream.readObject();
            
            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            userList = new ArrayList<>();
        }
    } 
    else {
        userList = new ArrayList<>();
    }
}

    @FXML
    private void createNewUserOnClick(ActionEvent event) {

        String username = nameTextId.getText();
        String password = passwordTextId.getText();
        String userType = signupComboBox.getValue();

        User user = new User(username, password, userType);
        userList.add(user);
        nameTextId.clear();
        passwordTextId.clear();
        signupComboBox.setValue("Customer");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(userList);
        } catch (IOException e) {
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("DefaultDashboardLogin.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");
        stg2.show();

    }

}
