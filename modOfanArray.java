
import java.util.HashMap;

public class modOfanArray {
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 20, 30, 40, 50, 60, 20, 50, 50};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int elm : arr){
            map.put(elm, map.getOrDefault(elm, 0)+1);
        }

        // loop
        for(Integer elm : map.keySet()){
            System.out.println(elm + " -> " + map.get(elm));
        }


        int maxFreqKey = -1;
        int maxFreqKeyValue = -1;

        for(Integer elm : map.keySet()){
            int currKey = elm;
            int currKeyvalue = map.get(elm);

            if(currKeyvalue > maxFreqKeyValue){
                maxFreqKey = currKey;
                maxFreqKeyValue = currKeyvalue;
            }
        }
        System.out.println("Highest key value pair is or mode is " + maxFreqKey + " -> " + maxFreqKeyValue);
    }
}
