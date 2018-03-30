/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaz;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author David
 */
public class InicioSecion {
    //instancias globales
    InterBibliotecario interB = new InterBibliotecario();
    
    public VBox vbox(){
        GridPane ventanaInicio = new GridPane();
        VBox vbox = new VBox();
       
        
        Label lbBiblioteca = new Label("Bienvenido al Sistema Virtual de la Biblioteca UCR");
        Label lbtipoUsuario = new Label("Tipo usuario:");
        ComboBox<String> cbtipoUsuario = new ComboBox();
        cbtipoUsuario.getItems().addAll("Usuario", "Autor", "Bibliotecario");
   
        Label lbUsuario = new Label("Usuario");
        Label lbContraseña = new Label("Contraseña");
        Button btnConfirmar= new Button("Confirmar");
        btnConfirmar.setOnAction((event) -> {
            if(cbtipoUsuario.getValue().toString().equalsIgnoreCase("Bibliotecarios"))
              interB.interBibliotecario();
            
        });
        
        TextField tfUsuario = new TextField();
        TextField tfContraseña = new TextField();

        
        ventanaInicio.add(lbtipoUsuario, 0, 0);
        ventanaInicio.add(cbtipoUsuario, 1, 0);
        ventanaInicio.add(lbUsuario, 0, 1);
        ventanaInicio.add(tfUsuario, 1, 1);
        ventanaInicio.add(lbContraseña, 0, 2);
        ventanaInicio.add(tfContraseña, 1, 2);
        ventanaInicio.add(btnConfirmar, 1, 3);
        
        vbox.getChildren().addAll(lbBiblioteca, ventanaInicio);
        return vbox;
        
        
        
        
    }

}
