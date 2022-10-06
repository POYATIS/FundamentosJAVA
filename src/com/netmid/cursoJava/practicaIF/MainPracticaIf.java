package com.netmid.cursoJava.practicaIF;

import java.sql.SQLOutput;

public class MainPracticaIf {
    public static void main(String[] args) {
        System.out.println(" En main practica IF");

        System.out.println(" Ejercicio 1");
        int peras = 100;
        int manzanas = 20;
        int uvas = 300;

        if ((peras > manzanas || uvas > manzanas) && uvas > 30 ) {
            System.out.println(" tengo mucha fruta");
        } else {
            System.out.println(" no voy mal de fruta");
        }

        System.out.println(" Ejercicio 2");
        boolean uvasEstanRicas = false;

        if (uvas > peras && uvas > manzanas) {
            System.out.println("vaya suerte, tengo muchas uvas ");
            if (uvasEstanRicas == true) {
                System.out.println(" tengo muchas uvas pero no estan ricas");
            } else {
                System.out.println(" no tengo muchas uvas y no estan ricas, desastre");
            }
        } else if (!uvasEstanRicas) {
            System.out.println("no tengo muchas uvas y aedmas no estan ricas, que desastre");
        }

        System.out.println(" Ejercicio 3");
        char codigoHuevo = '0';
        switch (codigoHuevo) {
            case '0':
                System.out.println("gallinas ecologicas");
                break;
            case '1':
                System.out.println("gallinas camperas");
                break;
            case '2':
                System.out.println("gallinas criadas en suelo");
                break;
            case '3':
                System.out.println("gallinas criadas en jaula");
                break;
            default:
                System.out.println("codigo incorrecto");
                break;
        }

        System.out.println(" Ejercicio 4");

        if (manzanas == 10) {
            if (manzanas > peras) {
                System.out.println("tengo mas manzanas que peras y son 10 justas");
            } else if (manzanas > uvas ) {
                System.out.println("tengo mas manzanas que uvas");
            } else  {
                System.out.println("de que me sirven estas 10 manzanas");
            }
        } else {
            if (manzanas > peras) {
                System.out.println("tengo mas manzanas que peras");
            } else if (manzanas < uvas && manzanas < 5 ) {
                System.out.println("tengo que comprar manzanas que se me acaban");
            }
        }


        System.out.println(" Ejercicio 5 A");

        float precioManzanas = 2.5f;
        boolean manzanasEstanRicas = true;
        boolean perasEstanRicas = true;

        String sms = " ";

        if (manzanas >= 5) {
          sms += "tengo suficientes manzanas, brilla el sol ";
        } else  {
                sms += "tengo que comprar manzanas ";
             if ( precioManzanas >= 5.5) {
                sms += "pero estan caras ";
                 if (manzanas < 5 && precioManzanas > 5.5 && manzanasEstanRicas) {
                    sms += " pero estan muy ricas asi que compro ";
                } else {
                    sms += "ademas no estan ricas no compro ";
            }
        } else {
                sms += "estan baratas compro!";
            }
        }
        System.out.println(sms);

        System.out.println(" Ejercicio 5 B");

        boolean uvasBaratas = false;
        boolean perasBaratas = false;

        if ((uvasBaratas == true && perasBaratas == true)
                || (uvasBaratas == false && perasBaratas == true)
                || (uvasBaratas == true && perasBaratas == false) )

        { System.out.println("voy a comprar uvas, aunque esten las dos baratas");

        } else if (perasBaratas == true && perasEstanRicas == true) {
            System.out.println("voy a comprar peras en vez de uvas, hay que ahorrar");
        }
        if ((uvasBaratas || uvasEstanRicas)) {
            System.out.println(" compro uvas");
        } else if (perasBaratas == true && perasEstanRicas == true)
            System.out.println(" compro peras que estan baratas y ricas");
        }
    }


