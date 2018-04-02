/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

/**
 *
 * @author Michelle
 */
public class InterAgregarUsuario {
  
    /*aqui se llama la clase archivos
    Por ejemplo voy a poner CreaYLeeArchivos= cyla
     */
    
    
//Retorna un Vbox con la tabla clientes  
    public VBox mostarTablaClientes(){
        
        TableView <Usuario> tabla = new TableView<>();
        
        /*cyla = new CreaYLeeArchivos();
        Aqui lo instanciamos
        */
     
        //Crea la columna Nombre 
        TableColumn nombreColum = new TableColumn("Nombre Usuario");
        nombreColum.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        
        //Crear columna con la lista de nombres
        TableColumn ListaLibrosColum = new TableColumn("Libros");
        ListaLibrosColum.setMinWidth(50);
        ListaLibrosColum.setCellValueFactory(new PropertyValueFactory<>("Libros"));
        
        //Agregar columna con la fecha de prestamo del libro
        TableColumn fechaPrestamoColum = new TableColumn("Fecha de Prestamo Libro");
        fechaPrestamoColum.setMinWidth(100);
        fechaPrestamoColum.setCellValueFactory(new PropertyValueFactory<>("fecha de prestamo libro"));
        
        //Agregar columna con la fecha de devolucion del libro 
        TableColumn fechaDevolucionColum = new TableColumn("Fecha de Devolución Libro");
        fechaDevolucionColum.setCellValueFactory(new PropertyValueFactory<>("fecha de devolución libro"));
        fechaDevolucionColum.setMinWidth(150); 
         
        //Mostrar los datos de las filas
        /*
        Aqui llamamos a lo que ocupamos del archivo
        Por ejemplo puse getListaUsuario
        */
        ObservableList<Usuario> datos = getListaUsuario();
        tabla.setItems(datos);
        
           
        tabla.getColumns().addAll(nombreColum,ListaLibrosColum,fechaPrestamoColum,fechaDevolucionColum );
        
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(tabla);
        
    return vbox;
    }//Fin mostrar tableview
    
//Retorna un ObservableList de usuarios
    public ObservableList<Usuario> getListaUsuario(){
        
        
        ArrayList array = new ArrayList();
        
        
        //cyla es el ejemplo que puse como archivo archivo
        Usuario temp[] = cyla.leeUsuariosArchivo();
        
        for(Usuario u: temp)
            array.add(u);
        
        ObservableList<Usuario> listadoUsuarios = FXCollections.observableArrayList(array);
        
    return listadoUsuarios;
    }//Fin getListaClientes
    
}
