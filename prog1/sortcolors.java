import java.util.*;
class sortcolors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int k=0;k<n;k++)
        {
            nums[k]=sc.nextInt();
        }
        int n0=0,n1=0,n2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                n0++;
            }
            if(nums[i]==1)
            {
                n1++;
            }
            if(nums[i]==2)
            {
                n2++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(n0 >0)
            {
                nums[i]=0;
                n0--;
                continue;
            }
            if(n1 >0)
            {
                nums[i]=1;
                n1--;
                continue;
            }
            if(n2 >0)
            {
                nums[i]=2;
                n2--;
                continue;
            }
        }
        sc.close();
        for(int l=0;l<n;l++)
        {
        System.out.print(nums[l]+" ");
        }
    }
}