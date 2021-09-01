import java.util.*;

class maxsubarr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max_curr,max_global=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        max_curr=max_global=nums[0];
        for(int k=1;k<n;k++)
        {
            max_curr=Math.max(nums[k],nums[k]+max_curr);
            if(max_curr>max_global)
            {
                max_global=max_curr;
            }
        }
        System.out.println(max_global);
        sc.close();
    }
}