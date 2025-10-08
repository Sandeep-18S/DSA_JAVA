package searching;

public class stockes {
	public static int buyANDSellStock (int[] prices)
	{
		int buyprice=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<prices.length;i++)
		{
			if(buyprice<prices[i])
			{
				int profit=prices[i]-buyprice;
				maxprofit=Math.max(maxprofit, buyprice);
				
			}
			else
			{
				buyprice=prices[i];
				
			}
		}
		return maxprofit;
		
         	}
			public static void main(String[] args)
			{
				int[] prices = {7,1,4,6,46,7};
				int max= buyANDSellStock(prices);
				System.out.println(max);
		
	}

}
