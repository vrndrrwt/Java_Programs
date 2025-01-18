import java.util.*;

public class HashMapClass {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    TreeMap<String, String> capitalCities = new TreeMap<String, String>();
    // Add keys and values (Country, City)
    
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("England", "London");
    if(!capitalCities.containsKey("Norway")){
        capitalCities.put("Norway", "Oslo");
    }
    for(Map.Entry<String, String> e: capitalCities.entrySet()){
        System.out.println(e);
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    System.out.println(capitalCities);
  }
}