import java.util.*;
class search2dmatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[][] matrix=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0)
        {
            if(target==matrix[r][c])
            {
                System.out.println(true);// means return true
            }
            if(target<matrix[r][c])
            {
                c--;
            }
            else
            {
                r++;
                c=matrix[0].length-1;
            }
        }
        System.out.println(false);// means return false;
    }
}