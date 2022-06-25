import java.util.Scanner;
public class fiveQueen {
    public static int[][] mat;
    public static void moveDown(int i,int j){
            for(int row=i;row<5;row++){
                mat[row][j] = 1;
            }
    }
    public static void moveRight(int i, int j){
        if(i<4){
            for(int col=j;col<5;col++){
                mat[i][col] = 1;
            }
        }
    }
    public static void moveLeft(int i, int j){
        if(j>0){
            for(int col=j;col>=0;col--){
                mat[i][col] = 1;
            }
        }
    }
    public static void moveTop(int i,int j){
        if(i>=0){
            for(int row=i;row>=0;row--){
                mat[row][j] = 1;
            }
        }
    }

    public static void moveBotRDig(int row,int col){
        if(row<4){
            for(int i=row;i<5 && col<5;i++){
                    mat[i][col] = 1;
                    col+=1;
            }
        }
    }

    public static void moveBotLDig(int row,int col){
//        System.out.println(row+" "+col);
        if(row>0 && col>0){
            for(int j=col;row<5 && j>=0;j--){
                mat[row][j] = 1;
                row+=1;
            }
        }
    }

    public static void moveTopLDig(int row,int col){
        for(int i=row;i>=0 && col>=0;i--){
            mat[i][col] = 1;
            col-=1;
        }
    }
    public static void moveTopRDig(int row,int col){
        for(int i=row;i>=0 && col<5;i--){
            mat[i][col] = 1;
            col+=1;
        }
    }
//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position want to place queen");
        int x = input.nextInt();
        int y = input.nextInt();
        mat = new int[5][5];
        int i,j,flag=0,k;
        for(k=0;k<3;k++){
            if(k == 0)
            {
                i=x-1;
                j=y-1;
            }
            else
            {
                i=0;
                j=0;
            }
//            System.out.println("Before: "+i+" "+j);
            for(;i<5;i++)
            {
                for (;j < 5;j++)
                {
                    if (mat[i][j] == 0)
                    {
                        mat[i][j] = 5;
                        moveDown(i + 1, j);
                        moveRight(i, j + 1);
                        moveLeft(i, j - 1);
                        moveTop(i - 1, j);
                        moveBotRDig(i + 1, j + 1);
                        moveBotLDig(i + 1, j - 1);
                        moveTopRDig(i - 1, j + 1);
                        moveTopLDig(i - 1, j - 1);
                        flag=1;
                        break;
                    }
                }
//                System.out.println("After: "+i+" "+j);
//                for(i=0;i<5;i++){
//                    for(j=0;j<5;j++)
//                        System.out.print(mat[i][j]+" ");
//                    System.out.println();
//                }
                System.out.println();
                if(flag == 1) {
                    flag = 0;
                    break;
                }

           }
        }


    }
//5 is Queen

}
