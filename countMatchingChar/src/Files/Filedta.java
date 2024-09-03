package Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L; // This is needed to ensure serialization compatibility

    private String data;

    public MyClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class Filedta {
    public static void main(String[] args) {
        // Creating an object to be serialized
        MyClass obj = new MyClass("Hello, World!");

        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
