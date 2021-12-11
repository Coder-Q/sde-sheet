//count subarray xor as k
import java.util.*;
public class subarrxork {
    public int solve(int[] A,int K)
    {
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        int cnt=0;// for keeping the count of subarrays
        int xor=0;//apparently we will take xor as whole array i.e. we will keep it fixed
        int n=A.length;
        for(int i=0;i<n;i++)
        {
            xor=xor^A[i];
            if(freq.get(xor^K)!=null)
            {
                cnt+=freq.get(xor^K);//checking for y count  i.e. xor has been stored in hashmap and will give me the count likewise
            }
            if(xor==K)// if there is no y i.e xor itself will give k
            {
                cnt++;
            }
            if(freq.get(xor)!=null)//we are putting value in map
            {
                freq.put(xor,freq.get(xor)+1);
            }
            else// whole count and checking we are doing simultaneously
            {
                freq.put(xor,1);
            }
        }
        return cnt;
    }
}