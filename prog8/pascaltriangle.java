import java.util.*;
import java.util.ArrayList;
class pascaltriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numrows=sc.nextInt();
        List<List<Integer>> list1=new ArrayList<>();//its a list inside a list like a matrix i.e each index of list has list each index in list has rows starting from row 1 ,2,3... and so on
        for(int i=0;i<numrows;i++)// horizontal list i.e outside list i for each row till  n
        {
        List<Integer> list2=new ArrayList<>();
        for(int j=0;j<=i;j++)//inside list vertical i.e. j from 0 to i (i is the n for each row )like elements in a row=n (numrows)
        {
            if(j==0 || j==i) //first and last index of each list is 1
            {
                list2.add(1);//1 is added
            }
            else
            {
                list2.add(list1.get(i-1).get(j-1)+list1.get(i-1).get(j));//i-1 bcuz u reach to next row which comes from previous rows adding adjacent indexes i.e. j & j-1
            }
        }
        list1.add(list2);// list1 will add all the rows one by one after computing it
        }
// printing the 2d list
        for (List<Integer> list : list1) {
            System.out.print("  [");
  
            for (Integer item : list) {
                System.out.print("  "
                                 + item
                                 + ", ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
        sc.close();
    }
    
}