public int singleNumber(int[] nums) {
	        HashMap <Integer,Integer> map=new HashMap();
	        int op=0;
	        for(int x:nums){
	        	if(!map.containsKey(x)){
	        		map.put(x, 1);
	        		op+=x;
	        	}
	        	else{
	        		op-=x;
	        	}
	        }
	        return op;
	    }
