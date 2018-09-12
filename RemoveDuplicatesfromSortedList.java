/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return head;

        //1 1 2 3 3
        // 1 1 1
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
        	//if same will skip the node and connect to the next next
        	//currently only works for two repeated

        	//added else only move on till there's no more duplicate
        	if(curr.val == curr.next.val){
        		curr.next = curr.next.next;
        	}else{
        		curr = curr.next;
        	}
        }
        return head;
    }
}