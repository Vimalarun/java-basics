import java.io.*;
import java.util.*;
public class SampleOutpute {
    public static void main(String args[]){
        char data = 'a';
        try {
            OutputStream out = new FileOutputStream("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/src/something.txt");
            out.write(data);
            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
