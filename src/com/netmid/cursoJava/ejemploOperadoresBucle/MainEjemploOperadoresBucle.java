package com.netmid.cursoJava.ejemploOperadoresBucle;

public class MainEjemploOperadoresBucle {
    public static void main(String[] args) {
        System.out.println("ejemplo de bucles");
        int x = 6;
        int y =5;

        x = x + y;
        // sintactic sudar
        System.out.println("\n al principio");
        System.out.println("\n x es " + x );
        System.out.println("\n tras la suma");

        x = x - y;
        System.out.println("\n al final de la resta");
        System.out.println("\n x es " + x );
        x = x % y;

        System.out.println(" el resto de dividir ·x· entre ·y· = " + x);

        System.out.println(" \n x es = " + x );

        x++;

        System.out.println(" \n x es = " + x );
        ++x;

        System.out.println(" \n x es = " + x );

        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        // cuando se pone en pre-incremento
        // orden de precedencia de operadores en JAVA (* y / van por delante, si queremos que vaya por delante ponemos entre parentesis)

        x = x+x * y;
        System.out.println(" \n x es = " + x );
        System.out.println(" \n y es = " + y );

        // 0001 -> 1
        // 0010 -> 2
        // 0100 -> 4
        // 1000 -> 8

        // arrays
        int [] numbers; // lo declaramos
        numbers = new int[10]; // lo inicializamos

        int [] numbers2 = new int[10];
        numbers2[0] =  1;

        int [] evenNumer = { 2, 4, 6, 8 };
        System.out.println(" el elemento del array es " + numbers2[0]);
        System.out.println(" el elemento del array es " + evenNumer[1]);
        System.out.println(" el elemento del array es " + evenNumer.length);

        // bucles

        System.out.println(" \n FOR" );
        for (int i = 0; i < 10; i++ ) {
            System.out.println("i es = " +  i);
        }

        System.out.println(" \n WHILE "  );
        int i = 0;
        while (i < 10) {
            System.out.println("i es " + i);
            i++;
        }

        System.out.println(" \n DO WHILE " );

        do {
            System.out.println("i es " + i);
            i++;
        } while (i < 10);

        // test continue y BREAK

        i = 0;
        while (i < 10) {

            if (i % 2 == 0) {
                System.out.println(" el nº es " + i + " es par, me salto 3 ");
                i +=3;
                continue;
            } else if (i==7) {
                System.out.println("es el 7, fin");
                break;
            } else {
                System.out.println("el nº " + i + " no es pàr");
            }
            i++;
        }
        // for each

        for (int evenNumber : evenNumer) {
            System.out.println(" el nº es el " + evenNumber);
        }
    }
}
