package TKSCJC;

import java.io.FileOutputStream;
public class outputstrems {
    public static void main(String[] args) {
        String data = "Hi how are u";
        try {
            FileOutputStream op = new FileOutputStream("C:\\Users\\tamil\\git\\repository7\\SmartCliff_Java_Expleo_Training\\src\\Output.txt");
            byte[] array = data.getBytes();
            op.write(array);
            op.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}