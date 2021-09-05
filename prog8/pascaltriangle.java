import java.util.*;
import java.util.ArrayList;
class pascaltriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numrows=sc.nextInt();
        List<List<Integer>> list1=new ArrayList<>();
        for(int i=0;i<numrows;i++)
        {
        List<Integer> list2=new ArrayList<>();
        for(int j=0;j<=i;j++)
        {
            if(j==0 || j==i)
            {
                list2.add(1);
            }
            else
            {
                list2.add(list1.get(i-1).get(j-1)+list1.get(i-1).get(j));
            }
        }
        list1.add(list2);
        }

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