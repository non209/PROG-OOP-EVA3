/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_trow;

/**
 *
 * @author TERN04
 * 
 */


import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_10_TROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean repetir = false;
        while (!repetir)
        try {
            Persona perso = new Persona();
            perso.setNombre("Jorge");
            perso.setApellido("Hernanndez");
            perso.setEdad(-18);
            repetir = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema con la edad");
        }

    }

    static class Persona {

        private String apellido;
        private String nombre;
        private int edad;

        public Persona() {
            apellido = "";
            nombre = "";
            edad = 0;
        }

        public Persona(String apellido, String nombre, int edad) throws Exception {
            this.apellido = apellido;
            this.nombre = nombre;
            this.edad = edad;
            if ((edad < 0) || (edad > 150)) {
                throw new Exception("Valor capturado no es valido!!!");
            }
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) throws Exception {
            this.edad = edad;
            if ((edad < 0) || (edad > 150)) {
                throw new Exception("Valor capturado no es valido!!!");
            }

        }
    }
}
