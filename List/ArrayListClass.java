import java.util.*;

public class ArrayListClass{
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        //get set remove add 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,4);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(Integer.valueOf(2));
        System.out.println(list);

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}