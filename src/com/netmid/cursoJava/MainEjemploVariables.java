package com.netmid.cursoJava;

public class MainEjemploVariables {
    public static void main(String[] args) {
        System.out.println("holiii");

        // 0110 = 6 en binario
        System.out.println("TIPOS PRIMITIVOS");

        byte ab = 1; // 8 bits
        short abc = 2; // 16 bits
        int a = 3; // 32 bits
        long abcd = 6; // 64 bits
        float x = 5; // decimales IEEE 754 en cubo de simple precision
        double y = 6; // IEEE 754 64 bits, como flotante.
        char v = 'a'; // carácter entre comillas simples 16 bits UNICODE
        boolean m = true; // o false

        // son objetos, de todos hay un replejo en objeto ademas del primitivo

        System.out.println("TIPOS OBJETOS");
        String s = "Sandra";
        final double PI =  3.145;
        final float PI2 =  3.145f;// si le pones float no sabe si es un float o un double, tienes que añadir F
        System.out.println(" mi byte " + ab);
        System.out.println(" mi byte " + abc);
        System.out.println(" mi byte " + a);
        System.out.println(" mi long " + abcd);
        System.out.println(" mi byte " + x);
        System.out.println(" mi byte " + y);
        System.out.println(" mi byte " + v);
        System.out.println(" mi byte " + m);
        System.out.println(" mi byte " + s);

        // IF

        // AND &&
        // TRUE AND TRUE -> TRUE
        // TRUE AND FALSE -> FALSE
        // FALSE AND FALSE -> FALSE
        // FALSE AND TRUE -> FALSE

        // OR || (paips)

        // TRUE OR TRUE -> TRUE
        // TRUE OR FALSE -> TRUE
        // FALSE OR FALSE -> FALSE
        // FALSE OR TRUE -> TRUE

        // solo VALE o true o false
        if (a > abcd) {
            System.out.println(" ");
        } else if (v == 'b') {
                System.out.println(" si lo es");
        } else {
            System.out.println(" esto es falso");
            }

        // SWITCH == EVALUATE EN COBOL

        switch (v) {
            case 'a':
                System.out.println("es una vocal");
                break;
            case 'b':
                System.out.println("es una vocal");
                break;
            case 'c':
                System.out.println("es una vocal");
                break;
            default:
                System.out.println("no es vocal");
                break;
            }
        }

    }

