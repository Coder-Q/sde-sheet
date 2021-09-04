import java.util.*;
class setmatrixzeroes {

    static Scanner sc=new Scanner(System.in);
    static int rl=sc.nextInt();
    static int cl=sc.nextInt();
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // int rl=sc.nextInt();
        // int cl=sc.nextInt();
        int[][] matrix=new int[rl][cl];
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> rows_containing_zeroes=new ArrayList<Integer>();//keeping track of row indexes having zeroes in rows
        List<Integer> column_containing_zeroes=new ArrayList<Integer>();//keeping track of column indexes having zeroes in column
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows_containing_zeroes.add(i);
                    column_containing_zeroes.add(j);
                }
            }
        }
        for(int i: rows_containing_zeroes)
        {
            modify_rows(i,matrix);
        }
        for(int j: column_containing_zeroes)
        {
            modify_column(j,matrix);
        }
//print matrix
System.out.println("Final matrix");
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void modify_rows(int i,int[][] matrix)// if u have row index u make all columns in that row as zero
        {
            for(int j=0;j<cl;j++)
            {
                matrix[i][j]=0;
            }
        }
        public static void modify_column(int j,int[][] matrix)// if u have column index u make all rows in that column as zero
        {
            for(int i=0;i<rl;i++)
            {
                matrix[i][j]=0;
            }
        }
}