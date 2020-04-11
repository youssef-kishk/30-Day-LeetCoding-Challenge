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
    int ans=0;
	public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }
	
	public int dfs(TreeNode node){
		if(node==null)
			return 0;
		int L = dfs(node.left);
		int R = dfs(node.right);
		ans = Math.max(ans, L+R);
		return Math.max(L, R)+1;
		
	}
}
