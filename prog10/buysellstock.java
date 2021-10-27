import java.util.*;
class buysellstock {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] prices=new int[6];
        for(int i=0;i<6;i++)
        {
            prices[i]=sc.nextInt();  // [7,1,5,3,6,4]
        }
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int j=0;j<6;j++)
        {
            if(prices[j]<minprice)
            {
                minprice=prices[j];
            }
            else if(prices[j]-minprice>maxprofit)
            {
                maxprofit=prices[j]-minprice;
            }
        }
        System.out.println(maxprofit);// output:5
    }
}