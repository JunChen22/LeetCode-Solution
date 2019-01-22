import java.util.Stack;
 // Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public void reorderList(ListNode head) {
        if(head == null) return;
        //split it into two parts,
        //with end and mider pointer
        //head , mid ,and end
        ListNode end,mid;
        ListNode curr;

        end = head;
        mid = head;

        //end will move twice
        //mid will move once
        while(end.next!=null && end.next.next!=null){
            end = end.next.next;
            mid = mid.next;
        }
        if(end.next!=null) end = end.next;

        /*
        //put mid to end to stack
        curr = mid.next;
        Stack<ListNode> st = new Stack<>();
        while(curr!=null){
            st.push(curr);
            curr = curr.next;
        }
      //  System.out.println("stack from top down");
        //while(!st.isEmpty()){
          //  System.out.println(st.pop().val);
        //}


        curr = head;
        //join the two part with 1st part and stack.top()
        //if the stack is empty means it's just head
        while(!st.isEmpty()){
            ListNode temp = st.pop();
            temp.next = curr.next;
            curr.next = temp;
            curr = curr.next.next;
        }
        curr.next = null;
        */

        //change from stack to reversed list
        curr = mid.next;
        ListNode prev = null;
        ListNode next = curr.next;
        while(next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }

        System.out.println("at stack replace with reverse list");
        while(curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }

    }
}


class reorder_list{
    public static void main(String[] args){
        System.out.println("yay its working");
        //1->2->3->4->5,
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for(int i = 2; i<= 5; i++){
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        Solution so = new Solution();
        so.reorderList(head);

        curr = head;
        while(curr!=null){
            System.out.print(curr.val +" ");
            curr= curr.next;
        }
    }
}
