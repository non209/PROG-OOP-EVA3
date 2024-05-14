/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author TERN04
 */
public class EVA3_13_ESCRIBIR_ARCHIVOS {

    final static String miRuta = "D:\\archivos\\Archivo.txt";

    
    public static void main(String[] args) {

    
        try {
            escribirFiles(miRuta + "files.txt",
                    "Hola mundo!\n"
                    + "Prueba de clase de files");
            escribirFileWriter(miRuta + "FileWriter.txt",
                    "Segunda prueba\n"
                    + "Prueba de clase con fileWriter");
            escribirBufferedWriter(miRuta + "BufferedWriter.txt",
                    "Tercera prueba\n"
                    + "Prueba de clase con BufferedWriter");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }

    public static void escribirFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }

    public static void escribirBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(datos);
        bw.close();
    }

}
