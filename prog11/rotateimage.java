class Solution {
    public void rotate(int[][] matrix) {
        //rotate image in place
    
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<matrix[0].length;j++)
            {
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }//transpose of matrix 
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }//reversing the rows
}
}