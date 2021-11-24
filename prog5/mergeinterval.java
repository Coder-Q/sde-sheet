import java.util.*;
class mergeinterval {
    public static void main(String args[])
    {
        //int[][] intervals as input
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged=new LinkedList<>();
        for(int[] interval:intervals)
        {
            if(merged.isEmpty() || merged.getLast()[1]<interval[0])
            {
                merged.add(interval);
            }// if empty directly add  interval
            else
            {
                merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);//check for the merging interval 
            }
        }
        return merged.toArray(new int[merged.size()][]); //convert to 2d array 
    }
}