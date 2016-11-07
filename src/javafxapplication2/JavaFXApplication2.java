/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.awt.Rectangle;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(50));
        
        Button btn = new Button("_hehe");
        Tooltip tooltip = new Tooltip("kliknij tooo!");
        Tooltip.install(btn, tooltip);
        
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
            Platform.exit();
        });
        
        Button btn2 = new Button("_przycisk");
        Tooltip tooltip2 = new Tooltip("kliknij tooo!");
        Tooltip.install(btn, tooltip);
        
        btn2.setOnAction((ActionEvent event) -> {
            System.out.println("HAHAHAHAHAHAHAHAHAHAHAHHAHAHAHAHAHAHAHAHAH");
        });
    Pane root2 = new Pane();
        
        
         
        
       
        
        Line line = new Line(90, 40, 230, 40);
        line.setStroke(Color.BLACK);
        
        Circle circle = new Circle(130, 130, 30);
        circle.setFill(Color.CHOCOLATE);
        
        root2.getChildren().addAll(line, circle);

        Scene scene = new Scene(root, 250, 220, Color.WHITESMOKE);
        
        scene.getStylesheets().add(this.getClass().getResource("css.css")
                .toExternalForm());
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
       
        
        Text lbl = new Text("Simple JavaFX application.");
        lbl.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
        root.getChildren().add(lbl);
        
        lbl.setId("text");
        root.setId("root");
        
        
        root.getChildren().add(root2);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
