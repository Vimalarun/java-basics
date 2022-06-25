import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j=0,r=0,c=0,k=1;
        int mat[][] = new int[n][n];
        for(i=0;i<n-j;i++)
        {
            mat[r][c] = k++;
            if(c==n-1 && j%2==0){
                i=-1;
                r-=1;
                j+=1;
                continue;
            }
            else if(r==0 && j%2==1){
                i=-1;
                j+=1;
                c+=1;
                continue;
            }
            if(j%2==0){
                r++;
                c++;
            }
            else{
                r--;
                c--;
            }

        }
        for(r=0;r<n;r++){
            for(c=0;c<n;c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
}
