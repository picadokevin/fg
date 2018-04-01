/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import domain.InterBibliotecario;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class Biblioteca extends Application {
    
    //instancias globales
    InterBibliotecario ib = new InterBibliotecario();
    Stage primaryStage = new Stage();
    Scene scene = new Scene(vbox(), 300, 200);
    
     public VBox vbox(){
        GridPane ventanaInicio = new GridPane();
        VBox vbox = new VBox();
       Scene scene1 = new Scene(ib.InterBibliotecario(), 500, 400);
      
        
        Label lbBiblioteca = new Label("Bienvenido al Sistema Virtual de la Biblioteca UCR");
        Label lbtipoUsuario = new Label("Tipo usuario:");
        ComboBox<String> cbtipoUsuario = new ComboBox();
        cbtipoUsuario.getItems().addAll("Usuario", "Autor", "Bibliotecario");
   
        Label lbUsuario = new Label("Usuario");
       
       
      
        Label lbContraseña = new Label("Contraseña");
        Button btnConfirmar= new Button("Confirmar");
        btnConfirmar.setOnAction((event) -> {
            if(cbtipoUsuario.getValue().toString().equalsIgnoreCase("Bibliotecario")) 
          
         primaryStage.setScene(scene1);
         primaryStage.setTitle("Biblioteca");
         primaryStage.show();
        });
        
        TextField tfUsuario = new TextField();
        TextField tfContraseña = new TextField();
     

        
        ventanaInicio.add(lbtipoUsuario, 0, 0);
        ventanaInicio.add(cbtipoUsuario, 1, 0);
        ventanaInicio.add(lbUsuario, 0, 1);
        ventanaInicio.add(tfUsuario, 1, 1);
        ventanaInicio.add(lbContraseña, 0, 4);
        ventanaInicio.add(tfContraseña, 1, 4);
        ventanaInicio.add(btnConfirmar, 0, 5);
        
        vbox.getChildren().addAll(lbBiblioteca, ventanaInicio);
        return vbox;
        
        
    }//fin vbox
    
    @Override
    public void start( Stage primaryStage) {
      
        primaryStage.setTitle("Inicio Sesion Biblioteca");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    }

   
