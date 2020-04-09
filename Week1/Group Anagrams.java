class Solution {
      public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> op = new ArrayList();
    	HashMap<String,ArrayList<String>> map = new HashMap();
    	ArrayList<String> sorted = new ArrayList();
    	
    	for(String x:strs) {
    		String temp = sortString(x);
    		sorted.add(temp);
    		
    		if(!map.containsKey(temp))
    			map.put(temp, new ArrayList());
    	}
    	
    	for(int i=0;i<strs.length;i++) {
    		map.get(sorted.get(i)).add(strs[i]);
    	}
    	
    	for(String x:map.keySet())
    		op.add(map.get(x));
    	
    	return op;
    }
    
    public String sortString(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
}
