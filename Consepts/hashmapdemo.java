import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmapdemo {

    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {

        // stores frequency of each number
        HashMap<Integer, Integer> mp = new HashMap<>();
        // stores {number, frequency}
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // count frequency using HashMap
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // build the answer list from the frequency map
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 5, 20 };

        ArrayList<ArrayList<Integer>> ans = countFreq(arr);

        // sort the result in ascending order of the number
        ans.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        for (ArrayList<Integer> x : ans) {
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }
}