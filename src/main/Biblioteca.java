/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import Intefaz.InicioSecion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class Biblioteca extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        InicioSecion is = new InicioSecion();
       

        Scene scene = new Scene(is.vbox(), 300, 200);

        primaryStage.setTitle("Biblioteca");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    }

   