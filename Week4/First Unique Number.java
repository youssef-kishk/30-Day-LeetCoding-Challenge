  class FirstUnique {
		ArrayList <Integer> q = new ArrayList();
		HashMap <Integer, Integer> map = new HashMap();
	    public FirstUnique(int[] nums) {
	        for(int x: nums)
	        	append(x);
	    }
	    
	    public int showFirstUnique() {
	    	if(!map.containsValue(1))
	    		return -1;
		     for(int x:q)
		        if(map.get(x)==1)
		        	return x;
		     return -1;
	
	    }
	    
	    public void add(int value) {
	    	append(value);
	    }
	    private void append(int value) {
	    	q.add(value);
	    	if(!map.containsKey(value))
        		map.put(value, 1);
        	else
        		map.put(value,map.get(value)+1);
	    }
	}
