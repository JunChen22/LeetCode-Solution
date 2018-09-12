/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

	//delete a node from a singly linked list
	//with given only the deleting node
    public void deleteNode(ListNode node) {
    	//can't deletail due to question 
        if(node.next == null) {
            return;
        } else {
        	//copy next node val and change node next to node next next 
        	//it will just split and garabage collector will take care of that node
        	// sort of like a Y connector
            node.val = node.next.val;
            node.next = node.next.next;
        }
        
    }
}