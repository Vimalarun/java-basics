
import java.util.Scanner;
public class pattern5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int mat[][] = new int[n][n];
            int i=0,j=0,k=1,flag=1,no=n,t=1;
            while(i<n){
                if(mat[i][j] == 0)
                    mat[i][j] = k++;
                else
                    break;

                if(j == n-1 && flag == 1){
                    n = n-1;
                    flag = -1;
                }

                else if(i == t-1 && flag==-1){
                    t+=1;
                }

                else if(j+1 == t && flag==-1){
                    flag=1;
                }

                //for diagonal
                if(flag == 1){
                    i = i+flag;
                    j = j+flag;
                }
                //move upward
                else if(flag == -1 && j == n && i>=t){
                    i = i+flag;
                }
                //move left
                else{
                    j = j+flag;
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

