import java.util.Scanner;
public class FiveQueen {
    public static int mat[][];

    public static void moveDown(int r, int c)
    {
        for(int row=r;row<5;row++)
        {
            if(mat[row][c]==0)
            {
                mat[row][c]=1;
            }
        }
    }

    public static void moveUp(int r, int c)
    {
        for(int row=r;row>=0;row--)
        {
            if(mat[row][c] == 0)
            {
                mat[row][c]=1;
            }
        }
    }

    public static void moveRight(int r, int c)
    {
        for(int col=c;col<5;col++)
        {
            if(mat[r][col] == 0)
            {
                mat[r][col]=1;
            }
        }
    }

    public static void moveLeft(int r, int c)
    {
        for(int col=c;col>=0;col--)
        {
            if(mat[r][col] == 0)
            {
                mat[r][col]=1;
            }
        }
    }

    public static void moveTopLDig(int r, int c){
        for(;r>=0 && c>=0;r--)
        {
            if(mat[r][c] == 0){
                mat[r][c] = 1;
            }
            c--;
        }
    }

    public static void moveTopRDig(int r, int c){
        for(;r>=0 && c<5;r--,c++){
            if(mat[r][c] == 0){
                mat[r][c] = 1;
            }
        }
    }

    public static void moveBotLDig(int r, int c){
        for(;r<5 && c>=0;r++,c--){
            if(mat[r][c] == 0){
                mat[r][c] = 1;
            }
        }
    }

    public static void moveBotRDig(int r, int c){
        for(;r<5 && c<5;r++,c++){
            if(mat[r][c] == 0){
                mat[r][c] = 1;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col,r,c,flag=0,i;
        mat = new int[5][5];
        r = sc.nextInt();
        c = sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(i==0)
            {
                row = r-1;
                col = c-1;
            }
            else{
                row=0;
                col=0;
            }
//            System.out.println("row: "+row+" "+"col: "+col);
            while(row<5)
            {
                if(flag == 0 && i>0)
                    col=0;
                while(col<5)
                {
                    if(mat[row][col] == 0)
                    {
                        mat[row][col] = 5;
                        moveDown(row+1,col);
                        moveUp(row-1, col);
                        moveRight(row,col+1);
                        moveLeft(row,col-1);
                        moveTopLDig(row-1,col-1);
                        moveTopRDig(row-1,col+1);
                        moveBotLDig(row+1,col-1);
                        moveBotRDig(row+1,col+1);
                        flag = 1;
                        break;
                    }
                    col++;
                }
                if(flag == 1)
                {
                    flag = 0;
                    break;
                }
                row++;
            }
            System.out.println("Flag: "+flag);
//            for(row=0;row<5;row++)
//            {
//                for(col=0;col<5;col++)
//                {
//                    System.out.print(mat[row][col]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
        }
        for(row=0;row<5;row++)
        {
            for(col=0;col<5;col++)
            {
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}
