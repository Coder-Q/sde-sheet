import java.util.*;
class duplicate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int j=0;j<n;j++)
        {
            nums[j]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++) //traverse the elements from 0 to n-1 elements
        {
            if(nums[Math.abs(nums[i])]>0) // check for the sign of A[abs(A[i])]; if positive then make it to negative
            {
                nums[Math.abs(nums[i])]= -nums[Math.abs(nums[i])];//changed to negative sign
            }
            else//if negative means it has already been visited once 
            {
                ans=Math.abs(nums[i]);// this element is a repitition
            }
        }
        
        
        
        System.out.println(ans);
    }
}