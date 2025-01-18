import java.util.*;

public class TreeSetClass {
  public static void main(String[] args) {
    TreeSet<String> cars = new TreeSet<>();
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