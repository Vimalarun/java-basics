import java.io.*;
public class SampleReader {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample/text1.txt");
        f.skip(4);
        int data;
        while((data = f.read())!=-1){
            System.out.print((char)data);
        }

    }
}
