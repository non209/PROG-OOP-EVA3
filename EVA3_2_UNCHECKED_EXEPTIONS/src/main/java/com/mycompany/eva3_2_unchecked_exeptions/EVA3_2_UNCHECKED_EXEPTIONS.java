/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_unchecked_exeptions;

/**
 *
 * @author TERN04
 */
public class EVA3_2_UNCHECKED_EXEPTIONS {

    public static void main(String[] args) {
Persona persona = null;
        System.out.println(persona.toString());
        
        int arreglo[] = new int[10]; //N = 0
        arreglo[15] = 100;
        
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);
    }
}
class Persona{
}
