/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        

        //even and odd 

        // 123 1221
        //get the middle node of the list
        //currently workds for even list
        //odd will fall out of loop due to second condition
        // even will cuz both but mainly first
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //check if its odd list
        if(fast!=null)slow = slow.next;


        //reversed right side of the list
        slow = reverseList(slow);

        
        //odd , head will have one extra node which dont need test
        // even both condition will fall
        while(slow!=null){
            
            if(head.val!=slow.val){
                return false;
            }
            
            head = head.next;
            slow = slow.next;
        }
        
        return true;
        
    }
    
    //reverse the node
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
       return prev; 
    }
};
