/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(arr[0]!=root.val)
        	return false;
        return helper(root,arr,0);
        
    }
	public boolean helper(TreeNode root,int[] arr, int i) {
		if(root==null)
			return false;
		if(i>=arr.length)
			return false;
		if(root.left==null&&root.right==null) {
			if(root.val==arr[i]&&i==arr.length-1)
				return true;
			else
				return false;
		}
		if(root.val==arr[i]) {
			if(!helper(root.left,arr,i+1) && !helper(root.right,arr,i+1))
				return false;
			else
				return true;
				
		}
		return false;
	}
}
