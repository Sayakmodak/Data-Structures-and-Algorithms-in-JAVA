import java.util.HashMap;
import java.util.Map;


public class MapInterface{
    public static void main(String[] args){
        Map<String, String> map1 = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();

        // adding the key-value pairs
        map.put("in", "India");
        map.put("us", "United States");
        map.put("br", "Brazil");

        System.out.println("The map interface is " + map);

        // get only the specified value
        System.out.println(map.get("in"));


        map1.put("uk", "United Kingdom");
        map1.put("ger", "Germany");
        map1.put("egt", "Egypt");

        map.putAll(map1);
        System.out.println("After putAll to the map from map1 " + map);

        map.putIfAbsent("sp", "Spain");
        System.out.println("putIfAbsent " + map);

        System.out.println("getOrDefault " + map.getOrDefault("in", "Usa"));
        System.out.println("containsKey " + map.containsKey("in"));
        System.out.println("containsValue " + map.containsValue("India"));

        map.replace("br", "Borozil");
        System.out.println("After replace brazil " + map);

        map1.remove("egt");
        System.out.println("After remove egypt from the map1 " + map1);

        System.out.println("All values " + map.values());
        System.out.println("All keys " + map.keySet());

        System.out.println("Entire entryset " + map.entrySet());

        // Iterating over the map interface
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry + " ");
        }
    }
}