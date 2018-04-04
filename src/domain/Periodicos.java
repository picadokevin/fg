/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Periodicos extends Catalogo {
    
    private String codigoISSN;
    private String edicion;
    private String fecha;
    
    public Periodicos(String titulo, String fechaIngreso, String Autor,String codigoISSN,String edicion,String fecha) {
        super(titulo, fechaIngreso, Autor);
        this.codigoISSN=codigoISSN;
        this.edicion=edicion;
        this.fecha=fecha;
    }
     public void Agregar(Periodicos periodicos) {
		// TODO Auto-generated method stub
	 PrintStream ps = getPrintStream("Periodicos.txt");

        ps.println(periodicos.getTitulo() + ";" + periodicos.getFechaIngreso()+ ";" + periodicos.getAutor()+ ";" + periodicos.getCodigoISSN() + ";" + periodicos.getEdicion()+";"+periodicos.getFecha());
	}
    public PrintStream getPrintStream(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ps = new PrintStream(fos);

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "error");
            
        }
        return ps;
    }


    public String getCodigoISSN() {
        return codigoISSN;
    }

    public void setCodigoISSN(String codigoISSN) {
        this.codigoISSN = codigoISSN;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
