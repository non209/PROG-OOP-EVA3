/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TERN04
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero entero: ");
            int nume = sc.nextInt();
            System.out.println("El  numero capturado fue: " + nume);
        } catch (InputMismatchException e) {
            System.out.println("El valor introducido no es un numero entero");

        } finally {
            System.out.println("ESTA INSTRUCCION SIEMPRE SE VA A EJECUTAR");
        }

    }

}
