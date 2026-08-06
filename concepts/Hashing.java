
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int arrb[] = {10,20,30,50};
        int arra[] = {10,20,20,30,20,30,10,50};
        int count = 0;


        // Hashing the brute force method, it can be used to count occurance of numbers using O(n) times
        for(int i=0; i<arrb.length; i++){
            count = 0;
            for(int j=0; j<arra.length; j++){
                if(arrb[i] == arra[j]){
                    count++;
                }
            }
            System.out.println(arrb[i] + "--> " + count);
        }


        // Using hashing --> HashMap
        int num[] = {10,20,20,30,20,30,10,50};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Counting occurance of the numbers, using brute force
        for(int elm : num){
            if(map.containsKey(elm)){
                map.put(elm, map.get(elm)+1);
            }
            else{
                map.put(elm, 1);
            }
        }

        
        // Using map.getOrDefault() method
        System.out.println("Using getOrDefault()");
        for(int key : num){
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        // Getting the maximum occurance with key
        int maxKey = 0;
        int maxValue = -1;

        // Loop through the map
        System.out.println("Using hashmap");
        for(Integer key : map.keySet()){
            if(map.get(key) > maxValue){
                maxValue = map.get(key);
                maxKey = key;
            }
            System.out.println(key + "--> " + map.get(key));
        }
        System.out.println("Maximum key " + maxKey + " with value " + maxValue);
    }
}
