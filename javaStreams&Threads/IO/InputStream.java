import java.io.*;
class Sample
{
    public static void main(String args[])
    {
        try{
            InputStream i = new FileInputStream("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/src/something.txt");
            int data = i.read();
            while(data != -1){
                System.out.print(data+" ");
                data = i.read();
            }
            i.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}