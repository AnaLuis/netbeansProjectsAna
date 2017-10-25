package writereadobject;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WriteReadObject {

    public static void main(String[] args) {
        //write an object to a binary file,escribir un ojecto a un arc binario
        ObjectOutputStream fileOut;//output 
        TestObject obj = new TestObject(1, "text", 2.0);//declaro y creo agregando los elemntos del constructor
        String fileName = JOptionPane.showInputDialog(null, "Enter the file's name");
        try {
            fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
            fileOut.writeObject(obj);
            fileOut.close();

        } catch (FileNotFoundException ex) {//archivo no encontrado 
            JOptionPane.showMessageDialog(null, "file no found" + ex.getMessage());
        } catch (IOException ex) {//una vez que encuentra
            JOptionPane.showMessageDialog(null, "IOException" + ex.getMessage());
        }

        //end write
        //reads object fro a binary file
        TestObject objIn;
        try {

            ObjectInputStream fileInt = new ObjectInputStream(new FileInputStream(fileName));
            objIn=(TestObject)fileInt.readObject();//extrae el objeto 
            objIn.display();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "file no found" + ex.getMessage());
        } catch (IOException ex) {//si no se puede escribir
            JOptionPane.showMessageDialog(null, "IOException" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"classNotFound" + ex.getMessage());
        }

    }

}
