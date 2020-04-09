class Solution {
    public int countElements(int[] arr) {
        HashSet <Integer> set = new HashSet();
        int count=0;
        
        for(int x:arr)
        	set.add(x);
        
        for(int x:arr) {
        	if(set.contains(x+1))
        		count++;
        }
        
        return count;
    }	
}
