/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author sLiNK
 */
public class MainApplication extends Application {
    
    @Override
    public void start(Stage TitasGas) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpackage/DefaultDashboardLogin.fxml"));
               
        Scene Home = new Scene(root);
        TitasGas.setScene(Home);
        TitasGas.setTitle("TITAS GAS- Natural Gas Distribution Company");
        TitasGas.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
