/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sLiNK
 */
public class AddNewEmployeeSceneController implements Initializable {

    @FXML
    private TextField employeeId;
    @FXML
    private TextField employeeName;
    @FXML
    private TextField employeeNid;
    @FXML
    private DatePicker employeeDob;
    @FXML
    private TextField employeeContact;
    @FXML
    private TextField employeeEmergencyContact;
    @FXML
    private TextField employeeEmail;
    @FXML
    private DatePicker employeeDoj;
    @FXML
    private TextField employeeQualitification;
    @FXML
    private TextField employeeArea;
    @FXML
    private TextField employeeCity;
    @FXML
    private TextField employeeSalary;
    @FXML
    private TextField employeeLeaveBalance;
    @FXML
    private TextField employeePosting;
    @FXML
    private TextField employeeDesignation;
    @FXML
    private TextArea employeeAddress;
    @FXML
    private Tab employeeRecordTab1;
    @FXML
    private Tab addemployeeRecordTab2;

    @FXML
    private TableView<Employee> tableView;
    @FXML
    private ObservableList<Employee> employeeList;
    @FXML
    private TableColumn<?, ?> employeeIdColumn;
    @FXML
    private TableColumn<?, ?> employeeNameColumn;
    @FXML
    private TableColumn<?, ?> employeeNidColumn;
    @FXML
    private TableColumn<?, ?> employeeDobColumn;
    @FXML
    private TableColumn<?, ?> employeeContactColumn;
    @FXML
    private TableColumn<?, ?> employeeEmergencyContactColumn;
    @FXML
    private TableColumn<?, ?> employeeAddressColumn;
    @FXML
    private TableColumn<?, ?> employeeEmailColumn;
    @FXML
    private TableColumn<?, ?> employeeDojColumn;
    @FXML
    private TableColumn<?, ?> employeeQualificationColumn;
    @FXML
    private TableColumn<?, ?> employeeAreaColumn;
    @FXML
    private TableColumn<?, ?> employeeCityColumn;
    @FXML
    private TableColumn<?, ?> employeeSalaryColumn;
    @FXML
    private TableColumn<?, ?> employeeLeaveColumn;
    @FXML
    private TableColumn<?, ?> employeePostingColumn;
    @FXML
    private TableColumn<?, ?> employeeDesignationColumn;
    private static final String employeeFile = "employees.bin";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent loginScene3 = FXMLLoader.load(getClass().getResource("DefaultDashboardHr.fxml"));
        Scene scene2 = new Scene(loginScene3);

        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stg2.setScene(scene2);
        stg2.setTitle("TITAS GAS- Natural Gas Distribution Company");

        stg2.show();
        {

        }
    }

    @FXML
    private void populateEmployeeRecordTabOnClick(Event event) {
    }

    @FXML
    private void addEmployeeRecordButtonOnClick(ActionEvent event) {

    }
}
