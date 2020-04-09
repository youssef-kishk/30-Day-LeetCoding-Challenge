class Solution {
    	public  boolean backspaceCompare(String S, String T) {
        S = finalString(S);
        T = finalString(T);
        
        return S.equals(T);
    }
	
	public String finalString(String x) {
		Stack <Character> stac = new Stack();
		StringBuilder op=new StringBuilder();
		for(int i=x.length()-1;i>=0;i--)
			stac.push(x.charAt(i));
		
		
		while(!stac.isEmpty()) {
			if(stac.peek()!='#')
				op.append(stac.pop());
			
			else {
				stac.pop();
				if(op.length()!=0) {
					op.deleteCharAt(op.length()-1);
				}
			}
		}
		return op.toString();
	}
}
