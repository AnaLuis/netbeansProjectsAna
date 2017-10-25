package binaryfiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class binary {

    public ObjectOutputStream output;

    public void crearfile(String nombre) throws IOException {
        try {
            output = new ObjectOutputStream(new FileOutputStream(nombre + ".dat"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(binary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void write(String name, Double peso, Object Date) throws IOException {
        output.writeUTF(name);
        output.writeDouble(peso);
        output.writeObject(Date);
        //cerrar el flujo de output apunta 
        output.close();
    }
}
