/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Catalogo;

import domain.Libros;
import domain.Memorias;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;

/**
 *
 * @author UsuarioPC
 */
public class GestionarMemorias {
     public String titulo;
    
    public String autor;
     static String nombreConferenci;
      static String abstrac;
    public String resumen;
    public String fechaIngreso;
     
    TextField texfieldTitulomemoria ;
    TextField textfieldAutor;
    TextField textfieldnombreConferencia;
    TextArea textareaResumen;
    TextArea textareaAbstract;
    Button btnAgregar;
    DatePicker datepickerFecha;
    public GridPane AgregarMemorias(){
    GridPane gpVentanaLibros = new GridPane();
        btnAgregar = new Button("Agregar");
         datepickerFecha = new DatePicker();
        Label labelTituloMemoria = new Label("Titulo");
        gpVentanaLibros.add(labelTituloMemoria, 0, 0);
        texfieldTitulomemoria = new TextField();
        gpVentanaLibros.add(texfieldTitulomemoria, 1, 0);
        Label labelAutor= new Label("Nombre del autor");
        gpVentanaLibros.add(labelAutor, 0, 1);
         textfieldAutor= new TextField();
        gpVentanaLibros.add(textfieldAutor, 1, 1);
        Label nombreConferencia = new Label("Nombre de la conferencia");
        gpVentanaLibros.add(nombreConferencia, 0, 2);
         textfieldnombreConferencia = new TextField();
        gpVentanaLibros.add(textfieldnombreConferencia, 1, 2);
        Label labelResumen = new Label("Resumen");
        gpVentanaLibros.add(labelResumen, 0, 3);
        textareaResumen = new TextArea();
         gpVentanaLibros.add(textareaResumen, 1, 3);
        Label labelAbstract = new Label("Abstract");
        gpVentanaLibros.add(labelAbstract, 0, 4);
         textareaAbstract = new TextArea();
       gpVentanaLibros.add(textareaAbstract, 1, 4);
         Label labelFechaingreso = new Label("Fecha de ingreso");
        gpVentanaLibros.add(labelFechaingreso, 0, 5);
         gpVentanaLibros.add(datepickerFecha,1,5);
//        Msj = new Label("");
           gpVentanaLibros.add(btnAgregar, 0, 6);
         textareaResumen.setPrefWidth(100);
         textareaResumen.setPrefHeight(100);
         textareaAbstract.setPrefWidth(100);
         textareaAbstract.setPrefHeight(100);
        
         datepickerFecha.setOnAction(new EventHandler() {
            public void handle(Event t) {
                LocalDate date = datepickerFecha.getValue();
                int dia = date.getDayOfMonth();
                int mes=date.getMonthValue();
                int año=date.getYear();
                fechaIngreso=dia+"/"+mes+"/"+año;
                }
     });
        btnAgregar.setOnAction(new EventHandler<ActionEvent>() {
            
             public void handle(ActionEvent event) {
                 
                       
                if(verificaInfo() == true)
           JOptionPane.showMessageDialog(null, "Porfavor ingrese toda la informacion necesaria.");
                else{   
                 titulo = texfieldTitulomemoria.getText();
                 autor= textfieldAutor.getText();
                 nombreConferenci=textfieldnombreConferencia.getText();
                
                resumen = textareaResumen.getText();
                 abstrac=textareaAbstract.getText();
                Memorias memoria=new Memorias(titulo, fechaIngreso, autor, resumen, abstrac, nombreConferenci);
                memoria.Agregar(memoria);
                JOptionPane.showMessageDialog(null,"Autor agregado con exito :)");
                 Limpiar();
                
            }
             }        
              });
           
            
             return gpVentanaLibros;

    
}
    public void Limpiar(){
      texfieldTitulomemoria.setText("");
      textfieldAutor.setText("");
      textfieldnombreConferencia.setText("");
    
            }
    private boolean verificaInfo(){
         if(texfieldTitulomemoria.getText().isEmpty())
             return true;
         else if(textfieldAutor.getText().isEmpty())
             return true;
         else if(textfieldnombreConferencia.getText().isEmpty())
             return true;
         else
             return false;
     }
}
