class Solution {
    public String stringShift(String s, int[][] shift) {
        int numOfShifts = shift.length;
        
        for(int i=0;i<numOfShifts;i++) {
        	//left shift
        	if(shift[i][0]==0) 
        		for(int j=0;j<shift[i][1];j++)
        			s = shiftleft(s);
        	else 
        		for(int j=0;j<shift[i][1];j++)
        			s = shiftright(s);
        }
        
        return s;
    }
	
	public  String shiftright(String s) {
	    return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
	}
	public  String shiftleft(String s) {
	    return s.substring(1, s.length())+s.charAt(0);
	}
}
