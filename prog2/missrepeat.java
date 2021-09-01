import java.util.*;
class missrepeat{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int miss=0,rep=0,l=0;
        int[] arr=new int[n];
        int[] ans=new int[3];
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                rep=abs_val;
        }

        // System.out.print("And the missing element is ");
        for (i = 0; i < n; i++) {
            if (arr[i] > 0)
                miss=i+1;
        }
        
        ans[0]=rep;
        ans[1]=miss;
        for(int k=0;k<2;k++)
        {
            System.out.print(ans[k]+" ");
        }
       


    }
}