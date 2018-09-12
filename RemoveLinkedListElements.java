/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   	/*recursively
   	public ListNode removeElements(ListNode head, int val) {
        
        //if head is null
        if(head==null) return null;
        head.next = removeElements(head.next,val);
        //if head.val is val
        return head == val? head.next:head;
        // if not return the head.next
    }*/

    //iteratively
    public ListNode removeElements(ListNode head, int val) {
        // if empty , []
        if(head == null) return head;

        ListNode res = new ListNode(-1);
        res.next = head;

        //tracking head list
    	ListNode curr = res.next;
    	//tracking res list
    	ListNode prev = res;
   		
        while(curr!=null){
        	if(curr.val == val){
        		prev.next = curr.next;
        	}else{
        		prev.next = curr;
        		prev = prev.next;
        	}
        	curr = curr.next;
        }
        return res.next;
    }
}