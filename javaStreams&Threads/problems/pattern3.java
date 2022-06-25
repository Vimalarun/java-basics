import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0,j=0,k=1,flag=1;
        int mat[][] = new int[n][n];
        while(i<n)
        {
            mat[i][j] = k++;
            if(i==0 && j==n-1){
                break;
            }
            if(j == n-1 && flag==1){
                flag = -1;
                i-=1;
                continue;
            }
            else if(i==0 && flag==-1){
                flag=1;
                j+=1;
                continue;
            }
            i = i+flag;
            j = j+flag;



        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
