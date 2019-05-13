
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamientodado;

import java.util.Scanner;

public class LanzamientoDado {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        int sum = 0, n = 0, aux = 0;
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int frec2 = 0, frec3 = 0, frec4 = 0, frec5 = 0, frec6 = 0, frec7 = 0, frec8 = 0, frec9 = 0, frec10 = 0, frec11 = 0, frec12 = 0;
        do {
            sum = dado1.lanzarDado() + dado2.lanzarDado();
            switch (sum) {
                case 2:
                    frec2++;
                    break;
                case 3:
                    frec3++;
                    break;
                case 4:
                    frec4++;
                    break;
                case 5:
                    frec5++;
                    break;
                case 6:
                    frec6++;
                    break;
                case 7:
                    frec7++;
                    break;
                case 8:
                    frec8++;
                    break;
                case 9:
                    frec9++;
                    break;
                case 10:
                    frec10++;
                    break;
                case 11:
                    frec11++;
                    break;
                default:
                    frec12++;
                    break;
            }
            n++;
        } while (n < 1000);

        System.out.println("Frecuencia 2: " + frec2 + "\nFrecuencia 3 :" + frec3
                + "\nFrecuencia 4 :" + frec4 + "\nFrecuencia 5 :" + frec5
                + "\nFrecuencia 6 :" + frec6 + "\nFrecuencia 7 :" + frec7
                + "\nFrecuencia 8: " + frec8 + "\nFrecuencia 9: " + frec9 
                + "\nFrecuencia 10: " + frec10 + "\nFrecuencia 11: " + frec11 
                + "\nFrecuencia 12: "+ frec12);
    }

}