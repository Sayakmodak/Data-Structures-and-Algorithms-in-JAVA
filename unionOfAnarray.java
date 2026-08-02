// pending
import java.util.ArrayList;

public class unionOfAnarray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 5, 6, 7};

        ArrayList<Integer> sameArr = new ArrayList<>();
        ArrayList<Integer> diffArr = new ArrayList<>();
        // ArrayList<Integer> diffArr2 = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            boolean found = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }

            if(!found){
                diffArr.add(arr1[i]);
            }
        }

        System.out.println(diffArr);
    }
}
