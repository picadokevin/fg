/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
//hola
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class InterAgregarBibliotericario {
     public String nombreUni;
    public String nombreComple;
     static String identificacio;
      static String tipoIdentifica;
      static String tipoUsuario;
    public String contrase;
    
     public GridPane interAddUsuario(){
      
        GridPane gpVentanaBibliotecario = new GridPane();
        Button btnAgregar = new Button("Agregar");
        gpVentanaBibliotecario.add(btnAgregar, 0, 6);
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
        Label tipoUsuar = new Label("Tipo de Usuario");
        gpVentanaBibliotecario.add(contraseña, 0, 5);
        TextField tipoUsuari = new TextField();
        gpVentanaBibliotecario.add(tipoUsuari, 1, 5);
    
        btnAgregar.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
               nombreUni=nombreUnic.getText();
               nombreComple = nombreComplet.getText();
               tipoIdentifica = Tipoidentificacion.getText();
               identificacio= identi.getText();
               contrase = contraseñ.getText();
               tipoUsuario=tipoUsuari.getText();
               Bibliotecarios bi=new Bibliotecarios(nombreUni, contrase, nombreComple, tipoIdentifica, identificacio,tipoUsuario);
                bi.Agregar(bi);
            }
        });
        
         
         return gpVentanaBibliotecario;
    }
     public boolean verificarUsuario(Bibliotecarios B [],String nombreunico,String contraseña,String tipoUsuario){
         boolean encontrado=false;
        for(int i=0;i<B.length;i++){
            if(B[i].getUnicoNombre().equalsIgnoreCase(nombreunico)&&B[i].getContraseña().equalsIgnoreCase(contrase)&&B[i].gettipoUsuario().equalsIgnoreCase(tipoUsuario)){
                encontrado=true;
                
                
                break;
            }
        
        }
       
         return encontrado;
     }
     public int CantidadRegistrosUsuarios() {//cuenta la cantidad de lineas que tiene el registro
        int cuentaRegistro = 0;
        try {
            BufferedReader br = getBufferedReader("Usuarios.txt");
            String registro = br.readLine();
            while (registro != null) {
                cuentaRegistro++;
                registro = br.readLine();
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return cuentaRegistro;
    } 
    public Bibliotecarios [] arregloUsuarios() {//obtiene lo que tiene el archivo y lo pasa a un arreglo tipocontrolGanado
        Bibliotecarios elementosUsuarios[] = new Bibliotecarios[CantidadRegistrosUsuarios()];
        int indice = 0;
        try {
            BufferedReader br = getBufferedReader("Usuario.txt");
            String registro = br.readLine();
            while (registro != null) {

              
                int controlaTokens = 1;
                String unicoNombre = "",contraseña = "",nombreCompleto = "",tipoIdentificacion = "",identificacion="",tipoUsuario="";

                StringTokenizer st = new StringTokenizer(registro, ";");

                while (st.hasMoreTokens()) {

                    if (controlaTokens == 1) {
                        unicoNombre = st.nextToken();
                    } else if (controlaTokens == 2) {
                        contraseña = st.nextToken();
                    } else if (controlaTokens == 3) {
                        nombreCompleto = st.nextToken();
                    } else if (controlaTokens == 4) {
                        tipoIdentificacion = st.nextToken();
                    } else if (controlaTokens == 5) {
                        identificacion = st.nextToken();
                    }else if(controlaTokens==6)
                        tipoUsuario=st.nextToken();
                        else {
                        controlaTokens = st.countTokens();
                    }

                    controlaTokens++;
                }//Fin del While 2;

                Bibliotecarios  B= new Bibliotecarios(unicoNombre, contraseña, nombreCompleto, tipoIdentificacion, identificacion,tipoUsuario);
                elementosUsuarios[indice] = B;
                indice++;
                registro = br.readLine();
            }//Fin del while 1

        }//Fin del try
        catch (FileNotFoundException fnfe) {
           
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }//Fin del catch 
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }

        return elementosUsuarios;
    }    
   
 public BufferedReader getBufferedReader(String nombrearchivo) {
        File archivo = new File(nombrearchivo);
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return br;
    }  
   
    
}
