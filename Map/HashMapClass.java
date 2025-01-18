import java.util.*;

public class HashMapClass {
  public static void main(String[] args) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    hm.put(3,2);
    hm.put(4,5);
    hm.put(5,6);
    hm.put(3,7);
    System.out.println(hm);
  }
}