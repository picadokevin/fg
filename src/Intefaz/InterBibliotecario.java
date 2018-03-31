/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaz;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author David
 */
 
public class InterBibliotecario {
    
    public GridPane interBibliotecario(){
     GridPane gpVentanaBibliotecario = new GridPane();
     Button btnAgregar = new Button("Agregar");
     gpVentanaBibliotecario.add(btnAgregar, 0, 5);
     Label nombreUnico=new Label("Nombre unico");
     gpVentanaBibliotecario.add(nombreUnico, 0, 0);
     TextField nombreUnic=new TextField();
     gpVentanaBibliotecario.add(nombreUnic, 1, 0);
     Label nombreCompleto=new Label("Nombre completo");
     gpVentanaBibliotecario.add(nombreCompleto, 0, 1);
      TextField nombreComplet=new TextField();
       gpVentanaBibliotecario.add(nombreComplet, 1, 1);
       Label TipoIdentificacion=new Label("Tipo de Identificación");
     gpVentanaBibliotecario.add(TipoIdentificacion, 0, 2);
       
         return gpVentanaBibliotecario;
    }
    
 //  Ahora si :) 
    
}
