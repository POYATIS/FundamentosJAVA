package com.netmid.cursoJava.practicaOperadoresBucles;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainPracticaOperadoresBucle {
    public static void main(String[] args) {
        System.out.println(" Main de practica operadores Bucle");

        // EJERCICIO 1

        for (int i = 0; i < 200; i++ ) {
            if (i % 2 == 0) {
                System.out.println(" nº par = " + i);
            }
        }

        // EJERCICIO 2

        int [] enteros;
        boolean [] boole;

        boole = new boolean[4];
        enteros = new int[4];

        // int [] enteros = new int [4];     lo declaramos y creamos al mismo tiempo
        // boolean [] boole = new boolean [4];


        boolean [] boole2 = {false, true, false, true};  // declaramos y asignamos valor
        int [] enteros2 = { 2, 4, 6, 8 };


            for  (int i = 0; i < enteros2.length; i++) {
                if (boole2[i] == true) {
                  System.out.println(" enteros son " + enteros2[i]);
                }
            }

        // EJERCICIO 3

        int [] enteros3 = { 2, 4, 6, 8 };
        int suma = 0;

            for  (int i = 0; i < enteros3.length && suma <= 20; i++) {
                if (enteros3[i] == 3) {
                    System.out.println("el nº es un 3 no lo sumo");
                    continue;
                } else if (enteros3[i] == 4) {
                    System.out.println("el nº es un 4, paro");
                    break;
                } else {
                    suma += enteros3[i];
                    System.out.println(" la suma hasta el momento es " + suma);
                }
            }
        System.out.println(" la suma total " + suma);



        // EJERCICIO 4

        int [] enteros4 = { 6, 8 };
        char caracter = 'a';


        // EJERCICIO 5
        System.out.println(" ejercicio 5");
        int num= 3;

        int [] numeroArray1 = { 1,2,3,4};
        int [] numeroArray2 = { 4,5,6,10,23};

        int au;

        for (int i = 0; i < numeroArray1.length; i++) {
            // el primer array es mayor
            if (i>= numeroArray2.length) {
                numeroArray1[i] = num;
            } else {
                au = numeroArray2[i];
                numeroArray2[i] = numeroArray1[i];
                numeroArray1[i] = au;
            }
        }

        if (numeroArray2.length > numeroArray1.length) {
            // el segundo array es mayor
            for (int  i =  numeroArray1.length; i < numeroArray2.length; i++) {
                System.out.println("rellenado huecos extra del segundo " + num);
                numeroArray2[i] = num;
            }
        }
        System.out.println("los array cambiados son: ");
       // System.out.println(Arrays.toString(numeroArray1));

        System.out.println("array 1");
            for ( int x : numeroArray1) {
                System.out.println(x);
            }
        System.out.println("array 2");
        for ( int x : numeroArray2) {
            System.out.println(x);
        }


    }
}
