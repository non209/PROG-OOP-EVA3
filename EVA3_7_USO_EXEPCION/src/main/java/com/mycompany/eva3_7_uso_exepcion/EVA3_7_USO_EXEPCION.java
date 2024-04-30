/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_uso_exepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TERN04
 */
public class EVA3_7_USO_EXEPCION {

    public static void main(String[] args) {
        try {
            
            while 
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el numerador: ");
            int num = sc.nextInt();
            System.out.println("Introduce el divisor:");
            int divi = sc.nextInt();
            int resu = 0;
            resu = num / divi;
            System.out.println("Resultado: " + resu);
        } catch (Exception e) {
            if (Exception) {
                System.out.println("input mismaexepction");
            } else {
                System.out.println("arithmetich exeption");
            }

        }
        System.out.println("Fin del programa: ");
    
    }
}
