/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

/**
 *
 * @author sayeem
 */
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class LoginApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)throws Exception {
        primaryStage.setTitle("Login");
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.TOP_CENTER);
        
        Label username = new Label("Username:");
        gp.add(username, 0, 0);
        
        TextField usernameText = new TextField();
        gp.add(usernameText, 1, 0);
        
        Label passwordText = new Label("Password:");
        gp.add(passwordText, 0, 1);
        
        PasswordField pass = new PasswordField();
        gp.add(pass, 1, 1);
        
        Button loginButton = new Button("Login");
        gp.add(loginButton, 0, 2);
        
        
        Image fbLogo = new Image(new FileInputStream("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\LoginApp\\src\\loginapp\\logo.png"));
        ImageView fbLogoImage = new ImageView(fbLogo);
        fbLogoImage.fitWidthProperty().bind(primaryStage.widthProperty());
        
        VBox vb = new VBox();
        vb.getChildren().add(fbLogoImage);
        vb.getChildren().add(gp);
       
        
        Scene loginScene = new Scene(vb, 400, 400);
        primaryStage.setScene(loginScene);
         
        primaryStage.show();
        
    }
}