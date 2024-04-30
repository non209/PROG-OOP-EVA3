/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TERN04
 */
public class EVA3_5_TRY_CATCH {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el numerador: ");
            int num = sc.nextInt();
            System.out.println("Introduce el divisor:");
            int divi = sc.nextInt();
            int resu = 0;
            resu = num / divi;
            System.out.println("Resultado: " + resu);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }
        System.out.println("Fin del programa: ");
    }
}
