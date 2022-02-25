
package javafx;

/**
 *
 * @author sayeem
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class JavaFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    //Stage -> Scene -> Layout -> node/text
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World Windows!");
        //HBox hb = new HBox();//Create a layout
        VBox hb = new VBox();//Create a layout
        hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER);
        
        Label lbl = new Label("Button Clicked!");
        lbl.setVisible(false);
        
        Button myButton = new Button("ok");//Create a node
//        myButton.setOnAction(new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent e) {
//                lbl.setVisible(true);
//            }
//        });
        myButton.setOnAction((ActionEvent e) -> {lbl.setVisible(true);});
        
        hb.getChildren().add(myButton);
        hb.getChildren().add(lbl);
        //hb.getChildren().addAll(lbl, myButton);
        
        
        Scene scene1 = new Scene(hb, 400, 400);
        
        primaryStage.setScene(scene1);
         
        primaryStage.show();
        
    }
}