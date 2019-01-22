class MyQueue {


    //s1 is the queue ,s2 is used as temp
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        //use two stack to accomplish this
        //add x to the input then loops through the input stack to add on output

        //if s1 is empty then just add it there
        if(s1.isEmpty()){s1.push(x); return;}

        //move all from s1 to s2 , then adds x to s1 so it's at bottom/last
        //then moves back from s2 to s1
        while(!s1.isEmpty())s2.push(s1.pop());
        s1.push(x);
        while(!s2.isEmpty())s1.push(s2.pop());
        return;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s1.pop();
    }

    /** Get the front element. */
    public int peek() {
        return s1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}
