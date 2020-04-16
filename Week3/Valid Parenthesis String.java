class Solution {
    public boolean checkValidString(String s) {
		int low =0;
		int high=0;
		
		for(Character c:s.toCharArray()) {
			if(c=='(') 
				low+=1;
			else
				low-=1;
			
			if(c!=')')
				high+=1;
			else
				high-=1;
			
			if(high<0)
				break;
			low = Math.max(low, 0);
		}
		if(low==0)
			return true;
		return false;
    }
}
