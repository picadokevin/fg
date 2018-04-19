/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_b65412;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author Kevin Picado
 * @version 1.0
 */
public class Tarea1_B65412 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
/**
 *
 * @author Kevin Picado
 * @version 1.0
 */
    public static void main(String[] args) {
       
          
        System.out.println("El resultado del fibonacci recursivo es "+Logica.Tarea.fibonacciRecur((int)(Math.random()*40)));
       
        System.out.println("El resultado del fibonacci iterativo es "+Logica.Tarea.fibonacciIter(((int)(Math.random()*40))));
       
        Logica.Tarea.Hanoi((int)(Math.random()*21),(int)(Math.random()*21),(int)(Math.random()*21),(int)(Math.random()*21));
       
        System.out.println("El resultado del factorial recursivo es "+Logica.Tarea.factorialRecursivo(((int)(Math.random()*40))));
      
        System.out.println("El resultado del factorial iterativo es "+Logica.Tarea.factorialIterativo((int)(Math.random()*40)));
     
        System.out.println("El resultado de la Busqueda Binaria es "+Logica.Tarea.busquedaBinaria(Logica.Tarea.arregloNumerosAleatorios(),(int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40)));
      
        

            //launch(args);
        //Duracion del fibonacci recursivo con un valor de 40 es=1486
        //Duracion del fibonacci recursivo con un valor de 8 es=2
        //Duracion del fibonacci recursivo con un valor de 24 es=7
        
        //Duracion del fibonacci iterativo con un valor de 40 es=2
        //Duracion del fibonacci iterativo con un valor de 8 es=3
         //Duracion del fibonacci iterativo con un valor de 24 es=2
         
        //Duracion de las torres de hanoi con un valor de int 24, int 24, int 24, int 24 es=256744
         //Duracion de las torres de hanoi con un valor de int 10, int 10, int 10, int 10 es=161
         //Duracion de las torres de hanoi con un valor de int 5, int 5, int 5, int 5 es=10
         
         //Duracion del factorial recursivo con un valor de 5000 es=4
          //Duracion del factorial recursivo con un valor de 100 es=6
         //Duracion del factorial recursivo con un valor de 20 es=5
         
         //Duracion del factorial iterativo con un valor de 5000 es=2
          //Duracion del factorial iterativo con un valor de 100 es=4
          //Duracion del factorial iterativo con un valor de 20 es=6
         
          //Duracion de la busqueda Binaria con un valor de izq 100,derecha 200,dato 60 es=2
          //Duracion de la busqueda Binaria con un valor de izq 50,derecha 100,dato 60 es=2
           //Duracion de la busqueda Binaria con un valor de izq 15,derecha 25,dato 60 es=2
          
    }
    
}
