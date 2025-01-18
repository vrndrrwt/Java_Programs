import java.util.*;

public class LinkedHashSetClass {
  public static void main(String[] args) {
    LinkedHashSet<String> cars = new LinkedHashSet<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    cars.remove("BMW");
    System.out.println(cars);
    System.out.println(cars.contains("Ford"));
    System.out.println(cars.isEmpty());
    System.out.println(cars.size());
    cars.clear();
    System.out.println(cars);
  }
}