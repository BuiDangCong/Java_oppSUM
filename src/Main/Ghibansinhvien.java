package Main;

import java.io.*;
import java.io.File;
import java.io.OutputStream;
import java.io.ObjectInputStream;
public class Ghibansinhvien {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\h1.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Sinhvien sv = new Sinhvien("12330","bui anh tuan",1994,8.6f);
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (Exception e){

        }
    }
}
