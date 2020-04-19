class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums,0,nums.length-1);
        if(pivot==-1)
            return BS(nums,0,nums.length-1,target);
        if(nums[pivot]==target) return pivot;
        
        if(nums[0]<=target) 
        return BS(nums,0,pivot-1,target);
        
        return BS(nums,pivot+1,nums.length-1,target);
	}
    
    public int BS(int[] nums,int low,int high,int target){
        if(high<low) return -1;

        int mid = (low+high)/2;
        if(target==nums[mid]) return mid;

        if(nums[mid]<target) return BS(nums,mid+1,high,target);

        return BS(nums,low,mid-1,target);
    }
    
    public int findPivot(int[] nums,int low,int high){
        if(high<low) return -1;

        if(low==high) return low;

        int mid = (low+high)/2;
        if(mid<high&&nums[mid]>nums[mid+1])
            return mid;
        if(mid>low&&nums[mid]<nums[mid-1])
            return mid-1;

        if(nums[low]>=nums[mid]) return findPivot(nums,low,mid-1);

        return findPivot(nums,mid+1,high);
    }


}
