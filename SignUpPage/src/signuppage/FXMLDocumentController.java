/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package signuppage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Jannat
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private Label error;
    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private TextField emailId;
    @FXML private TextField userName;
    @FXML private PasswordField password;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public void registerClicked(){
        
        String fName = firstName.getText().trim();
        String lName = lastName.getText().trim();
        String uName = userName.getText().trim();
        String email = emailId.getText().trim();
        String pass = password.getText().trim();
        if(isNumeric(fName) || isNumeric(lName)){
            error.setText("Invalid Input");
        }
        if(!email.contains("@") || !email.contains(".com"))error.setText("Email ID is invalid");
        //else error.setText("");
        if(fName.isEmpty() || lName.isEmpty() || uName.isEmpty() || email.isEmpty() || pass.isEmpty()){
            error.setText("You have missing fields");
        }
        
        
    }
    
}
