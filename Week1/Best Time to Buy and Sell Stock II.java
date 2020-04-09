 public int maxProfit(int[] prices) {
	        int op=0;
	        for(int i=1;i<prices.length;i++){
	        	if(prices[i]>prices[i-1])
	        		op+= prices[i]-prices[i-1];
	        }
	        return op;
	    }
