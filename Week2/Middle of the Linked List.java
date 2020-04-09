/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
    	ListNode temp=head;
    	int count=0;
    	while(temp.next!=null){
    		count++;
    		temp=temp.next;
    	}
    	int mid=-1;
    	if(count%2==0)
    		mid=count/2;
    	else
    		mid=(count/2)+1;

    	count=0;
    	while(head!=null){
    		if(mid==count)
    			return head;
    		count++;
    		head=head.next;
    	}
    	return null;
    }
}
