/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_trow;

/**
 *
 * @author TERN04
 */
public class EVA3_9_TROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            metodoProblematico();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public static void metodoProblematico() throws Exception {

        System.out.println("Holiii");
        throw new Exception("FALLA DEL SISTEMA!!!!!!!");
        //  System.out.println("HELLOW KITTY");
    }
}
