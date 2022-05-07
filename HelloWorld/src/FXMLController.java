/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jannat
 */
public class FXMLController implements Initializable {

    @FXML
    private CheckBox phy;
    @FXML
    private CheckBox chem;
    @FXML
    private CheckBox bio;
    @FXML
    private Label subLabel;
    
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    @FXML private RadioButton phpRadioButton;
    @FXML private RadioButton javaRadioButton;
    @FXML private RadioButton cSharpRadioButton;
    @FXML private RadioButton cPlusPlusRadioButton;
    @FXML private Label radioButtonLabel;
    private ToggleGroup favLangToggleGroup;
    
    @FXML private ListView listView;
    @FXML private TextArea golfTextArea;
    /**
     * Initializes the controller class.
     */
    public void subjectButtonPushed(){
        String choice = "You have chosen: ";
        if(phy.isSelected()){
            choice+="Physics";
        }
        if(chem.isSelected()){
            choice+="Chemistry";
        }
        if(bio.isSelected()){
            choice+="Biology";
        }
        subLabel.setText(choice);
    }
    public void choiceBoxButtonPushed(){
        choiceBoxLabel.setText("My Favourite Fruit is: " + choiceBox.getValue().toString());
    }
    public void comboBoxWasUpdated(){
        this.comboBoxLabel.setText("Courses selected: \n" + comboBox.getValue().toString());
    }
    
    public void radioButtonUpdated(){
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.cPlusPlusRadioButton)){
            radioButtonLabel.setText("The selected item is: c++");
        }
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.cSharpRadioButton)){
            radioButtonLabel.setText("The selected item is: c#");
        }
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.javaRadioButton)){
            radioButtonLabel.setText("The selected item is: Java");
        }
        if(this.favLangToggleGroup.getSelectedToggle().equals(this.phpRadioButton)){
            radioButtonLabel.setText("The selected item is: PHP");
        }
    }
    
    public void listViewButtonPushed(){
        String textAreaString="";
        
        ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();
        
        for(Object item : listOfItems){
            textAreaString+= String.format("%s%n",(String)item);
        }
        this.golfTextArea.setText(textAreaString);
    }
    
    public void changeScreenButtonPushed(ActionEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("TableView.fxml"));
        
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        subLabel.setText("");
        
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Oranges","pears","strawberries");
        
        comboBox.getItems().add("MGMT1003");
        comboBox.getItems().addAll("TTTT4004","AKSH569","OP909","JHT855");
        comboBoxLabel.setText("");
        
        radioButtonLabel.setText("");
        favLangToggleGroup = new ToggleGroup();
        this.phpRadioButton.setToggleGroup(favLangToggleGroup);
        this.javaRadioButton.setToggleGroup(favLangToggleGroup);
        this.cPlusPlusRadioButton.setToggleGroup(favLangToggleGroup);
        this.cSharpRadioButton.setToggleGroup(favLangToggleGroup);
        
        listView.getItems().addAll("Golf Balls","Wedges","Irons","Tees","Driver","Putter");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    
    
}
