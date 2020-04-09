 public int maxSubArray(int[] nums) {
    	if(nums.length==0)
    		return 0;
    	int maxSum[] = new int[nums.length];
    	maxSum[0]=nums[0];
    	
    	int op = nums[0];
    	for(int i=1;i<nums.length;i++){
    		maxSum[i] = Math.max(nums[i], maxSum[i-1]+nums[i]);
    		if(maxSum[i]>op)
    			op=maxSum[i];
    	}
    	return op;
    }
