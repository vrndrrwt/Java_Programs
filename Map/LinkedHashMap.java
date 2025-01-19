import java.util.*;

public class LinkedHashMapClass {
  public static void main(String[] args) {
    LinkedHashMap<String, String> cars = new LinkedHashMap<>();
    cars.put("Volvo","Xz");
    cars.put("BMW","vz");
    cars.put("Ford","wZ");
    cars.put("BMW","xx");
    cars.put("Mazda","ww");
    System.out.println(cars);
    for(Map.Entry<String, String> e: cars.entrySet()){
        System.out.println(e);
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
  }
}