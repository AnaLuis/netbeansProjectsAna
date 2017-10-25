package writereadobject;

import java.io.Serializable;

public class TestObject implements Serializable {//para qu el objeto pueda ser leido de un archivo binario

    private int id;
    private String text;
    public double number;

    public TestObject(int id, String text, double number) {//inicializa 
        this.id = id;
        this.text = text;
        this.number = number;

    }

    public void display() {//muestra
        System.err.println(this.id);
        System.err.println(this.text);
        System.err.println(this.number);
    }
    

}
