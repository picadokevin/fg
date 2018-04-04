
package Interfaces.Catalogo;


import domain.Autores;
import domain.Libros;
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
 * @author David
 */
public class GestionarLibros {
        public String titulo;
    
    public String autor;
     static String codigoisbn;
      static String tema;
    public String subtema;
     
    TextField texfieldTituloLibro ;
    TextField textfieldAutor;
    TextField textfieldCodigo;
    TextArea textareaTema;
    TextArea textareaSubtema;
    Button btnAgregar;
    DatePicker datepickerFecha;
    public GridPane AgregarLibros(){
    GridPane gpVentanaLibros = new GridPane();
        btnAgregar = new Button("Agregar");
     
        Label labelTituloLibro = new Label("Titulo");
        gpVentanaLibros.add(labelTituloLibro, 0, 0);
        texfieldTituloLibro = new TextField();
        gpVentanaLibros.add(texfieldTituloLibro, 1, 0);
        Label labelAutor= new Label("Nombre completo");
        gpVentanaLibros.add(labelAutor, 0, 1);
         textfieldAutor= new TextField();
        gpVentanaLibros.add(textfieldAutor, 1, 1);
        Label codigoIsbn = new Label("Código ISBN");
        gpVentanaLibros.add(codigoIsbn, 0, 2);
         textfieldCodigo = new TextField();
        gpVentanaLibros.add(textfieldCodigo, 1, 2);
        Label labelTema = new Label("Tema");
        gpVentanaLibros.add(labelTema, 0, 3);
        textareaTema = new TextArea();
         gpVentanaLibros.add(textareaTema, 1, 3);
        Label labelSubtema = new Label("Subtema");
        gpVentanaLibros.add(labelSubtema, 0, 4);
         textareaSubtema = new TextArea();
       gpVentanaLibros.add(textareaSubtema, 1, 4);
         Label labelFechaingreso = new Label("Fecha de ingreso");
        gpVentanaLibros.add(labelFechaingreso, 0, 5);
        // gpVentanaLibros.add(datepickerFecha,1,5);
//        Msj = new Label("");
           gpVentanaLibros.add(btnAgregar, 0, 6);
         
         datepickerFecha = new DatePicker();
         datepickerFecha.setOnAction(new EventHandler() {
            public void handle(Event t) {
                LocalDate date = datepickerFecha.getValue();
                int dia = date.getDayOfMonth();
                int mes=date.getMonthValue();
                int año=date.getYear();
                }
     });
        btnAgregar.setOnAction(new EventHandler<ActionEvent>() {
            
             public void handle(ActionEvent event) {
                 
                       
                //if(verificaInfo() == true)
           //JOptionPane.showMessageDialog(null, "Porfavor ingrese toda la informacion necesaria.");
                //else{   
                 titulo = texfieldTituloLibro.getText();
                 autor= textfieldAutor.getText();
                 codigoisbn=textfieldCodigo.getText();
                
               //  tema = textareaTema.getText();
                // subtema=textareaSubtema.getText();
              // Libros libros=new Libros(titulo, codigoisbn, Autor, codigoisbn, tema, subtema);
                //JOptionPane.showMessageDialog(null,"Autor agregado con exito :)");
                // Limpiar();
                
            // }}
             }        
              });
           
            
             return gpVentanaLibros;

    } 
}
