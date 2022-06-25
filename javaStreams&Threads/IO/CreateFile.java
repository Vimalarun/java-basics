import java.io.*;
public class CreateFile {
    public static void main(String args[]) throws IOException {
        File d = new File("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample");
        boolean t = d.exists();
//        System.out.println(t);
            boolean create = d.mkdir();
            File f = new File("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample/text2.txt");
            boolean isCreated = f.createNewFile();
            System.out.println(isCreated);
            System.out.println(f.length());
//          boolean renameFile = f.renameTo(new File("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample/text2.txt"));
//          boolean success = f.delete();
//          System.out.println(success);
            File lf = new File("/home/local/ZOHOCORP/vimal-14506/Desktop/Javabasics/Files/sample");
            File[] files = lf.listFiles();
            System.out.println(files.length);
    }

}
