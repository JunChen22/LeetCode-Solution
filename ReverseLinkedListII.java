/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int curr = 1;
        
        while(curr < n ){
            
        }
        
    }
    
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
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