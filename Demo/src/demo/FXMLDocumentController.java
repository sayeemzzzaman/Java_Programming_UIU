/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 *
 * @author Jannat
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private CheckBox phy;
    
    @FXML
    private CheckBox chem;
    
    @FXML
    private CheckBox bio;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void whenClicked(){
        String choice = "You have chosen: ";
        if(phy.isSelected())choice+="Physics ";
        if(chem.isSelected())choice+="Chemistry ";
        if(bio.isSelected())choice+="Biology ";
        label.setText(choice);
    }
    
}
