import java.util.Queue;
import java.util.LinkedList;

class testingclass{

    public static void main(String[] args){
        System.out.println("yaya");
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(2);
        q1.add(5);
        q1.add(7);
        Queue<Integer> q2 = new LinkedList<>();
        q2 = q1;

        System.out.println("q1 "+ q1.poll() + "q2 "+ q2.peek() );
    }
}
