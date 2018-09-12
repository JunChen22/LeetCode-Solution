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
    public class Solution {

        public ListNode detectCycle(ListNode head) {

            if(head == null) return null;
            ListNode fast = head;
            ListNode slow = head;
            boolean isCycle = false;

            //use do while because it will check for some cases
            // such as just one node
            do{

                if(fast.next==null) return null;
                fast = fast.next;
                if(fast.next==null) return null;
                fast = fast.next;
                slow = slow.next;
            }while(slow!=fast);

            //passed through the do while loop means it's a cycle
            
            temp = head;
            while(fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;   
         }
        /*version 2 : still slower 
        //using Floyd’s Cycle-Finding Algorithm
        public ListNode detectCycle(ListNode head) {

            if(head == null) return null;
            ListNode fast = head;
            ListNode slow = head;
            boolean isCycle = false;

            while(fast!=null && fast.next!=null){

                fast = fast.next.next;
                slow = slow.next;

                //found it's a cycle
                //but this node could be in the middle of the cycle
                if(slow == fast){
                    isCycle = true;
                    break;
                };
            }

            if(isCycle){
                fast = head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }
            return null;
        }
        */


        /*slower method and need extra memory using hash here
        public ListNode detectCycle(ListNode head) {
            
            if(head == null) return head;
            HashSet<ListNode> s = new HashSet<>();

            while(head!=null){

                if(s.contains(head)) return head;

                s.add(head);
                head = head.next;
            }
            return null;
        
        }
        */
    }