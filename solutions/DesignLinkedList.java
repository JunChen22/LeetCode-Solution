class MyLinkedList {

    Node head = null;
    int length = 0;

    class Node{
        int val;
        Node next;
        Node(int num){
            this.val = num;
            this.next = null;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {}
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if(index >= length){
            return -1;
        }

        Node curr = head;
        while(index>0){
            curr = curr.next;
            index--;
        }
        
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val){
        Node nd = new Node(val);
        nd.next = this.head;
        this.head = nd;
        length++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        //no node in list same as add in front
        if(length == 0){
            addAtHead(val);
            return;
        }

        Node curr = head;
        Node nd = new Node(val);

        //loop to end of list
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = nd;
        length++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) { 
    
        //invalid index
        if(index>length){
            return;
        }

        //add at front
        if(index == 0){
            addAtHead(val);
            return;
        }

        //add at tail
        if(index == length){
            addAtTail(val);
            return;
        }


        Node curr = head;
        Node nd = new Node(val);
        while(index>1){
            curr = curr.next;
            index--;
        }
        length++;
        nd.next = curr.next;
        curr.next = nd;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>=length||index<0){
            return;
        }

        Node curr = head;
        while(index>1){
            curr = curr.next;
            index--;
        }
        length--;
        curr.next = curr.next.next;
    }

}

/*
my version of linked list implementations
class MyLinkedList {

    Node head;
    int length;

    class Node{
        int val;
        Node next;
        Node(int num){
            this.val = num;
            this.next = null;
        }
    }


    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if(index >= length){
            return -1;
        }

        Node curr = head;
        while(index>0){
            curr = curr.next;
            index--;
        }
        
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val){
        Node nd = new Node(val);
        nd.next = this.head;
        this.head = nd;
        length++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        //no node in list same as add in front
        if(length == 0){
            addAtHead(val);
            return;
        }

        Node curr = head;
        Node nd = new Node(val);

        //loop to end of list
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = nd;
        length++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) { 
    
        //invalid index
        if(index>length){
            return;
        }

        //add at front
        if(index == 0){
            addAtHead(val);
            return;
        }

        //add at tail
        if(index == length){
            addAtTail(val);
            return;
        }


        Node curr = head;
        Node nd = new Node(val);
        while(index>1){
            curr = curr.next;
            index--;
        }
        length++;
        nd.next = curr.next;
        curr.next = nd;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>=length){
            return;
        }

        Node curr = head;
        while(index>1){
            curr = curr.next;
            index--;
        }
        length--;
        curr.next = curr.next.next;
    }
}
*/
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */