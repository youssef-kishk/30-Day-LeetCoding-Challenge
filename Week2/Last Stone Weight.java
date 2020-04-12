class Solution {
    public int lastStoneWeight(int[] stones) {
    	Stack <Integer>stack = new Stack();
        Arrays.sort(stones);
        for(int x: stones)
        	stack.push(x);
        int op=0;
        int y=0;
        Stack <Integer>temp = new Stack();
        if(stack.size()==1)
            return stack.pop();
        while(!stack.isEmpty()){
        	  y=stack.pop();
        	  if(stack.peek()!=y){
                y-=stack.pop();
                while(!stack.isEmpty()&&stack.peek()>y)
                    temp.push(stack.pop());
                stack.push(y);
                while(!temp.isEmpty())
                    stack.push(temp.pop());

            }
            else
                stack.pop();
          	if(stack.size()==1)
          		return stack.pop();
        }
        return 0;
    }
}
