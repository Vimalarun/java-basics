import java.io.*;
public class BufferedSample {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample/text1.txt");
        BufferedInputStream b = new BufferedInputStream(f);
        int data;
        while((data = b.read())!=-1){
            System.out.print((char)data);
        }
    }
}
