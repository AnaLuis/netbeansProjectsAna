/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SYM-II
 */
public class TestObjectOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException   {
        // create an output  stream for the file 
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Object.dat"));
            //write a string,doube value and object to the file
            output.writeUTF("ana luis");
            output.writeDouble(48.5);
            output.writeObject(new Date());
            //cerrar el flujo de output apunta 
            output.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "ther is an error notfound" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "of io" + ex.getMessage());

        }
        try {
            ObjectInputStream input=new ObjectInputStream(new FileInputStream("Object.dat"));
            String name=input.readUTF();//input contiene wl archivo
            Double weight= input.readDouble();
            Date date= (Date)input.readObject();
            System.out.println("name " + name + " "+"weight "+ weight +"date "+ date);
        } catch (FileNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "ther is an error notfound" + ex.getMessage());
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "of io" + ex.getMessage());

        }

    }

}
