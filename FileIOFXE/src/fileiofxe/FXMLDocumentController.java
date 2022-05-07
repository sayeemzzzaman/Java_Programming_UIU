/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package demo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Jannat
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML Label data;
    @FXML Label readLabel;
    @FXML TextField nameTf;
    @FXML TextField ageTf;
    @FXML Button writeBtn;
    @FXML Button readBtn;
    
    @FXML
    private void writeButtonClicked() throws Exception {
        String name = nameTf.getText();
        String age = ageTf.getText();
        
        File file = new File("Info.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        
        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter buff = new BufferedWriter(fWriter);
        
        String toWrite = name + ";" + age + "\n";
        buff.write(toWrite);
        buff.close();
        data.setText("Data Added Successfully!");
        nameTf.setText("");
        ageTf.setText("");
        
    }
    public void readButtonClicked() throws Exception{
        File fileObj = new File("Info.txt");
        Scanner fsc = new Scanner(fileObj);
        String toLabel = "";
        while(fsc.hasNextLine()){
            String line = fsc.nextLine();
            if(!line.equals("")){
                String arr[] = line.split(";");
                String out = "Name: " + arr[0] + " Age: " + arr[1] + "\n";
                toLabel = toLabel + out;
            }
        }
        readLabel.setText(toLabel);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
