class MinStack {

  	ArrayList<Integer> list;
	int top;
	int min;
	public MinStack() {
	list = new ArrayList();
        top=-1;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        list.add(x);
        top++;
        if(x<min) {
        	min=x;
        }
    }
    
    public void pop() {
        if (!list.isEmpty()) {
        	list.remove(top);
        	top--;
            min=Integer.MAX_VALUE;
        	for(int x:list)
        		if (x<min)
        			min =x;
        }
    }
    
    public int top() {
        return list.get(top);
    }
    
    public int getMin() {
        return min;
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
