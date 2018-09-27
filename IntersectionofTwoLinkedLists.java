/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	/*
	//hash solution
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    	if(headA==null || headB == null) return null;


        //treverse node list a into hash
    	Set<ListNode> hashA = new HashSet<>();
    	ListNode curr = headA;
    	while(curr!=null){
    		hashA.add(curr);
    		curr = curr.next;
    	}

		//then traverse through B to find in hash
    	curr = headB;
    	while(curr!=null){
    		if(hashA.contains(curr)){
    			return curr;
    		}
    		curr = curr.next;
    	}

    	return null;
    }
    */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if(headA == null || headB ==null ) return null;

    	ListNode a = headA,b = headB;

    	//works when len a and len b is not the same
    	while(a!=b){

    		a = a ==null? headB : a.next;
    		b = b ==null? headA : b.next;
    	}

    }

}