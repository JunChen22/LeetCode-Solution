/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        
        
        //couldve just use a loop 
        //keep changing the next the other way so 
        // dont even need stack

        ListNode prev = null;
        while(head!=null){

        	//need a node to keep track of next
        	// a node for prev node
        	// then update current node to next

        	ListNode next = head.next;
        	head.next = prev;
        	prev = head;
        	head = next;

        }

        return prev;
        
    }
}