import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        int i=0,j=0,k=1,flag=1,t=0,no=n,m=1;
        while(i<n){
            if(mat[i][j] == 0)
                mat[i][j] = k++;
            else
                break;

            if(j == n-1 && flag == 1) {
                n = n - 1;
                flag = -1;
            }

            if(t == 1 && flag == -1 && j == i+m){
                flag = 1;
                t = 0;
                m+=1;
            }

            //for diagonal
             if(flag == 1) {
                 i = i + flag;
                 j = j + flag;
             }
             //upward
            else if(flag == -1 && no-j <= i){
                i = i + flag;
             }

            //left
            else{
                j = j + flag;
                t = 1;
             }
        }

        //printing
        for(i=0;i<no;i++)
        {
            for(j=0;j<no;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
