import java.util.*;

public class ArrayDequeClass{
    public static void main(String[] args){
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(11);
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);
    }
}