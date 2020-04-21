/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int n = binaryMatrix.dimensions().get(0);
        int m = binaryMatrix.dimensions().get(1);
        int i = n-1;
        int j = m-1;
        
        while(i>=0 && j>=0) {
        	if(binaryMatrix.get(i,j)==0)
        		i-=1;
        	else
        		j-=1;
        }
        
        if(j==m-1)
        	return -1;
        return j+1;
    }
}
