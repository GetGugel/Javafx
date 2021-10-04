package com.mycompany.week6_gui_demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        Line ln1 = new Line(400,400,600,600);
        Line ln2 = new Line(600,600,400,600);
        Line ln3 = new Line(400,400,400,600);
                  
        

        var label1 = new Label("Hello, Brett" + javafxVersion +
                ", running on Java " + javaVersion + ".");
        var labell2 = new Label("34567");
        
        Rectangle rect = new Rectangle(50,50,300,300);
        rect.setFill(Color.LIGHTGREEN);
        ln1.setFill(Color.LIGHTGREEN);
        
        
       
                
                
        
        labell2.setLayoutX(100);
        labell2.setLayoutY(100);
        
        
        
        
        Group sp= new Group(label1,labell2,ln1,ln2,ln3,rect);
        
        Button[] svrlBtns= new Button[5];
        for (int i = 0; i < 5; i++) {
            svrlBtns[i] = new Button();
            svrlBtns[i].setLayoutX(500+(i*20));
            svrlBtns[i].setLayoutY(500+(i*20));
            
            svrlBtns[i].setText("BRN "+i);
            
            sp.getChildren().add(svrlBtns[i]);
        }
        
        var scene = new Scene (sp, 800, 800);
        
        stage.setScene(scene);
        stage.setTitle("My first Gui APP");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}