/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// A cycle occurs when a node’s next points back to a previous node in the list. 
// The linked list is no longer linear with a beginning and end—instead, it cycles through a loop of nodes. 
public class Solution {
    public boolean hasCycle(ListNode head) {

        //using Floyd’s Cycle-Finding Algorithm
        //one fast and one slow pointer/node

        ListNode fast = head;
        ListNode slow = head;

        while(slow!=null && fast!=null && fast.next!=null){

            //update
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    /* about 6ms slower than the other aprroach
    public boolean hasCycle(ListNode head) {
        //use hash to go through the list 
        //then if it contain it already using hash.contain if true return true

        if(head == null) return false;
        HashSet<ListNode> s = new HashSet<>();

        while(head!=null){

            if(s.contains(head)) return true;

            s.add(head);
            head = head.next;
        }
        return false;
    }
    */
}