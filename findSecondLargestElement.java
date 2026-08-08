
public class findSecondLargestElement {

    public static void main(String[] args) {
        // int arr[] = {10, 10, 10, 10, 10}; // 5 4
        int arr[] = {8, 8, 7, 6, 5}; // 5 4
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        // Now the array is sorted
        int i = n - 1;
        while (i > 0) {
            while (arr[i] != arr[i - 1]) {
                System.out.println(arr[i - 1]);
                i--;
                return;
            }
            i--;
        }
        System.out.println("-1");
    }
}
