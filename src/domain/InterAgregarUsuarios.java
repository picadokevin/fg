/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author David
 */
public class InterAgregarUsuarios {
     public String nombreUni;
    public String nombreComple;
     static String identificacio;
      static String tipoIdentifica;
    public String contrase;
    
     public GridPane interAddUsuario(){
      
        GridPane gpVentanaBibliotecario = new GridPane();
        Button btnAgregar = new Button("Agregar");
        gpVentanaBibliotecario.add(btnAgregar, 0, 5);
        Label nombreUnico = new Label("Nombre unico");
        gpVentanaBibliotecario.add(nombreUnico, 0, 0);
        TextField nombreUnic = new TextField();
        gpVentanaBibliotecario.add(nombreUnic, 1, 0);
        Label nombreCompleto = new Label("Nombre completo");
        gpVentanaBibliotecario.add(nombreCompleto, 0, 1);
        TextField nombreComplet = new TextField();
        gpVentanaBibliotecario.add(nombreComplet, 1, 1);
        Label TipoIdentificacion = new Label("Tipo de Identificación");
        gpVentanaBibliotecario.add(TipoIdentificacion, 0, 2);
        TextField Tipoidentificacion = new TextField();
        gpVentanaBibliotecario.add(Tipoidentificacion, 1, 2);
        Label identificacion = new Label("Identificación");
        gpVentanaBibliotecario.add(identificacion, 0, 3);
        TextField identi = new TextField();
        gpVentanaBibliotecario.add(identi, 1, 3);
        Label contraseña = new Label("Contraseña");
        gpVentanaBibliotecario.add(contraseña, 0, 4);
        TextField contraseñ = new TextField();
        gpVentanaBibliotecario.add(contraseñ, 1, 4);
        
    
        btnAgregar.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
               nombreUni=nombreUnic.getText();
               nombreComple = nombreComplet.getText();
               tipoIdentifica = Tipoidentificacion.getText();
               identificacio= identi.getText();
               contrase = contraseñ.getText();
               Bibliotecarios bi=new Bibliotecarios(nombreUni, contrase, nombreComple, tipoIdentifica, identificacio);
                bi.Agregar(bi);
            }
        });
        
         
         return gpVentanaBibliotecario;
    }
        
     
    
}
