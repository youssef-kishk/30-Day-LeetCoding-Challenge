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
	public TreeNode bstFromPreorder(int[] preorder) {
       
        return helper(preorder,0,preorder.length-1);
    }
	
	public TreeNode helper(int[] preorder,int start, int end) {
		if(start > end)
			return null;
		TreeNode node = new TreeNode(preorder[start]);
		int index;
		for(index=start;index<=end;index++)
			if(preorder[index]>node.val)
				break;
		
		node.left = helper(preorder,start+1,index-1);
		node.right = helper(preorder,index,end);
		
		return node;
		
	}
}
