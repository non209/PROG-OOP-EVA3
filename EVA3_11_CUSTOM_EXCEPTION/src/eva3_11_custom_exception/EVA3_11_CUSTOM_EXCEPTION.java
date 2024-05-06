/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_custom_exception;

/**
 *
 * @author TERN04
 */
public class EVA3_11_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            mensaje();
        } catch (MiExcepcion e) {
            e.printStackTrace();
        }
    }

    public static void mensaje() throws MiExcepcion {
        System.out.println("mensaje");
        throw new MiExcepcion("FALLA DEL SISTEMA!!!!!!!!");
    }
}

class MiExcepcion extends Exception {

    public MiExcepcion() {
    }

    public MiExcepcion(String Mensaje) {
        super(Mensaje);
    }

}
