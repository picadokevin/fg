/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaz;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author David
 */
 
public class InterBibliotecario {
    
    public GridPane interBibliotecario(){
     GridPane gpVentanaBibliotecario = new GridPane();
     Button btnAgregar = new Button("Agregar");
     gpVentanaBibliotecario.add(btnAgregar, 0, 0);
        
        
        
         return gpVentanaBibliotecario;
    }
    
 //  Ahora si :) 
    
}
