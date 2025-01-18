import java.util.*;
public class QueueClass{
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(15);
        queue.offer(17);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}