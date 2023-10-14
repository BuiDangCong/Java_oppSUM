package Main;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class Docbansinhvien {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\h1.txt");
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Sinhvien sv = (Sinhvien) ois.readObject();
            System.out.println(sv);
            System.out.println(sv.getMaSinhVien());
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
