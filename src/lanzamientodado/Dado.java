/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamientodado;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    Random r = new Random();
    int numero;
    public int lanzarDado(){
        numero = r.nextInt(6);
        return numero+1;
    }
}
