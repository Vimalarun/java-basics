import java.io.*;
public class BufferSample {
    FileInputStream f;
    BufferedInputStream b;
    {
        try {
            f = new FileInputStream("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample/text1.txt");
            b = new BufferedInputStream(f,10);

            int data;
            while((data = b.read())!=-1){
                System.out.println((char)data);
            }
            b.close();
            f.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
