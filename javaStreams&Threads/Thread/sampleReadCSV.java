package Thread;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sampleReadCSV {
    public static ArrayList<List> l;
    public void getDetails(int id){
        System.out.println(l.get(id));
    }

    public int totalSalary(){
        int sum = 0;
        for(int i=1;i<l.size();i++){
//            System.out.println(l.get(i).get(4));
            sum = sum + (Integer.parseInt((String) l.get(i).get(4)));
        }
        return sum;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader("/home/local/ZOHOCORP/vimal-14506/Downloads/Employee.csv"));
        String line;
        int flag = 0;
        l = new ArrayList<>();
        while((line = b.readLine()) != null){
//            System.out.println(line);
            String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            System.out.println(Arrays.asList(values));
            l.add(Arrays.asList(values));0
        }
//        System.out.println(l);
        sampleReadCSV s = new sampleReadCSV();
//        s.getDetails(1);
//        System.out.println(s.totalSalary());
    }
}
