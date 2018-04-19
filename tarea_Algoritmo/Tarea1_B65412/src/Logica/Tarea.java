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
 * Evaluación de tiempo de ejecución por procedimiento empírico 
 */
public class Tarea {

    public static int fibonacciRecur(int num) {

        int retornado = 0;
        if (num == 0 || num == 1) {
            retornado = num;
        } else {
            retornado = fibonacciRecur(num - 2) + fibonacciRecur(num - 1);
        }
        return retornado;
    }


    public static int fibonacciIter(int num) {
        if (num < 2) {
            return num;
        }

        int fn1 = 0, fn2 = 1, fibonacci = 0;
        for (int i = 2; i <= num; i++) {
            fibonacci = fn1 + fn2;
            fn1 = fn2;
            fn2 = fibonacci;
        }
        return fibonacci;
    }
    public static void Hanoi(int n, int origen, int aux, int destiny) {
        if (n == 1) {
            System.out.println("mover disco de " + origen + " a " + destiny);
        } else {
            Hanoi(n - 1, origen, destiny, aux);
            System.out.println("mover disco de " + origen + " a " + destiny);
            Hanoi(n - 1, aux, origen, destiny);
        }
    }
    public static double factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (factorialRecursivo(n - 1));
        }
    }
    public static double factorialIterativo(int num) {
        double fact = 1;
        int i;
        if (num == 0) {
            fact = 1;
        } else {
            for (i = 1; i <= num; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
    public static int [] arregloNumerosAleatorios(){
        int  arreglo []=new int [250];
        for(int i=1;i>=arreglo.length;i++){
            int aleatorio=(int) Math.random();
            arreglo[i]=aleatorio;
        }
        return arreglo;
    }
    public static int busquedaBinaria(int arreglo[], int izq, int der, int dato) {
        int m = (int) ((izq + der) / 2);
        if (izq == der && arreglo[m] != dato || arreglo[der] < dato || arreglo[izq] > dato) {
            return -1;
        }
        if (arreglo[m] == dato) { 
            return m;
        } else {
            if (arreglo[m] > dato) {
                return busquedaBinaria(arreglo, izq, m - 1, dato);
            } else {
                return busquedaBinaria(arreglo, m + 1, der, dato);
            }
        }
    }

}
