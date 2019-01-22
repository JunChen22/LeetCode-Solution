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
        
        if(head == null){
            return head;
        }
        //dont really need to go through the lis to know 
        // the size of the list

        //could just use two node representing 
        //end(fast) node and mid(slow) node

        ListNode fast = head;
        ListNode slow = head;

        //need to if
        //1.if the fast node is ending(null) 

        //2.if current end node isnt end and if the node after is null
        // cuz the fast node will be skipp the node next 
        // so if the next node is null then cant assign the 
        // node after next to new fast node
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}