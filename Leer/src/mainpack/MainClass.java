/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String holis= (JOptionPane.showInputDialog(null, "Ingrese el nombre que quiere para su archivo"));            
            String ruta = "C:\\Users\\Administrador\\Desktop\\"+holis+".txt";
            //FileWriter escribir = new FileWriter(ruta, true);
            File archivo = new File(ruta);
            BufferedWriter bw;
            if (archivo.exists()) {                
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(JOptionPane.showInputDialog(null, "El archivo ya existe, ingrese el texto que quiere en el"));                 
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(JOptionPane.showInputDialog(null, "El archivo es nuevo ingrese el texto que quiere en el"));
                
            }
            bw.close();
        } catch (Exception ex) {
            System.out.println("Sea Mas creativo");

        }
        // TODO code application logic here
    }
}
