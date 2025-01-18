//Stock Buy and Sell
// Best time to buy and sell stock

import java.util.*;

class ArrayEx19{

	//Brute force

	public static int maxProfit(int[] prices){
		int n= prices.length;
		int profit =0;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(prices[j] > prices[i]){
					int cost = prices[j]-prices[i];
					profit = Math.max(profit, cost);
				}
			}
		}

		return profit;
	}

	//optimal
	public static int maxProfit(int[] prices){
		int n = prices.length;
		int mini = prices[0];
		int profit = 0;

		for(int i=1; i<n; i++){
			int cost = prices[i] - mini;
			profit = Math.max(profit, cost);
			mini = Math.min(mini, prices[i]);
		}

		return profit;
	}

	public static void main(String[] args){
		int[] prices = {7,1,3,4,6,5};
		int profit = maxProfit(prices);
		System.out.println(profit);
	}
}
