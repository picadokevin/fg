/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


/**
 *
 * @author Kevin Picado
 * @version 1.0
 * Tipos de Algoritmos recursivos
 */
public class TiposAlgoritmosRecursivos {
    public int sumatoria(int num,int num2) {
        if (num2 == 0) {
            return num;
        } else {
            return 1 + sumatoria(num , num2-1);
        }
    }
//En el metodo de la sumatoria se realiza solo una llamada debedido a que solo se necesita ir disminuyendo el valor de num2 para que llegue a ser 0 para obtener el resultado de la sumatoria. 
   
    public static int fibonacciRecur(int num) {

        
        if (num == 0 || num == 1) {
            return  num;
        } else {
           return fibonacciRecur(num - 2) + fibonacciRecur(num - 1);
        }
       
    }
    public int Ackerman(int n, int m) {
        if (m == 0) {
            return (n + 1);
        } else if (m > 0 && n == 0) {
            return Ackerman(m - 1, 1);
        } else {
            return Ackerman(m - 1, Ackerman(m, n - 1));
        }
    }
    public static boolean impar(int num) {
        if (num == 0) {
            return false;
        } else {
            return par(num - 1);
        }
    }

    public static boolean par(int num) {
        if (num == 0) {
            return true;
        } else {
            return impar(num - 1);
        }
    }
}
