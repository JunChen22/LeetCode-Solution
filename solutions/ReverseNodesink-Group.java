/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null) return null;

        //reverse k # of nodes at a time
       	// if remaining , just left unreverse

    	//divide the list into sections
    	//reserve each sections


    }

    //reverse the node list with start and end 
    public ListNode reverse(ListNode start, ListNode end){

    }

    //reverse numNodes of nodes and return the reversed head
    public ListNode reserve(ListNode head, int numNodes){

    	ListNode prev = null;
    	while(head!=null&&numNodes>0){
    		ListNode next = head.next;
    		head.next = prev;
    		prev = head;
    		head = next;
    		numNodes--;
    	}
    	return prev;

    }
}