/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	 int op = Integer.MIN_VALUE;
	 public int maxPathSum(TreeNode root) {
		 if (root.left == null && root.right == null) return root.val;
		 op = root.val;
		 helper(root);
		 return op;
		 
	   }
	 public int helper(TreeNode node) {
		 if (node.left == null && node.right == null) {
			 op = Math.max(op,node.val);
			 return node.val;
		 }
		 int leftSum = 0;
		 int rightSum = 0;
		 if(node.left != null)
			 leftSum = helper(node.left);
		 if(node.right != null)
			 rightSum = helper(node.right);
		 
		 int sum = Math.max(Math.max(leftSum,rightSum),0) + node.val;
		 op = Math.max(op,Math.max(node.val,Math.max(leftSum + rightSum + node.val,sum)));
		 return sum;
	 }
    
}
